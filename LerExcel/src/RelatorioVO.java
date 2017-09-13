import java.sql.Date;


public class RelatorioVO {

	
	private String ilha;
	private String operador;
	private String nome;
	private String supervisor;
	private String cpf;
	private String tabulacao;
	private java.util.Date data;
	private java.util.Date hora;
	private String status;
	private String status2;
	private java.util.Date tmo;
	private String telefone;
	private String email;
	private String produto;
	private int digital;
	
	
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getIlha() {
		return ilha;
	}
	public void setIlha(String ilha) {
		this.ilha = ilha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public String getTabulacao() {
		return tabulacao;
	}
	public void setTabulacao(String tabulacao) {
		this.tabulacao = tabulacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus2() {
		return status2;
	}
	public void setStatus2(String status2) {
		this.status2 = status2;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getDigital() {
		return digital;
	}
	public void setDigital(int digital) {
		this.digital = digital;
	}
	
	
	
	
	public java.util.Date getHora() {
		return hora;
	}
	public void setHora(java.util.Date hora) {
		this.hora = hora;
	}
	public java.util.Date getTmo() {
		return tmo;
	}
	public void setTmo(java.util.Date tmo) {
		this.tmo = tmo;
	}
	public java.util.Date getData() {
		return data;
	}
	public void setData(java.util.Date data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "RelatorioVO [ilha=" + ilha + ", operador=" + operador
				+ ", nome=" + nome + ", supervisor=" + supervisor + ", cpf="
				+ cpf + ", tabulacao=" + tabulacao + ", data=" + data
				+ ", hora=" + hora + ", status=" + status + ", status2="
				+ status2 + ", tmo=" + tmo + ", telefone=" + telefone
				+ ", email=" + email + ", produto=" + produto + ", digital="
				+ digital + "]";
	}
	
}
