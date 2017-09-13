//
//import java.io.UnsupportedEncodingException;
//import java.util.Enumeration;
//import java.util.HashMap;
//import java.util.Hashtable;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Properties;
//
//import javax.naming.Context;
//import javax.naming.NamingEnumeration;
//import javax.naming.NamingException;
//import javax.naming.directory.Attribute;
//import javax.naming.directory.Attributes;
//import javax.naming.directory.DirContext;
//import javax.naming.directory.InitialDirContext;
//import javax.naming.directory.SearchControls;
//import javax.naming.directory.SearchResult;
//import javax.naming.ldap.InitialLdapContext;
//import javax.naming.ldap.LdapContext;
//
//import org.apache.directory.ldap.client.api.LdapConnection;
//import org.ietf.ldap.LDAPConnection;
//import org.ietf.ldap.LDAPException;
//import org.ietf.ldap.LDAPSearchResults;
//
//import com.novell.ldap.LDAPAttribute;
//import com.novell.ldap.LDAPAttributeSet;
//import com.novell.ldap.LDAPEntry;
//import com.novell.ldap.util.Base64;
//
//
//public class App2 {
//
//	
//	public static void main(String[] args) throws NamingException, LDAPException {
//		System.out.println("--------INICIANDO =--------------");
//		
//		
//		
//		String usuario = "santana1.jonathan";
//		String senha = "*F20j40i60!";
////		
////		LDAPConnection conn = new LDAPConnection();  
////		
////		int porta = com.novell.ldap.LDAPConnection.DEFAULT_PORT;
////	    
////		conn.connect("dc1.services.local", porta); //Esses dois parametros são servidor (IP ou Nome) e a porta de conexão 
////		
////		int ldapVersion = com.novell.ldap.LDAPConnection.LDAP_V3;
////		
////		
////		conn.bind(ldapVersion , usuario , senha.getBytes());  
////		
////		LDAPAttributeSet attributes = new LDAPAttributeSet();//Um Set de atributos para o servidor, funciona no formato chave => valor. 
////		
////		LDAPSearchResults search = conn.search("OU=Operadores,OU=Usuarios,OU=Operacional", LDAPConnection.SCOPE_ONE, null, null, false);
////		
////		while(search.hasMore()){//Auto explicativo  
////			  
////		    org.ietf.ldap.LDAPEntry entry = search.next();//Recuperamos a entidade. Cada uma dessas entidades é um usuário do servidor LDAP.  
////		  
////		    //Vamos carregar e imprimir os atributos desse usuário  
////		  
////		    org.ietf.ldap.LDAPAttributeSet attribute = entry.getAttributeSet();  
////		  
////		    Iterator it = attribute.iterator();  
////		  
////		    while(it.hasNext()){  
////		  
////		        LDAPAttribute att = (LDAPAttribute) it.next();  
////		  
////		        System.out.println(att.getName() + " > " + att.getStringValue());  
////		  
////		    }  
////		  
////		    System.out.println();  
////		  
////		}  
//		 int ldapPort = LDAPConnection.DEFAULT_PORT;
//
//	        int searchScope = LDAPConnection.SCOPE_ONE;
//
//	        int ldapVersion  =  com.novell.ldap.LDAPConnection.LDAP_V3;
//
//	        String ldapHost = "LDAP://dc1.services.local";
//
//	        String loginDN  = "santana1.jonathan";
//
//	        String password = "*F20j40i60!";
//
//	        String searchBase = "";
//
//	        String searchFilter = "";
//
//	        LDAPConnection lc = new LDAPConnection();
//
//
//	        try {
//	           // connect to the server
//	            lc.connect( ldapHost, ldapPort );
//	           // bind to the server
//	            lc.bind( ldapVersion, loginDN, password.getBytes("UTF8") );
//
//
//	            LDAPSearchResults searchResults =
//
//	                lc.search(  searchBase,
//
//	                            searchScope,
//
//	                            searchFilter,
//
//	                            null,         // return all attributes
//
//
//	                            false);       // return attrs and values
//
//
//
//
//	            /* To print out the search results,
//
//	             *   -- The first while loop goes through all the entries
//
//	             *   -- The second while loop goes through all the attributes
//
//	             *   -- The third while loop goes through all the attribute values
//
//	             */
//
//	            while ( searchResults.hasMore()) {
//
//	                org.ietf.ldap.LDAPEntry nextEntry = null;
//
//	                try {
//
//	                    nextEntry =  searchResults.next();
//
//	                }
//
//	                catch(LDAPException e) {
//
//	                    System.out.println("Error: " + e.toString());
//
//
//
//	                   // Exception is thrown, go for next entry
//
//
//	                    if(e.getResultCode() == LDAPException.LDAP_TIMEOUT || e.getResultCode() == LDAPException.CONNECT_ERROR)
//
//	                       break;
//
//	                    else
//
//	                       continue;
//
//	                }
//
//
//
//	                System.out.println("\n" + nextEntry.getDN());
//
//	                System.out.println("  Attributes: ");
//
//
//
//	                org.ietf.ldap.LDAPAttributeSet attributeSet = nextEntry.getAttributeSet();
//
//	                Iterator allAttributes = attributeSet.iterator();
//
//
//
//	                while(allAttributes.hasNext()) {
//
//	                    LDAPAttribute attribute =
//
//	                                (LDAPAttribute)allAttributes.next();
//
//	                    String attributeName = attribute.getName();
//
//
//
//	                    System.out.println("    " + attributeName);
//
//
//
//	                    Enumeration allValues = attribute.getStringValues();
//
//
//
//	                    if( allValues != null) {
//
//	                        while(allValues.hasMoreElements()) {
//
//	                            String Value = (String) allValues.nextElement();
//
//	                            if (Base64.isLDIFSafe(Value)) {
//
//	                               // is printable
//
//
//	                                System.out.println("      " + Value);
//
//	                            }
//
//	                            else {
//
//	                               // base64 encode and then print out
//
//
//	                                Value = Base64.encode(Value.getBytes());
//
//	                                System.out.println("      " + Value);
//
//	                            }
//
//	                        }
//
//	                    }
//
//	                }
//
//	            }
//
//	           // disconnect with the server
//
//
//	            lc.disconnect();
//
//	        }
//
//	        catch( LDAPException e ) {
//
//	            System.out.println( "Error: " + e.toString() );
//
//	        }
//
//	        catch( UnsupportedEncodingException e ) {
//
//	            System.out.println( "Error: " + e.toString() );
//
//	        }
//
//	        System.exit(0);
//
//}
//}