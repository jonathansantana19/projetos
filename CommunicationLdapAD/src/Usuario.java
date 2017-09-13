import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nomeCompleto;
	private String email;
	private String login;
	private String departamento;
	
	
	private List<String> grupos = new ArrayList<String>();
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public List<String> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<String> grupos) {
		this.grupos = grupos;
	}
	
	
	

}
