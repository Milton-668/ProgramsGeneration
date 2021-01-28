package Desafio;

import java.util.Scanner;

public class SetimoDesafio {

	public static void main(String[] args) 
	{
		
		/*
		 * 7) Receber valores de base e altura de um triângulo e 
		 * verificar se são valores válidos (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a área do triângulo.
		 */
		Scanner ler = new Scanner (System.in);
		
		double base,altura,area;
		
		System.out.print("Insira o valor da base:");
		base= ler.nextInt();
		System.out.print("Insira o valor da altura:");
		altura= ler.nextInt();
		
		

		area=((base*altura)/2);
		
		if(base>0 && altura>0)
		{
			System.out.printf("A área do triângulo é:%.2f",area);
		}
		else
		{
			System.out.print("Valor Incorreto!");
		}

	}

}
