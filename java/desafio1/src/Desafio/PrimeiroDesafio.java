package Desafio;

import java.util.Scanner;

public class PrimeiroDesafio 
{

	public static void main(String[] args) 
	{
		/*
		 * 1) Jo�o Papo-de-Pescador, homem de bem, comprou um 
		 * microcomputador para controlar o rendimento di�rio 
		 * de seu trabalho. Toda vez que ele traz um peso de 
		 * tomate maior que o estabelecido pelo regulamento 
		 * do estado de S�o Paulo (50 quilos) deve pagar um 
		 * multa de R$ 4,00 por quilo excedente. Jo�o precisa 
		 * que voc� fa�a um sistema que leia a vari�vel P 
		 * (peso de tomates) e verifique se h� excesso. 
		 * Se houver, gravar na vari�vel E (Excesso) e na 
		 * vari�vel M o valor da multa que Jo�o dever� pagar. 
		 * Caso contr�rio mostrar tais vari�veis com o conte�do 
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
			System.out.printf("O execesso �: %.2f",excesso,"KG");
			System.out.printf("\nO valor da multa �: R$%.2f",multa);
		}
		else
		{
			System.out.printf("Ufa Jo�o! N�o houve excessos");
		}


	}

}
