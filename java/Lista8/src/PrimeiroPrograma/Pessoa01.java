package PrimeiroPrograma;

public class Pessoa01 {
	/*
	 * 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus
	 * respectivos seletores (getters) e modificadores (setters), e ainda o
	 * construtor padr�o e pelo menos mais duas op��es de construtores conforme sua
	 * percep��o. Atributos: String nome; String endere�o; String telefone;
	 * 
	 */

	private String nome;
	private String endereco;
	private String telefone;
	private String status;
	private int idade;

	// CONSTRUTOR PADR�O
	public Pessoa01(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	// CONSTRUTORES AUXILIARES
	public Pessoa01(String status) {
		super();
		this.status = status;
	}

	public Pessoa01(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
