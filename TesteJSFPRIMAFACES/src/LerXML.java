import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.Attribute;
import org.jdom2.Content;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;

public class LerXML {
	
	
	
	private static File file = new File("C:\\startcode\\Listas.xml");
	
	
	
	
	
	public static List<CID10> Lista() throws Exception{
//      SAXBuilder sb = new SAXBuilder();        
//      Document d = sb.build(f);            
//      Element mural = d.getRootElement();               
//      List elements = mural.getChildren();    
//      Iterator i = elements.iterator();              
//      while (i.hasNext()) {    
//         Element element = (Element) i.next();                
//         List nome1 =  element.getAttributes();            
//         System.out.println(nome1);            
//      } 
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		//Informamos qual arquivo xml vamos ler
		Document doc = db.parse(new InputSource(file.toString()));
		//Criamos um objeto Element que vai receber as informacoes de doc
		Element raiz = doc.getDocumentElement();

		//Vamos criar um objeto Endereco
		CID10 cid = new CID10();
		
		//Informamos qual tag vamos ler
		NodeList endList = raiz.getElementsByTagName("lista");
		Element endElement = (Element) endList.item(0);
		
		
		//Passamos para o metodo getChildTagValue a tag Pai que
		//iremos ler mais qual tag Filha ser&aacute; capturada
		
		
//		NodeList nome = raiz.getElementsByTagName("nome");
//		NodeList codigos = raiz.getElementsByTagName("codigos");
		
		
		
//		cid.setCodigo(getChildTagValue(endElement, "codigos"));
//		cid.setNome(getChildTagValue(endElement, "nome"));

//		//Vamos criar uma colecao de Telefones ja que
//		// temos mais de um Telefone a capturar
		
		List<CID10> lista = new ArrayList<CID10>();
		NodeList CidList = raiz.getElementsByTagName("item");
		Element foneElement;
		//Fazemos um for nas tags Telefone e adicionamos os dados
		//  em um objeto Telefone e depois na colecao
		for (int i = 0; i < CidList.getLength(); i++) {
			foneElement = (Element) CidList.item(i);
			CID10 obj = new CID10();
			obj.setCodigo(getChildTagValue(endElement, "codigos"));
			obj.setNome(getChildTagValue(endElement, "nome"));
			lista.add(obj);
		}
		
		
		System.out.println(lista.toString());
		System.out.println(lista.size());
		return lista;
		
//		//Agora iremos ler os dados de Contato
//		//Como esses dados estao apenas dentro
//		// da tag Contato e de mais nenhuma outra
//		// vamos entao usar o elemento raiz
//		Contato contato = new Contato();
//		contato.setId(Integer.parseInt(getChildTagValue(raiz, "id")));
//		contato.setNome(getChildTagValue(raiz, "nome"));
//		contato.setEmail(getChildTagValue(raiz, "email"));
//
//		//Agora vamos inserir em contato os objetos telefones e endereco
//		contato.setEndereco(endereco);
//		contato.setTelefones(telefones);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
//		Lista();
		LerXMLExample();
	}
	
	
	public static List<CID10> LerXMLExample() throws SAXException, IOException, ParserConfigurationException, JDOMException{
		
		 //objetos para construir e fazer a leitura do documento
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        
        Document doc = builder.parse(file);
        
        //cria uma lista de pessoas. Busca no documento todas as tag pessoa
        NodeList listaItens = doc.getElementsByTagName("item");
        
        List<CID10> lista = new ArrayList<CID10>();
        
        for (int i = 0; i < listaItens.getLength(); i++) {
        	
        	 //pego cada item (pessoa) como um nó (node)
            Node noItem = listaItens.item(i);
        	

            
        	if(noItem.getNodeType() == Node.ELEMENT_NODE){
        		//caso seja um element, converto o no Pessoa em Element pessoa
                Element elementItem = (Element) noItem;
                
                
                //já posso pegar o atributo do element
                String id = elementItem.getAttribute("seq");
                
                //imprimindo o id
                System.out.println("ITEM SEQ = " + id); 
                
                NodeList listaItensFilho = elementItem.getChildNodes();
                CID10 cid = new CID10();
                for (int j = 0; j < listaItensFilho.getLength(); j++) {
                	
                	  //crio um no com o cada tag filho
                	  Node noFilho = listaItensFilho.item(j);
                	  
                	  if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                		  
                		  
                		  Element elementoFilho = (Element) noFilho;
                		  
                		  switch(elementoFilho.getTagName()){
                          case "nome":
                        	 
                        	  cid.setNome(elementoFilho.getTextContent());
                        	  System.out.println("NOME = " +  cid.getNome()); 
                              
                        	  
                        	  break;
                		  
                          case "codigos":
                        	 
                        	  cid.setCodigo(elementoFilho.getTextContent());
                        	  System.out.println("codigo = " +   cid.getCodigo()); 
                        	  
                          break;
                		  }
                	  } 
                	}
					lista.add(cid);
				}
        	}
        
        return lista;
        }	
		

	public static String getChildTagValue(Element elem, String tagName) throws Exception {
		NodeList children = elem.getElementsByTagName(tagName);
		String result = null;
		 //children, a tag pai que estamos lendo,
		 // por exemplo a tag <Endereco>
		if (children == null) {
			return result;
		}
		 //child, a tag que queremos recuperar o valor, por exemplo
		 //a tag <cidade>
		Element child = (Element) children.item(0);

		if (child == null) {
			return result;
		}
		 //recuperamos o texto contido na tagName   
		result = child.getTextContent();

		return result;
	}
	
	
	
	
}
