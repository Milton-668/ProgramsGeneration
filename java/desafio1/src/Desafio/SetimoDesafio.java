package Desafio;

import java.util.Scanner;

public class SetimoDesafio {

	public static void main(String[] args) 
	{
		
		/*
		 * 7) Receber valores de base e altura de um tri�ngulo e 
		 * verificar se s�o valores v�lidos (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a �rea do tri�ngulo.
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
			System.out.printf("A �rea do tri�ngulo �:%.2f",area);
		}
		else
		{
			System.out.print("Valor Incorreto!");
		}

	}

}
