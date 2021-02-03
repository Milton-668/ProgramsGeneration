package Entidades;

public class Construtor {
	
	
	public int codigo;
	public String descrição;
	public double valorUnitario;
	
	public Construtor(String descrição) {
	this.descrição = descrição;
	}


	public Construtor(int codigo,String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}
	
	public Construtor(int codigo,String descrição,double valorUnitario) {
		this.codigo = codigo;
		this.descrição = descrição;
		this.valorUnitario = valorUnitario;
	}

	
}
