package Entidades;

public class Construtor {
	
	
	public int codigo;
	public String descri��o;
	public double valorUnitario;
	
	public Construtor(String descri��o) {
	this.descri��o = descri��o;
	}


	public Construtor(int codigo,String descri��o) {
		this.codigo = codigo;
		this.descri��o = descri��o;
	}
	
	public Construtor(int codigo,String descri��o,double valorUnitario) {
		this.codigo = codigo;
		this.descri��o = descri��o;
		this.valorUnitario = valorUnitario;
	}

	
}
