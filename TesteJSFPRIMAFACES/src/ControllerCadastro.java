import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import org.primefaces.context.RequestContext;

@ManagedBean
public class ControllerCadastro implements Serializable{

	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;

	public void AdicionaContato(){
		System.out.println("chegou" + this.nome);
		
		RequestContext.getCurrentInstance().execute("$('#myModal').modal('hide');");
//		 onclick=""
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
