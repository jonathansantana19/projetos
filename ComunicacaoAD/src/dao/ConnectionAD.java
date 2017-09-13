package dao;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchResult;

public class ConnectionAD {

	
	
	private DirContext dirContext;
	
	
//	public void conexao(String usuario, String senha) {
//
//		// Configuracao para criar um contexto inicial
//		Hashtable env = new Hashtable();
//		
//		String ldapBaseDN = "dc=far,dc=away,dc=domain";
//		String ldapUserID = "CN=Administrator,CN=Users,DC=ourdomain,DC=com";
//		String ldapCF = "com.sun.jndi.ldap.LdapCtxFactory";
//		
//		String url = "ldap://192.168.210.4:389/";
//		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//		env.put(Context.PROVIDER_URL, url);
//
////		// Autenticacao
//		env.put( Context.INITIAL_CONTEXT_FACTORY, ldapCF );
//		env.put( Context.PROVIDER_URL, url + ldapBaseDN );
//		 env.put( Context.SECURITY_PRINCIPAL, usuario );
//		 env.put( Context.SECURITY_CREDENTIALS, senha );
//		
//		
//		
////		 env.put(Context.SECURITY_AUTHENTICATION, "simple");
////		 env.put(Context.SECURITY_PRINCIPAL, "uid=" + usuario + ",ou=Usuarios,dc=SERVICES.LOCAL,dc=com");
////		 env.put(Context.SECURITY_CREDENTIALS, senha);
//
//		try {
//			// Tenta conectar com o o usuário informado
//			DirContext context = new InitialDirContext(env);
//
//			// Se a autenticação foi bem sucedida, continua a operação, como p.
//			// ex., abrir uma outra janela...
//			// Caso contrário, haverá exceção.
//			// Encerra a conexão com contexto LDAP
//			context.close();
//
//		} catch (NamingException ne) {
//			// Mostra o erro...
//			ne.printStackTrace();
//		}
//	}
	
//	public String Autentica(String IpServer, String User, String Senha)  {
//        String retorno = "";
//        try
//
//        {
//
////            DirectoryEntry objAD = new DirectoryEntry("LDAP://" + IpServer, User, Senha);
////
////            retorno = objAD.Name;
//
//        }
//
//        catch (Exception ex) {
//        	ex.printStackTrace();
//        }
//
//        return retorno;
//
//    }

	
	
//	public void ConnectionAd(String usuario, String senha){
//	
//		Properties properties = new Properties();        
//
//    properties.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
////    properties.put(Context.PROVIDER_URL, "LDAP://" + domainController);
////    properties.put(Context.SECURITY_PRINCIPAL, username + "@" + domainController);
////    properties.put(Context.SECURITY_CREDENTIALS, password);
////    4665
//    properties.put(Context.PROVIDER_URL, "LDAP://" + "192.168.210.3:8080");
//    properties.put(Context.SECURITY_PRINCIPAL, usuario + "@" + "SERVICES.LOCAL");
//    properties.put(Context.SECURITY_CREDENTIALS, senha);
//    
//    
//    //initializing active directory LDAP connection
//    try {
//		dirContext = new InitialDirContext(properties);
//	} catch (NamingException e) {
//		e.printStackTrace();
//	}
//	
//	}
	
	
	
//	public void TestaConexao(String usuario, String senha ){
//		Hashtable env  = new Hashtable(); 
//        String adminName = "CN=Administrator,CN=Users,DC=ANTIPODES,DC=COM"; 
//        String adminPassword = "XXXXXXX"; 
//        String ldapURL = "ldap://mydc.antipodes.com:389"; 
//        env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory"); 
//        //set security credentials, note using simple cleartext authentication 
//        env.put(Context.SECURITY_AUTHENTICATION,"simple"); 
//        env.put(Context.SECURITY_PRINCIPAL,adminName); 
//        env.put(Context.SECURITY_CREDENTIALS,adminPassword); 
//
//        //connect to my domain controller 
//        env.put(Context.PROVIDER_URL,ldapURL); 
//
//        try  { 
//
//            //Create the initial directory  context 
//            LdapContext ctx = new InitialLdapContext(env,null); 
//
//            //Create the search  controls          
//            SearchControls searchCtls = new SearchControls(); 
//
//            //Specify the search scope 
//            searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE); 
//
//            //specify the LDAP search filter  
//            String searchFilter = "(&(objectClass=user)(CN=Andrew Anderson))"; 
//
//            //Specify the Base for the search 
//            String searchBase = "DC=antipodes,DC=com"; 
//
//            //initialize counter to total the group members 
//            int totalResults = 0; 
//
//            //Specify the attributes to return 
//            String returnedAtts[]={"memberOf"}; 
//            searchCtls.setReturningAttributes(returnedAtts); 
//
//            //Search for objects using the filter 
//            NamingEnumeration answer  = ctx.search(searchBase, searchFilter, searchCtls); 
//
//            //Loop through the search results 
//            while (answer.hasMoreElements()) { 
//                SearchResult sr = (SearchResult)answer.next(); 
//
//                System.out.println(">>>" + sr.getName()); 
//
//                //Print out the groups 
//
//                Attributes attrs = sr.getAttributes(); 
//                if (attrs != null) { 
//
//                    try { 
//                        for (NamingEnumeration ae = attrs.getAll();ae.hasMore();) { 
//                            Attribute attr = (Attribute)ae.next(); 
//                            System.out.println("Attribute: " + attr.getID()); 
//                            for (NamingEnumeration e = attr.getAll();e.hasMore();totalResults++) { 
//
//                                System.out.println(" " +  totalResults + ". " +  e.next()); 
//                            } 
//
//                        } 
//
//                    }      
//                    catch  (NamingException e)    { 
//                        System.err.println("Problem listing membership: " + e); 
//                    } 
//
//                } 
//            } 
//
//            System.out.println("Total groups: " + totalResults); 
//            ctx.close(); 
//
//        }  
//
//        catch (NamingException e) { 
//            System.err.println("Problem searching directory: " + e); 
//               } 
//    } 
//	}
	
//	public void ConnectionTeste(String usuario, String senha){
//		//Creating instance of ActiveDirectory
//        ActiveDirectory activeDirectory = new ActiveDirectory(username, password, domain);
//        
//        //Searching
//        NamingEnumeration<SearchResult> result = activeDirectory.searchUser(searchTerm, choice, null);
//        
//        if(result.hasMore()) {
//			SearchResult rs= (SearchResult)result.next();
//			Attributes attrs = rs.getAttributes();
//			String temp = attrs.get("samaccountname").toString();
//			System.out.println("Username	: " + temp.substring(temp.indexOf(":")+1));
//			temp = attrs.get("givenname").toString();
//			System.out.println("Name         : " + temp.substring(temp.indexOf(":")+1));
//			temp = attrs.get("mail").toString();
//			System.out.println("Email ID	: " + temp.substring(temp.indexOf(":")+1));
//			temp = attrs.get("cn").toString();
//			System.out.println("Display Name : " + temp.substring(temp.indexOf(":")+1) + "\n\n"); 
//		} else  {
//			System.out.println("No search result found!");
//		}
//
//		//Closing LDAP Connection
//        activeDirectory.closeLdapConnection();
//	}
	
	
	public void ConnectionTeste(String usuario, String senha){
		//Creating instance of ActiveDirectory
		// Configuracao para criar um contexto inicial
		Hashtable ht = new Hashtable();
		String url = "ldap://dc1.services.local";
		
		ht.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		ht.put(Context.PROVIDER_URL, url);

		// Autenticacao
		ht.put(Context.SECURITY_AUTHENTICATION, "simple");
		ht.put(Context.SECURITY_PRINCIPAL, "uid="+ usuario +",ou=All Users,dc=site,dc=org");
		ht.put(Context.SECURITY_CREDENTIALS, senha);
		try {
			// Tenta conectar com o o usuário informado
			DirContext context = new InitialDirContext(ht);
			

			// Se a autenticação foi bem sucedida, continua a operação, como p. ex., abrir uma outra janela...
			// Caso contrário, haverá exceção.
			// Encerra a conexão com contexto LDAP
			context.close();

			} catch (NamingException ne) {
			// Mostra o erro...
			ne.printStackTrace();
			}
	}
	
}
