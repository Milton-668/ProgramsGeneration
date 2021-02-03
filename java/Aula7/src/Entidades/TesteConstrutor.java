package Entidades;

public class TesteConstrutor {

	public static void main(String[] args) 
	{
		
		Construtor descricao = new Construtor("PAPEL");
		Construtor codigo = new Construtor(10,"PAPEL");
		Construtor valorUnitario = new Construtor(10,"PAPEL",10);
		
		System.out.println("NOME\tCODIGO\tVALOR");
		System.out.print(descricao.descrição+"\t"+codigo.codigo+"\t"+valorUnitario.valorUnitario);

	}

}