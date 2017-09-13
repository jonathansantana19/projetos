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
