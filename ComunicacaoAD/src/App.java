import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.LdapContext;

import com.novell.ldap.LDAPConnection;

//import java.io.UnsupportedEncodingException;
//import java.sql.SQLException;
//
//
//
//
//
//
//
//
//
//
//import java.util.Enumeration;
//import java.util.Iterator;
//
//import org.apache.directory.ldap.client.api.LdapConnection;
//import org.ietf.ldap.LDAPAttributeSet;
//import org.ietf.ldap.LDAPConnection;
//import org.ietf.ldap.LDAPEntry;
//import org.ietf.ldap.LDAPException;
//import org.ietf.ldap.LDAPSearchResults;
//
//
//
//
//import com.novell.ldap.*;
//import com.novell.ldap.util.Base64;
//
//import dao.ConnectionAD;
//
//
//
//
public class App {

	
	
	public static void main(String[] args) {
//		
//		ConnectionAD con = new ConnectionAD();
//		
		System.out.println("******************Iniciando __**********************************");
		
		
		System.out.println("******************Login Senha**********************************");
//		
		String domain = "SERVICES.LOCAL";
		String user = "santana1.jonathan";
		String senha = "*F20j40i60!";
		
		
        
		
//		 try {
//			 
//			 
//			 	int ldapVersion = LDAPConnection.LDAP_V3;
//			 	System.out.println(ldapVersion);
//			 	
//		        int ldapPort = LDAPConnection.DEFAULT_PORT;
//		        String ldapHost = "LDAP://dc1.services.local";
//		        
//		        
//		        
//		     // --> conectar no banco
//		        LDAPConnection conn = new LDAPConnection();
//		        
//		        conn.bind(ldapVersion , user , senha.getBytes());  
//		        
////		        "LDAP://dc1.services.local/OU=Operadores,OU=Usuarios,OU=Operacional,OU=" + Empresa + ",DC=services,dc=local"
//		        
//		        
//		        
//		        
//		        
//		        
//		        
		        
//		        String loginDN = "CN=santana1.jonathan,OU=Inf,DC=int,DC=services,DC=com,DC=br";
////		        String loginDN = "OU=Operadores,OU=Usuarios,OU=Operacional,OU=" + "SERVICES" + ",DC=services,dc=local";
////		        String ldapHost = "LDAP://dc1.services.local/OU=Operadores,OU=Usuarios,OU=Operacional,DC=services,dc=local";
//		        
//		        
//		        String ldapHost = "dc1.services.local";
////		        String loginDN = "CN=santana1.jonathan,OU=Inf,DC=int,DC=SERVICES.LOCAL,DC=com,DC=br";
////		        String loginDN = "OU=Operadores,OU=Usuarios,OU=Operacional,OU=" + "SERVICES" + ",DC=services,dc=local";
//		        
//		        
//		        
////		        String loginDN = user;
//		        String password = senha;
//		        // --> conectar no banco
//		        LDAPConnection conn = new LDAPConnection();
//		        
//		        try {
//					conn.connect(ldapHost, ldapPort);
//					conn.bind(ldapVersion, loginDN, password.getBytes("UTF8"));
//		        } catch (LDAPException e) {
//		        	e.printStackTrace();
//				} catch (UnsupportedEncodingException e) {
//					e.printStackTrace();
//				}
//		        
//		     // --> realiza a pesquisa
//		        
//		        
//		        
//		        
//				try {
//					LDAPSearchResults searchResults = 
//		                	 conn.search("OU=Supt,DC=int,DC=novamerica,DC=SERVICES.LOCAL,DC=br",
//		                			 LDAPConnection.SCOPE_ONE,
//		                			 "(objectclass=user)",
//		                			 null,
//		                			 false);
//		            while (searchResults.hasMore()) {
//		            	LDAPEntry nextEntry = null;
//		                try {
//		                	nextEntry = searchResults.next();
//		                } catch(LDAPException e) {
//		                	System.out.println("Error: " + e.toString());
//		                	if (e.getResultCode() == LDAPException.LDAP_TIMEOUT || e.getResultCode() == LDAPException.CONNECT_ERROR)
//		                		break;
//		                	else
//		                		continue;
//		                }
//		                System.out.println("DN -> "+nextEntry.getDN());
//		                LDAPAttributeSet attributeSet = nextEntry.getAttributeSet();
//		                Iterator allAttributes = attributeSet.iterator();
//		                while (allAttributes.hasNext()) {
//		                	LDAPAttribute attribute = (LDAPAttribute)allAttributes.next();
//		                    String attributeName = attribute.getName();
//		                    Enumeration allValues = attribute.getStringValues();
//		                    if (allValues != null) {
//		                    	while (allValues.hasMoreElements()) {
//		                    		String Value = (String) allValues.nextElement();
//		                            if (Base64.isLDIFSafe(Value)) {
//		                                System.out.println(attributeName +" -> "+ Value);
//		                            } else {
//		                            	Value = Base64.encode(Value.getBytes());
//		                            	System.out.println(attributeName +" -> "+ Value);
//		                            }
//		                    	}
//		                    }
//		                }
//		                System.out.println("\n");
//		            }
//		            // --> Desconecta
//		            conn.disconnect();
//				} catch( LDAPException e ) {
//					System.out.println( "Error: " + e.toString() );
//				}
//			
//		} catch (Exception ex) {
//			// TODO: handle exception
//			ex.printStackTrace();
//		}
//		
////		con.ConnectionTeste("santana1.jonathan@gruposervices.com.br", "*F20j40i60!");
//				 
//		
//		
////		con.Autentica("192.168.11.4:5563", "santana1.jonathan", "*F20j40i60!");
//		
////		con.ConnectionAd("santana1.jonathan", "*F20j40i60!");
//		
//		
//	}
//	
//	
}
}	
