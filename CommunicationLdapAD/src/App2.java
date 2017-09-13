import java.util.Properties;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

public class App2 {

	static Properties properties;
	public static void main(String[] args) throws NamingException {
		

		    Properties props = new Properties();
		    props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		    props.put(Context.PROVIDER_URL, "LDAP://dc1.services.local");
		    props.put(Context.SECURITY_PRINCIPAL, "Scripts");//adminuser - User with special priviledge, dn user
		    props.put(Context.SECURITY_CREDENTIALS, "*****");//dn user password

		    
		    String username = "santana1.jonathan";
		    
		    InitialDirContext context = new InitialDirContext(props);

		    SearchControls ctrls = new SearchControls();
		    ctrls.setReturningAttributes(new String[] { "givenName", "sn","memberOf" });
		    ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

		    NamingEnumeration<javax.naming.directory.SearchResult> answers = context.search("OU=Operadores,OU=Usuarios,OU=Operacional", "(uid=" + username + ")", ctrls);
		    javax.naming.directory.SearchResult result = answers.nextElement();

		    String user = result.getNameInNamespace();

		    try {
		        props = new Properties();
		        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		        props.put(Context.PROVIDER_URL, "ldap://LDAPSERVER:PORT");
		        props.put(Context.SECURITY_PRINCIPAL, "santana1.jonathan");
		        props.put(Context.SECURITY_CREDENTIALS, "*****");

		   context = new InitialDirContext(props);
		    } catch (Exception e) {
		    }
		}
		
//	}
			
			
			
}
