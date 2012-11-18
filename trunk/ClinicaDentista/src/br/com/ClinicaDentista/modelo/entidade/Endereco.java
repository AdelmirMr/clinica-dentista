package br.com.ClinicaDentista.modelo.entidade;

public class Endereco {
	private String endereco;
	private String cidade;
	private String bairro;
	private String cpe;

	public Endereco() {
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCpe() {
		return cpe;
	}

	public void setCpe(String cpe) {
		this.cpe = cpe;
	}
}