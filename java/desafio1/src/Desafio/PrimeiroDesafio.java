package Desafio;

import java.util.Scanner;

public class PrimeiroDesafio 
{

	public static void main(String[] args) 
	{
		/*
		 * 1) João Papo-de-Pescador, homem de bem, comprou um 
		 * microcomputador para controlar o rendimento diário 
		 * de seu trabalho. Toda vez que ele traz um peso de 
		 * tomate maior que o estabelecido pelo regulamento 
		 * do estado de São Paulo (50 quilos) deve pagar um 
		 * multa de R$ 4,00 por quilo excedente. João precisa 
		 * que você faça um sistema que leia a variável P 
		 * (peso de tomates) e verifique se há excesso. 
		 * Se houver, gravar na variável E (Excesso) e na 
		 * variável M o valor da multa que João deverá pagar. 
		 * Caso contrário mostrar tais variáveis com o conteúdo 
		 * ZERO.
		 */
		Scanner read = new Scanner (System.in);
		
		double peso=0.00,multa=0.00,excesso=0.00;
		
		System.out.print("\nInsira o peso do do tomate:");
		peso= read.nextDouble();
		
		if(peso>50)
		{
			excesso=((peso-50));
			multa=((excesso*4));
			System.out.printf("O execesso é: %.2f",excesso,"KG");
			System.out.printf("\nO valor da multa é: R$%.2f",multa);
		}
		else
		{
			System.out.printf("Ufa João! Não houve excessos");
		}


	}

}
