package Desafio;

import java.util.Scanner;

public class QuintoDesafio 
{
	public static void main (String []args)
	{
	/*
	 * 5) A Secretaria de Meio Ambiente que controla o índice 
	 * de poluição mantém 3 grupos de indústrias que são altamente 
	 * poluentes do meio ambiente. O índice de poluição aceitável 
	 * varia de 0,05 até 0,25. Se o índice sobe para 0,3 as 
	 * indústrias do 1º grupo são intimadas a suspenderem suas 
	 * atividades, se o índice crescer para 0,4 as industrias do 
	 * 1º e 2º grupo são intimadas a suspenderem suas atividades, 
	 * se o índice atingir 0,5 todos os grupos devem ser notificados 
	 * a paralisarem suas atividades. Faça um sistema que leia o 
	 * índice de poluição medido e emita a notificação adequada aos 
	 * diferentes grupos de empresas.

	 */
		Scanner ler = new Scanner (System.in);
		
		double indice;
		
		System.out.print("Insira o índice de poluição:\n");
		indice= ler.nextDouble();
		
	
		if ( indice>=0.05 && indice<0.25)
		{
			System.out.print("Índice aceitável!");
			
		}
		else if(indice>=0.30 && indice<0.40)
		{
			System.out.print("Grupo 1 suspenda as atividades!");
		}
		else if(indice>=0.40 && indice<0.50)
		{
			System.out.print("Grupos 1 e 2 suspendam as atividades!");
		}
		else if(indice>=0.50)
		{
			System.out.print("Todos os grupos suspendam as atividades!");
		}
		else
		{
			System.out.print("Valor inválido inválido");
		}
		
	}
	
}
