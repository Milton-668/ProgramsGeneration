package Desafio;

import java.util.Scanner;

public class SegundoDesafio 
{

	public static void main(String[] args)
	{
		/*
		 * 2) Elabore um sistema que leia as variáveis C e N, 
		 * respectivamente código e número de horas trabalhadas 
		 * de um operário. E calcule o salário sabendo-se que 
		 * ele ganha R$ 10,00 por hora. Quando o número de horas 
		 * exceder a 50 calcule o excesso de pagamento armazenando-o 
		 * na variável E, caso contrário zerar tal variável. A hora 
		 * excedente de trabalho vale R$ 20,00. No final do 
		 * processamento imprimir o salário total e o salário 
		 * excedente.

		 */
		Scanner read = new Scanner (System.in);
		
		byte cod;
		int  horas;
		double sal,excesso;
		
		
		System.out.print("\nInsira o Código do Operário:");
		cod= read.nextByte();
		System.out.print("\nInsira a quantidade horas trabalhadas:\n");
		horas= read.nextInt();
		

		sal=(10*horas);
		
		if(horas>50)
		{
			excesso=((horas-50)*20);
			System.out.printf("\nO salário do operário é R$:%.2f",sal);
			System.out.printf("\nO excesso é R$:%.2f",excesso);
		}
		else
		{
			System.out.printf("\\nO salário do operário é R$:%.2f",sal);
			System.out.printf("\nNão teve excesso!!!");
		}
		

	}

}
