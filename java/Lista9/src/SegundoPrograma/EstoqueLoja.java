package SegundoPrograma;

import java.util.ArrayList;
import java.util.List;


public class EstoqueLoja {
	
	public static void main (String args[])
	{
		List <String> roupas = new ArrayList<>();
		
		System.out.println("ARMAZENAMENTO");
		roupas.add("CAMISETA"); ///add respons�vel por adicionar os elemetos do ArrayList.
		roupas.add("BLUSA ");
		roupas.add("CHINELO");
		roupas.add("CAL�A");
		roupas.add("REGATA");
		System.out.println("Lista de Roupas: "+roupas);
		roupas.set(2,"CHAP�U");
		System.out.println();
		System.out.println("ATUALIZA��O");
		System.out.println("Lista de Roupas: "+roupas);
		System.out.println();
		System.out.println("REMO��O");
		roupas.remove("REGATA"); //remove um item da lista
		System.out.println("Lista de Roupas: "+roupas);
		System.out.println();
		
		System.out.println("APRESENTA��O");
		for(String roupa:roupas)
		{
			System.out.println(""+roupa);
		}
		
			
		
		
	}

}
