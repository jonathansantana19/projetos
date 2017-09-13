import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.LdapContext;

public class App {
	
	
	private static Hashtable<String, String> ambiente;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ambiente = new Hashtable<String, String>();
		ambiente.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		ambiente.put(Context.PROVIDER_URL, "ldap://services.local:389");
		ambiente.put(Context.SECURITY_AUTHENTICATION, "simple");
		ambiente.put(Context.SECURITY_PRINCIPAL, "**");
		ambiente.put(Context.SECURITY_CREDENTIALS, ***");
		
		
		  try {
			DirContext context = new InitialDirContext(ambiente);
			 System.out.println("Connected..");
	            System.out.println(context.getEnvironment());
	            
	            
//	            AutenticationLdap();
	            
	            
	            
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
//	public static void AutenticationLdap(){
//		
//		
//		Hashtable<String, String>  authEnv = new Hashtable<String, String>(11);
//        authEnv.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//        authEnv.put(Context.PROVIDER_URL, "ldap://dc1.services.local:389");
//        authEnv.put(Context.SECURITY_PRINCIPAL, "cn=service/santana1.jonathan,dc=services,dc=local");
//        authEnv.put(Context.SECURITY_CREDENTIALS, "***");
//		
//        try {
//			DirContext authContext = new InitialDirContext(authEnv);
//			
////			SERVICES/USER
//			
//			 System.out.println(authContext.lookup("ou=NewHires"));
//			
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	
	
	

}
