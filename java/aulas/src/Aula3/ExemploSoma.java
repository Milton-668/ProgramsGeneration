package Aula3;

import java.util.Scanner;

public class ExemploSoma
{

	public static void main(String[] args) 
	{
		
		/*
		 * 2- Faça um programa que pegue um número do teclado 
		 * e calcule a soma de todos os números  de 1 até ele. 
		 * Ex.: o usuário entra 7, o programa vai mostrar 28, 
		 * pois  1+2+3+4+5+6+7=28.
		 */
		Scanner ler = new Scanner (System.in);
		
		int num=0,res=0;
		
		System.out.printf("Digite um numero:");
		num= ler.nextInt();
		
		do
		{
			res=(res+num);
			num=(num-1);
		}
		
		while(num>=0);

		System.out.printf("Numero:%d",res);

	}

}
