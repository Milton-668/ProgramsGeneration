package lista1;

import java.util.Scanner;

public class Anos_meses_dias_exe_2_1 
{
	public static void main (String []args)
	{
		/*
		 * 2. Faça um sistema que leia a idade de uma 
		 * pessoa expressa em dias e mostre-a expressa 
		 * em anos, meses e dias. 
		 */
		
		Scanner ler = new Scanner (System.in);
		
		int dias,anos,meses,idade;
		
		System.out.println("Escreva a quantidade de dias:");
		idade= ler.nextInt();

		anos=((idade/365));
		meses=((idade%365)/30);
		dias=((idade%365)%30);
		
		System.out.print("O resultado em dias é:"+anos);
		System.out.print("O resultado em dias é:"+meses);
		System.out.print("O resultado em dias é:"+dias);
	}
}
