import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

@ViewScoped
@ManagedBean
public class ControllerPagamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> lista;
	
	private double total;
	private double valorPago;
	private double troco;
	
	@PostConstruct
	public void init(){
		lista = new ArrayList<String>();
		
		
		lista.add("222");
		
	}
	
	
	public void CalculaTotal(){
		this.troco = this.valorPago - this.total;
		
		
		if(this.total > this.valorPago  ){
			RequestContext.getCurrentInstance().execute("$('#myForm').validator()");
			RequestContext.getCurrentInstance().execute("mensagem");
		}
		
		
	}

	
	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public double getValorPago() {
		return valorPago;
	}


	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}


	public double getTroco() {
		return troco;
	}


	public void setTroco(double troco) {
		this.troco = troco;
	}


	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}
	

}
