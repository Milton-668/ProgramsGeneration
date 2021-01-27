package Lista2;

import java.util.Scanner;

public class Par_impar_raiz_pot_exe_4_2 
{
	public static void main(String[] args) 
	{
		/*
		 * Faça um programa em que permita a entrada de um 
		 * número qualquer e exiba se este número é par ou ímpar. 
		 * Se for par exiba também a raiz quadrada do mesmo; se 
		 * for ímpar exiba o número elevado ao quadrado.
		 */
		Scanner ler = new Scanner (System.in);
		
		
		double r,p,num=0.0;
		System.out.print("Insira o numero:\n");
		num= ler.nextInt();
	
		
		if(num%2==0 )
		{
			r=Math.sqrt(num);
			System.out.printf("\nO número é par e a raíz é:%.2f",r);
		}
		else
		{
			p=Math.pow(num,2);
			System.out.printf("\nO número é ímpar e sua potência é:%.2f",p);
		}
		
	}

}
