import java.security.cert.LDAPCertStoreParameters;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

public class LdapAutenticacao {
	
	
	Usuario user  = new Usuario();
	
	
	public Usuario AutenticacaoUser(String ldapAccountToLookup){
		
		final String ldapServer = "LDAP://dc1.services.local";
		final String ldapSearchBase = "dc=services,dc=local";
		
		LDAPConnection ldapConnection = new LDAPConnection();
		
		try {
			InitialLdapContext ctx = 	ldapConnection.ConnectionLDAP(ldapServer,ldapSearchBase);
			
			if(ctx == null){
				System.out.println("Ocorreu um erro ao comunicar com LDAP");
			}else{
				   //1) lookup the ldap account
		        SearchResult srLdapUser = findAccountByAccountName(ctx, ldapSearchBase, ldapAccountToLookup);
		        
		        if(srLdapUser == null){
		        	System.out.println("Credencias Inválida");
		        	
		        	user = new Usuario();
		        	
		        	
		        	
		        }else{
		        	
		        	 //2) get the SID of the users primary group
		            String primaryGroupSID = getPrimaryGroupSID(srLdapUser);
		            
		            
		            //3) get the users Primary Group
//		            String primaryGroupName = ldap.findGroupBySID(ctx, ldapSearchBase, primaryGroupSID);
//		            System.out.println("USUARIOS" + primaryGroupName);
		            
		            
		        }
			}
			
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
	private String findGroupBySID(InitialLdapContext ctx, String ldapSearchBase, String sid) throws NamingException {
		// TODO Auto-generated method stub
		String searchFilter = "(&(objectClass=group)(objectSid=" + sid + "))";
//		String searchFilter = "(objectClass=group)";
		
//		String searchFilter = "(&(objectCategory=organizationalUnit))";

        SearchControls searchControls = new SearchControls();
        searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
        
        NamingEnumeration<SearchResult> results = ctx.search(ldapSearchBase, searchFilter, searchControls);

        if(results.hasMoreElements()) {
            SearchResult searchResult = (SearchResult) results.nextElement();

            //make sure there is not another item available, there should be only 1 match
            if(results.hasMoreElements()) {
                System.err.println("Matched multiple groups for the group with SID: " + sid);
                
                System.out.println(results.nextElement().toString());
                
                
                return null;
            } else {
            	
            	System.out.println((String)searchResult.getAttributes().get("sAMAccountName").get());
            	
                return (String)searchResult.getAttributes().get("sAMAccountName").get();
            }
        }
        return null;
	}

	private String getPrimaryGroupSID(SearchResult srLdapUser) throws NamingException {
        byte[] objectSID = (byte[])srLdapUser.getAttributes().get("objectSid").get();
        String strPrimaryGroupID = (String)srLdapUser.getAttributes().get("primaryGroupID").get();
        
        String nomeCompleto = srLdapUser.getName().split(",")[0].substring(3);
        user.setNomeCompleto(nomeCompleto.toUpperCase());
        
        String login = (String) srLdapUser.getAttributes().get("sAMAccountName").get();
        user.setLogin(login);
        
        
        String departamento;
        System.out.println(srLdapUser.getAttributes().get("department"));
        if(srLdapUser.getAttributes().get("department") == null){
        	departamento = null;
        }else{
        	departamento =  (String) srLdapUser.getAttributes().get("department").get();
        	user.setDepartamento(departamento);
        }
        
        
        String email = (String) srLdapUser.getAttributes().get("mail").get();
        user.setEmail(email);
        
        
        String groups = srLdapUser.getAttributes().get("memberOf").toString().split(":")[1];
        System.out.println("menbros" + groups.toString());
        
        String campos2[] = groups.split("CN=");
        
        System.out.println("tratato "+ campos2[1]);
        
        List<String> lista = new ArrayList<String>();
        
        for (int i = 1; i < campos2.length; i++) {
			String tratado =  campos2[i].substring(0, campos2[i].indexOf(","));
			
			lista.add(tratado);
			System.out.println(tratado);
			
		}
        
        user.setGrupos(lista);
        String strObjectSid = decodeSID(objectSID);
        
        return strObjectSid.substring(0, strObjectSid.lastIndexOf('-') + 1) + strPrimaryGroupID;
	}

	public SearchResult findAccountByAccountName(LdapContext ctx, String ldapSearchBase, String accountName) throws NamingException {
		// TODO Auto-generated method stub
		String searchFilter = "(&(objectClass=user)(sAMAccountName=" + accountName + "))";
		

        SearchControls searchControls = new SearchControls();
        searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        NamingEnumeration<SearchResult> results = ctx.search(ldapSearchBase, searchFilter, searchControls);

        SearchResult searchResult = null;
        if(results.hasMoreElements()) {
             searchResult = (SearchResult) results.nextElement();

            //make sure there is not another item available, there should be only 1 match
            if(results.hasMoreElements()) {
                System.err.println("Matched multiple users for the accountName: " + accountName);
                return null;
            }
        }
        
        
		return searchResult;
	}
	  public static String decodeSID(byte[] sid) {
	        
	        final StringBuilder strSid = new StringBuilder("S-");

	        // get version
	        final int revision = sid[0];
	        strSid.append(Integer.toString(revision));
	        
	        //next byte is the count of sub-authorities
	        final int countSubAuths = sid[1] & 0xFF;
	        
	        //get the authority
	        long authority = 0;
	        //String rid = "";
	        for(int i = 2; i <= 7; i++) {
	           authority |= ((long)sid[i]) << (8 * (5 - (i - 2)));
	        }
	        strSid.append("-");
	        strSid.append(Long.toHexString(authority));
	        
	        //iterate all the sub-auths
	        int offset = 8;
	        int size = 4; //4 bytes for each sub auth
	        for(int j = 0; j < countSubAuths; j++) {
	            long subAuthority = 0;
	            for(int k = 0; k < size; k++) {
	                subAuthority |= (long)(sid[offset + k] & 0xFF) << (8 * k);
	            }
	            
	            strSid.append("-");
	            strSid.append(subAuthority);
	            
	            offset += size;
	        }
	        
	        return strSid.toString();    
	    }
	  
	  
	  
	  public SearchResult AutenticacaoUser2(String ldapAccountToLookup){
			
			final String ldapServer = "LDAP://dc1.services.local";
			final String ldapSearchBase = "dc=services,dc=local";
			
			LDAPConnection ldapConnection = new LDAPConnection();
			
			try {
				InitialLdapContext ctx = 	ldapConnection.ConnectionLDAP(ldapServer,ldapSearchBase);
				
				if(ctx == null){
					System.out.println("Ocorreu um erro ao comunicar com LDAP");
					
					  return null;
				}else{
					   //1) lookup the ldap account
			        SearchResult srLdapUser = findAccountByAccountName(ctx, ldapSearchBase, ldapAccountToLookup);
			        
			        return findAccountByAccountName(ctx, ldapSearchBase, ldapAccountToLookup);
				}
				
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  return null;
		}
	

}
