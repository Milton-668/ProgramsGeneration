package Desafio;

import java.util.Scanner;

public class QuartoDesafio
{
	public static void main (String []args)
	{
		/*
		 * 4) Fa�a um sistema que leia um n�mero inteiro e mostre 
		 * uma mensagem indicando se este n�mero � par ou �mpar, e 
		 * se � positivo ou negativo.
		 */
		
		Scanner ler = new Scanner (System.in);
		
		int num;
		System.out.print("Insira o numero:\n");
		num= ler.nextInt();
	
		
		if(num%2==0 )
		{
			System.out.print("\nO n�mero � par!");
		}
		else
		{
			System.out.print("\nO n�mero � �mpar!");
		}
		if(num>0){
			System.out.print("\nO n�mero � positivo!");
		}
		if(num<0)
		{
			System.out.print("\nO n�mero � negativo!");	
		}	
		
	}
}



	


