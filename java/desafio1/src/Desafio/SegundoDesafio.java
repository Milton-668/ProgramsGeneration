package Desafio;

import java.util.Scanner;

public class SegundoDesafio 
{

	public static void main(String[] args)
	{
		/*
		 * 2) Elabore um sistema que leia as vari�veis C e N, 
		 * respectivamente c�digo e n�mero de horas trabalhadas 
		 * de um oper�rio. E calcule o sal�rio sabendo-se que 
		 * ele ganha R$ 10,00 por hora. Quando o n�mero de horas 
		 * exceder a 50 calcule o excesso de pagamento armazenando-o 
		 * na vari�vel E, caso contr�rio zerar tal vari�vel. A hora 
		 * excedente de trabalho vale R$ 20,00. No final do 
		 * processamento imprimir o sal�rio total e o sal�rio 
		 * excedente.

		 */
		Scanner read = new Scanner (System.in);
		
		byte cod;
		int  horas;
		double sal,excesso;
		
		
		System.out.print("\nInsira o C�digo do Oper�rio:");
		cod= read.nextByte();
		System.out.print("\nInsira a quantidade horas trabalhadas:\n");
		horas= read.nextInt();
		

		sal=(10*horas);
		
		if(horas>50)
		{
			excesso=((horas-50)*20);
			System.out.printf("\nO sal�rio do oper�rio � R$:%.2f",sal);
			System.out.printf("\nO excesso � R$:%.2f",excesso);
		}
		else
		{
			System.out.printf("\\nO sal�rio do oper�rio � R$:%.2f",sal);
			System.out.printf("\nN�o teve excesso!!!");
		}
		

	}

}
