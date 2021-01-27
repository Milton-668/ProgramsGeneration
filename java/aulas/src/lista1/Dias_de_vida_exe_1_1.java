package lista1;

import java.util.Scanner;

public class Dias_de_vida_exe_1_1 
{
	public static void main (String []args)
	{
		/*
		 * 1. Faça um sistema que leia a idade 
		 * de uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa apenas em dias. 
		 */
		Scanner ler = new Scanner (System.in);
		
		int anos,meses,dias,idade;
		
		System.out.println("Escreva a quantidade de anos:");
		anos= ler.nextInt();
		System.out.println("Escreva a quantidade de meses:");
		meses= ler.nextInt();
		System.out.println("Escreva a quantidade de dias:");
		dias= ler.nextInt();
		
		idade = ((anos*365)+(meses*30)+dias);
		
		System.out.print("O resultado em dias é:"+idade);
		
		
	}
	

}
