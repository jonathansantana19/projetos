import java.util.Hashtable;

import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchResult;

public class App3 {

	
	public static void main(String[] args) throws NamingException {
		
		LdapAutenticacao ldapAutenticacao = new LdapAutenticacao();
		Usuario usuario = new Usuario();
        
        String ldapAccountToLookup = "santana1.jonathan";
        String password = "*F20j40i61!";
        
//        usuario = ldapAutenticacao.AutenticacaoUser(ldapAccountToLookup);
        
//        System.out.println(usuario.toString());
//        
//        
//        System.out.println("Bem Vindo " + usuario.getNomeCompleto() + "\n" + usuario.getLogin());
        
        
        SearchResult result = ldapAutenticacao.AutenticacaoUser2(ldapAccountToLookup);
        
//        String user = result.getNameInNamespace();
        
        String user = null;
        
      
        Hashtable  authEnv = new Hashtable(11);
        authEnv.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
        authEnv.put(Context.PROVIDER_URL, "LDAP://dc1.services.local:389");
        authEnv.put(Context.SECURITY_AUTHENTICATION, "simple");
        authEnv.put(Context.SECURITY_PRINCIPAL, user );
        authEnv.put(Context.SECURITY_CREDENTIALS, password);
       
        try{ 
           DirContext authContext = new InitialDirContext(authEnv);
           System.err.println("Autenticado!");
           
           
           
        }catch (AuthenticationException authEx){
	        System.out.println("Erro na autenticação! ");
	        authEx.printStackTrace();
        }catch (NamingException namEx){
        System.out.println("Problemas na conexão! ");
        //namEx.getCause().printStackTrace();
        }
        
        
    }
	
}
