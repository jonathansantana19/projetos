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
			String password = "";
		
		
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
		
	        


		    try{

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
	
	
