import java.util.Properties;

import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;


public class App4 {

	   private static Properties properties;
	    private static DirContext dirContext;
	    private SearchControls searchCtls;
		private String[] returnAttributes = { "sAMAccountName", "givenName", "cn", "mail" };
	    private String domainBase;
	    private String baseFilter = "(&((&(objectCategory=Person)(objectClass=User)))";
	
	public static void main(String[] args) {
		
		System.out.println("--------------- Iniciando metodo------------------------------");
		
		
			String matricula = "santana1.jonathan";
			String password = "*F20j40i60!";
		
		
		  properties = new Properties();        

	        properties.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
	        properties.put(Context.PROVIDER_URL, "LDAP://dc1.services.local");
	        properties.put(Context.SECURITY_PRINCIPAL, "dc=services,dc=net,dc=br");
	        properties.put(Context.SECURITY_AUTHENTICATION, "simple");
	        
	        System.out.println("--------------- >Obtendo informações LDAP");    
	        
//	        String securityPrincipal = "cn=" + matricula + "OU=Operadores,OU=Usuarios,OU=Operacional,OU= reavalservices ,DC=services,dc=loca";
	        //initializing active directory LDAP connection
	        try {
				dirContext = new InitialDirContext(properties);
				System.out.println("--------------- > Conectado com o LDAP");
				
			} catch (NamingException e) {
				System.out.println(e.getMessage());
			}
		
	        
//	    	String matricula = "santana1.jonathan";
//			String password = "*F20j40i60!";
//		
//			// set the LDAP authentication method
//		    String auth_method  = "simple";
//		    // set the LDAP client Version
//		    String ldap_version = "3";
//		    // This is our LDAP Server's IP
//		    String ldap_host    = "dc1.services.local";
//		    // This is our LDAP Server's Port
//		    String ldap_port    = "389";
//		    // This is our access ID
//		    String ldap_dn      =  matricula;
//		   // This is our access PW
//		    String ldap_pw      =  password;
//		    // This is our base DN
		    String base_dn      = "dc=services,dc=local";
//
//		    DirContext ctx      = null;
//		    Hashtable env       = new Hashtable();
//
//		    // Here we store the returned LDAP object data
//		    String dn           = "";
//		    // This will hold the returned attribute list
//		    Attributes attrs;
//
//		    env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
//		    env.put(Context.PROVIDER_URL,"ldap://" + ldap_host + ":" + ldap_port);
//		    env.put(Context.SECURITY_AUTHENTICATION, auth_method);
//		    env.put(Context.SECURITY_PRINCIPAL, ldap_dn);
//		    env.put(Context.SECURITY_CREDENTIALS, ldap_pw);
//		    env.put("java.naming.ldap.version", ldap_version);

		    try{
//		      System.out.println("Connecting to host " + ldap_host + " at port " + ldap_port + "...");
//		      System.out.println();

//		      d = new InitialDirContext(env);
		      System.out.println("LDAP authentication successful!");

		      // Specify the attribute list to be returned
		      String[] attrIDs = { "memberOf" };

		      SearchControls ctls = new SearchControls();
		      ctls.setReturningAttributes(attrIDs);
		      ctls.setSearchScope(SearchControls.SUBTREE_SCOPE);

		      // Specify the search filter to match
//		      String filter = "(&(objectClass=user)(sAMAccountName=santana1.jonathan))";
		      String filter = "(sAMAccountName=santana1.jonathan)";

		      // Search the subtree for objects using the given filter
		      NamingEnumeration answer = dirContext.search(base_dn, filter, ctls);

		      // Print the answer
		      //Search.printSearchEnumeration(answer);

//		      while (answer.hasMoreElements()) {
//		        SearchResult sr = (SearchResult)answer.next();
//		        dn = sr.getName();
//		        attrs = sr.getAttributes();
//
//		        System.out.println("Found Object: " + dn + "," + base_dn);
//		        if (attrs != null) {
//		          // we have some attributes for this object
//		          NamingEnumeration ae = attrs.getAll();
//		          while (ae.hasMoreElements()) {
//		            Attribute attr = (Attribute)ae.next();
//		            String attrId = attr.getID();
//		            System.out.println("Found Attribute: " + attrId);
//		            Enumeration vals = attr.getAll();
//		            while (vals.hasMoreElements()) {
//		              String attr_val = (String)vals.nextElement();
//		              System.out.println(attrId + ": " + attr_val);
//		            }
//		          }
//		        }
//		     }

		      // Close the context when we're done
		      dirContext.close();
		    } catch (AuthenticationException authEx) {
		      authEx.printStackTrace();
		      System.out.println("LDAP authentication failed!");
		    } catch (NamingException namEx) {
		      System.out.println("LDAP connection failed!");
		      namEx.printStackTrace();
		    } catch (Exception e) {
		      e.printStackTrace();
		   }
		  }
	   
				
	        
		
	}
	
	
