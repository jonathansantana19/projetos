import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@SessionScoped
public class Controller implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double valor;
	private List<CID10> lista;
	 private List<CID10> filtro;
	
	 private CID10 cid ;
	
	@PostConstruct
	public void init(){
		cid = new CID10();
		
		valor = 1021.293022222;
		
		lista = new ArrayList<CID10>();
		filtro = new ArrayList<CID10>();
		
		try {
//			lista = new LerXML().Lista();
			
			lista = new LerXML().LerXMLExample();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public String ExcluirMetodo(CID10 obj){
		
		System.out.println("TESE" + obj.getNome());
		
		
		cid.setCodigo(obj.getCodigo());
		cid.setNome(obj.getNome());
		
		return null;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<CID10> getLista() {
		return lista;
	}

	public void setLista(List<CID10> lista) {
		this.lista = lista;
	}


	public List<CID10> getFiltro() {
		return filtro;
	}


	public void setFiltro(List<CID10> filtro) {
		this.filtro = filtro;
	}


	public CID10 getCid() {
		return cid;
	}


	public void setCid(CID10 cid) {
		this.cid = cid;
	}
	
}
