package Desafio;

import java.util.Scanner;

public class OitavoDesafio {

	public static void main(String[] args) 
	{
		/*
		 * 8) Construa um sistema para ler uma variável numérica N e 
		 * imprimi-la somente se a mesma for maior que 100, caso 
		 * contrário imprimi-la com o valor zero.
		 */
		
		Scanner ler = new Scanner (System.in);
		
		int n;
		
		System.out.print("Insira o valor de N:");
		n= ler.nextInt();
		
		if(n>=100)
		{
			System.out.printf("O valor de N é:%d",n);
		}
		if(n<100)
		{
			System.out.printf("O valor de N é: 0");
		}
		
	}

}
