package Colletions;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class Colecoes {
	
	public static void main (String args[])
	{
		Collection<String>nomes = new ArrayList();
		nomes.add("CARLOS"); ///add responsável por adicionar os elemetos do ArrayList.
		nomes.add("MATEUS");
		nomes.add("CRIS");
		nomes.add("FABIO");
		nomes.add("ALEX");
		
		/*Adiciona uma nova lista dentro da anterior 
		Collection<String>nomes2 = Arrays.asList("FLORINDA","CREUZA");
		nomes.addAll(nomes2);
		System.out.println("Lista de nomes: "+nomes);*/
		
		for(String name:nomes)
		{
			//System.out.println("Lista de nomes: "+nomes);
			System.out.println(""+name);
		}
		
		/*System.out.println("Lista de nomes: "+nomes);
		System.out.println("CONTÉM O NOME CRIS?"+nomes.contains("CRIS"));//verifica se existe a informação desejada
		System.out.println("LISTA"+nomes);*/
		
		
		
		/*nomes.clear();// limpa todos os campos 
		System.out.println("Lista de nomes: "+nomes);*/
		
		//nomes.remove("FABIO"); //remove um item da lista
		//System.out.println("Lista de nomes: "+nomes);
		
		/*if(nomes.isEmpty()) //isEmpty verifica se algum campo vazio dentro da list
		{
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println("Lista de nomes: "+nomes);
		}*/
		
		
		
		
		
	}

}
