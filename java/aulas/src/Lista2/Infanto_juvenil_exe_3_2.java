package Lista2;

import java.util.Scanner;

public class Infanto_juvenil_exe_3_2 {

	public static void main(String[] args) 
	{
		/*
		 * Faça um programa que receba a idade de uma pessoa e 
		 * mostre na saída em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto
		 */
			
		Scanner ler = new Scanner (System.in);
		
		int idade;
		
		System.out.print("Insira a idade da pessoa:\n");
		idade= ler.nextInt();
		
		if(idade>=10 && idade<15)
		{
			System.out.print("Infantil!");
		}
		else if(idade>15 && idade<18)
		{
			System.out.print("Juvenil!");
		}
		
			else if(idade>17 && idade<26)
			{
				System.out.print("Adulto!");
			}
			else
			{
				System.out.print("Entrada Inválida!");
			}

	}

}
