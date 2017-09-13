package bean;

public class InfoVO {
	
	
	private String campanha; //Nome da Campanha
	private String dataExport; //DD/MM/AAAA
	private String dataVigencia; //DD/MM/AAAA
	private String nomeCliente; //Nome do cliente
	private String registroCliente; //Registro no cliente na SKY
	private String numCPF; //Numero do CPF
	private String tel1; //DDD + “ ” + TELEFONE
	private String tel2; //DDD + “ ” + TELEFONE
	private String tel3; //DDD + “ ” + TELEFONE
	private String tel4; //DDD + “ ” + TELEFONE
	private String tel5; //DDD + “ ” + TELEFONE
	private String tel6; //DDD + “ ” + TELEFONE
	private String tel7; //DDD + “ ” + TELEFONE
	private String tel8; //DDD + “ ” + TELEFONE
	private String tel9; //DDD + “ ” + TELEFONE
	private String tel10; //DDD + “ ” + TELEFONE
	private String segmentoPacote; // Descrição do pacpte
	private String priMotivo; // Descrição do pacpte
	private String ultMotivo;
	private String dataCancelamento;  //DD/MM/AAAA
	private String dataSolicitacao; //DD/MM/AAAA
	private String cidade;
	private String uf;
	private String dataInstalacao;
	private String formaPagamento; //MOP = Cartão, Débito em Conta ou Boleto
	private String flagScob; // Se esta em régua de cobrança
	private String flagFidelidade; //Fidelidade - se o cliente possui menos de 12 meses de SKY
	private String score; // 0 A 99
	private String atritado; //   1 = ATRITADO 0 = NÃO ATRITADO
	private String reincidente; //1 = REINCIDENTE 0 = NÃO REINCIDENTE 
	private String quartis; //0 = 1º OU 2º / QUARTIL 3 = 3º / QUARTIL 4 = 4º QUARTIL
	private String retencao; //0 = FORA DO MAILLING RGC 1 = MAILLING RGC
	private String fl_bl; //0 = NÃO POSSUI BANDA LARGA 1 = POSSUI BANDA LARGA
	private String postecipado; //0 = CLIENTE NÃO É POSTECIPADO 1 = CLIENTE É POSTECIPADO
	private String equipamento ; //0 = NÃO POSSUI EQUIPAMENTO 1 = POSSUI EQUIPAMENTO
	
	
	
	
	
	
	public String getUltMotivo() {
		return ultMotivo;
	}
	public void setUltMotivo(String ultMotivo) {
		this.ultMotivo = ultMotivo;
	}
	public String getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public String getCampanha() {
		return campanha;
	}
	public void setCampanha(String campanha) {
		this.campanha = campanha;
	}
	public String getDataExport() {
		return dataExport;
	}
	public void setDataExport(String dataExport) {
		this.dataExport = dataExport;
	}
	public String getDataVigencia() {
		return dataVigencia;
	}
	public void setDataVigencia(String dataVigencia) {
		this.dataVigencia = dataVigencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getRegistroCliente() {
		return registroCliente;
	}
	public void setRegistroCliente(String registroCliente) {
		this.registroCliente = registroCliente;
	}
	public String getNumCPF() {
		return numCPF;
	}
	public void setNumCPF(String numCPF) {
		this.numCPF = numCPF;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}
	public String getTel4() {
		return tel4;
	}
	public void setTel4(String tel4) {
		this.tel4 = tel4;
	}
	public String getTel5() {
		return tel5;
	}
	public void setTel5(String tel5) {
		this.tel5 = tel5;
	}
	public String getTel6() {
		return tel6;
	}
	public void setTel6(String tel6) {
		this.tel6 = tel6;
	}
	public String getTel7() {
		return tel7;
	}
	public void setTel7(String tel7) {
		this.tel7 = tel7;
	}
	public String getTel8() {
		return tel8;
	}
	public void setTel8(String tel8) {
		this.tel8 = tel8;
	}
	public String getTel9() {
		return tel9;
	}
	public void setTel9(String tel9) {
		this.tel9 = tel9;
	}
	public String getTel10() {
		return tel10;
	}
	public void setTel10(String tel10) {
		this.tel10 = tel10;
	}
	public String getSegmentoPacote() {
		return segmentoPacote;
	}
	public void setSegmentoPacote(String segmentoPacote) {
		this.segmentoPacote = segmentoPacote;
	}
	public String getPriMotivo() {
		return priMotivo;
	}
	public void setPriMotivo(String priMotivo) {
		this.priMotivo = priMotivo;
	}
	public String getDataCancelamento() {
		return dataCancelamento;
	}
	public void setDataCancelamento(String dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getDataInstalacao() {
		return dataInstalacao;
	}
	public void setDataInstalacao(String dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public String getFlagScob() {
		return flagScob;
	}
	public void setFlagScob(String flagScob) {
		this.flagScob = flagScob;
	}
	public String getFlagFidelidade() {
		return flagFidelidade;
	}
	public void setFlagFidelidade(String flagFidelidade) {
		this.flagFidelidade = flagFidelidade;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getAtritado() {
		return atritado;
	}
	public void setAtritado(String atritado) {
		this.atritado = atritado;
	}
	public String getReincidente() {
		return reincidente;
	}
	public void setReincidente(String reincidente) {
		this.reincidente = reincidente;
	}
	public String getQuartis() {
		return quartis;
	}
	public void setQuartis(String quartis) {
		this.quartis = quartis;
	}
	public String getRetencao() {
		return retencao;
	}
	public void setRetencao(String retencao) {
		this.retencao = retencao;
	}
	public String getFl_bl() {
		return fl_bl;
	}
	public void setFl_bl(String fl_bl) {
		this.fl_bl = fl_bl;
	}
	public String getPostecipado() {
		return postecipado;
	}
	public void setPostecipado(String postecipado) {
		this.postecipado = postecipado;
	}
	public String getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	@Override
	public String toString() {
		return "InfoVO [campanha=" + campanha + ", dataExport=" + dataExport
				+ ", dataVigencia=" + dataVigencia + ", nomeCliente="
				+ nomeCliente + ", registroCliente=" + registroCliente
				+ ", numCPF=" + numCPF + ", tel1=" + tel1 + ", tel2=" + tel2
				+ ", tel3=" + tel3 + ", tel4=" + tel4 + ", tel5=" + tel5
				+ ", tel6=" + tel6 + ", tel7=" + tel7 + ", tel8=" + tel8
				+ ", tel9=" + tel9 + ", tel10=" + tel10 + ", segmentoPacote="
				+ segmentoPacote + ", priMotivo=" + priMotivo + ", ultMotivo="
				+ ultMotivo + ", dataCancelamento=" + dataCancelamento
				+ ", dataSolicitacao=" + dataSolicitacao + ", cidade=" + cidade
				+ ", uf=" + uf + ", dataInstalacao=" + dataInstalacao
				+ ", formaPagamento=" + formaPagamento + ", flagScob="
				+ flagScob + ", flagFidelidade=" + flagFidelidade + ", score="
				+ score + ", atritado=" + atritado + ", reincidente="
				+ reincidente + ", quartis=" + quartis + ", retencao="
				+ retencao + ", fl_bl=" + fl_bl + ", postecipado="
				+ postecipado + ", equipamento=" + equipamento + "]";
	}

	
	
	

}
