package Desafio;

import java.util.Scanner;

public class TerceiroDesafio {

	public static void main(String[] args) 
	{
		
		/*
		 * 3) Desenvolva um sistema em que:
		 * Leia 4 (quatro) n�meros;
		 * Calcule o quadrado de cada um;
         * Se o valor resultante do quadrado do terceiro for >= 1000, 
		 * imprima-o e finalize;
		 * Caso contr�rio, imprima os valores lidos e seus respectivos 
		 * quadrados.
		 */
		Scanner read = new Scanner (System.in);
		
		int n1,n2,n3,n4;
		double q1,q2,q3,q4;
		
		System.out.print("\nInsira o 1� n�mero:");
		n1= read.nextInt();
		System.out.print("\nInsira o 2� n�mero:");
		n2= read.nextInt();
		System.out.print("\nInsira o 3� n�mero:");
		n3= read.nextInt();
		System.out.print("\nInsira o 4� n�mero:");
		n4= read.nextInt();
		
		q1=Math.pow(n1,2);
		q2=Math.pow(n2,2);
		q3=Math.pow(n3,2);
		q4=Math.pow(n4,2);
	
		if(q3>=1000)
		{
			System.out.printf("\nO valor �:%.2f",q3);
		}
		else
		{
			System.out.printf("\nO valor da 1� potencia �:%.2f",q1);
			System.out.printf("\nO valor da 2� potencia �:%.2f",q2);
			System.out.printf("\nO valor da 3� potencia �:%.2f",q3);
			System.out.printf("\nO valor da 4� potencia �:%.2f",q4);
		}
		

	}

}
