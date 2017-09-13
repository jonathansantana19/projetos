import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

@ViewScoped
@ManagedBean (name = "correioMB")
public class ControllerCorreio implements Serializable{

	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Paciente> listaEndereco;
	private Paciente paciente;
	
	
	private String 	enderecoBusca;
	private String cidadeBusca;	
	private String ufBusca;
	
	@PostConstruct
	public void init(){
		
		paciente = new Paciente();
	}
	
	
	public void ListaEndereco(){
		
		System.out.println("chegou");
		listaEndereco = new ArrayList<Paciente>();
		listaEndereco =	new CEP().buscarCEPVersaoDois(this.ufBusca, this.cidadeBusca, this.enderecoBusca);
		
		
	}
	


	public void ConsultaCEP(){
		
		
	
		
	}

	
	public void SelecionarMetodo(Paciente p){
		System.out.println(p.toString() + "ECECUTANDO O METODO DE SELECIONAR");
		
		paciente.setEndereco(p.getEndereco());
		paciente.setBairro(p.getBairro());
		paciente.setCep(p.getCep());
		paciente.setCidade(p.getCidade());
		paciente.setUf(p.getUf());
		
		RequestContext.getCurrentInstance().update("campo-estado campo-cidade campo-bairro  campo-endereco campo-cep");
	}
	
	
	public List<Paciente> getListaEndereco() {
		return listaEndereco;
	}

	public void setListaEndereco(List<Paciente> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public String getEnderecoBusca() {
		return enderecoBusca;
	}


	public void setEnderecoBusca(String enderecoBusca) {
		this.enderecoBusca = enderecoBusca;
	}


	public String getCidadeBusca() {
		return cidadeBusca;
	}


	public void setCidadeBusca(String cidadeBusca) {
		this.cidadeBusca = cidadeBusca;
	}


	public String getUfBusca() {
		return ufBusca;
	}


	public void setUfBusca(String ufBusca) {
		this.ufBusca = ufBusca;
	}


	
	
}
