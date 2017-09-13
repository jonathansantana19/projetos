import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
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

public class LerXMLPrevisao {
	
	
	
	private static File file = new File("http://servicos.cptec.inpe.br/XML/cidade/1972/previsao.xml");
	
	
	
	public static void main(String[] args) throws Exception {
//		Lista();
//		LerXMLExample();
		Url();
	}
	
	
	public static List<CID10> LerXMLExample() throws SAXException, IOException, ParserConfigurationException, JDOMException{
		
		 //objetos para construir e fazer a leitura do documento
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        
        Document doc = builder.parse(file);
        
        //cria uma lista de pessoas. Busca no documento todas as tag pessoa
        NodeList listaItens = doc.getElementsByTagName("cidade");
        
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
	
	
	public static void Url() throws IOException{
		URL url = null;
		try {
//			url = new URL("http://servicos.cptec.inpe.br/XML/cidade/1972/previsao.xml");
			url = new URL("http://rss.home.uol.com.br/index.xml");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}    
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}    
		String xml = "";
			for(String linha = "";(linha = reader.readLine()) != null;xml+=linha)   { 
//				reader.close();    
			}
	    /*XStream xstream = new XStream();*/
		reader.close();  
	}
	
	
}
