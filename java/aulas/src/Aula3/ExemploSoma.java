package Aula3;

import java.util.Scanner;

public class ExemploSoma
{

	public static void main(String[] args) 
	{
		
		/*
		 * 2- Fa�a um programa que pegue um n�mero do teclado 
		 * e calcule a soma de todos os n�meros  de 1 at� ele. 
		 * Ex.: o usu�rio entra 7, o programa vai mostrar 28, 
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
