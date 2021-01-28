package Desafio;

import java.util.Scanner;

public class QuartoDesafio
{
	public static void main (String []args)
	{
		/*
		 * 4) Faça um sistema que leia um número inteiro e mostre 
		 * uma mensagem indicando se este número é par ou ímpar, e 
		 * se é positivo ou negativo.
		 */
		
		Scanner ler = new Scanner (System.in);
		
		int num;
		System.out.print("Insira o numero:\n");
		num= ler.nextInt();
	
		
		if(num%2==0 )
		{
			System.out.print("\nO número é par!");
		}
		else
		{
			System.out.print("\nO número é ímpar!");
		}
		if(num>0){
			System.out.print("\nO número é positivo!");
		}
		if(num<0)
		{
			System.out.print("\nO número é negativo!");	
		}	
		
	}
}



	


