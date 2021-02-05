package PrimeiroPrograma;

public class Animal {
	
	private String nome;
	private int idade;
	private String raca;
	private String tamanho;
	
	public Animal(String nome, int idade, String raca,String tamanho) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.tamanho=tamanho;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	public String latido()
	{
		return "LATE";
	}
	
	public String relincho()
	{
		return "RELINCHA";
	}
	public String assuvio()
	{
		return "ASSUVIA";
	}
	
	public String deveCorrer()
	{
		return "CORRE";
	}
	
	public String subirArvore()
	{
		return "TREPA";
	}
	

}
