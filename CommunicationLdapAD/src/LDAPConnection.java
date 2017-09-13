import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;

public class LDAPConnection {
	
	
	
	private static InitialLdapContext ctx;


	public InitialLdapContext ConnectionLDAP(String ldapServer, String ldapSearchBase) throws NamingException{
	
		final String ldapUsername = "Scripts";
	    final String ldapPassword = "*****";
	    

	    
	    Hashtable<String, Object> env = new Hashtable<String, Object>();
	    env.put(Context.SECURITY_AUTHENTICATION, "simple");
	    if(ldapUsername != null) {
	        env.put(Context.SECURITY_PRINCIPAL, ldapUsername);
	    }
	    if(ldapPassword != null) {
	        env.put(Context.SECURITY_CREDENTIALS, ldapPassword);
	    }
	    env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
	    env.put(Context.PROVIDER_URL, ldapServer);
	    env.put("java.naming.ldap.attributes.binary", "objectSID");
	    
			return ctx = new InitialLdapContext(env, null);
	
			
			
			
	}
	
}
