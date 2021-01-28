package Desafio;

import java.util.Scanner;

public class QuintoDesafio 
{
	public static void main (String []args)
	{
	/*
	 * 5) A Secretaria de Meio Ambiente que controla o �ndice 
	 * de polui��o mant�m 3 grupos de ind�strias que s�o altamente 
	 * poluentes do meio ambiente. O �ndice de polui��o aceit�vel 
	 * varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as 
	 * ind�strias do 1� grupo s�o intimadas a suspenderem suas 
	 * atividades, se o �ndice crescer para 0,4 as industrias do 
	 * 1� e 2� grupo s�o intimadas a suspenderem suas atividades, 
	 * se o �ndice atingir 0,5 todos os grupos devem ser notificados 
	 * a paralisarem suas atividades. Fa�a um sistema que leia o 
	 * �ndice de polui��o medido e emita a notifica��o adequada aos 
	 * diferentes grupos de empresas.

	 */
		Scanner ler = new Scanner (System.in);
		
		double indice;
		
		System.out.print("Insira o �ndice de polui��o:\n");
		indice= ler.nextDouble();
		
	
		if ( indice>=0.05 && indice<0.25)
		{
			System.out.print("�ndice aceit�vel!");
			
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
			System.out.print("Valor inv�lido inv�lido");
		}
		
	}
	
}
