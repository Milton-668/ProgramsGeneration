package Lista3;

import java.util.Scanner;

public class TerceiroPrograma
{
	public static void step ()
	{
		System.out.println();
	}

	public static void main(String[] args) 
	{
		/*
		 * 3-Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. Total de 
		 * pessoas com mais de 50 anos. O programa termina 
		 * quando idade for =-99. (WHILE)
		 */
		Scanner ler = new Scanner (System.in);
		
		int idade=0,totalMenor=0,totalMaior=0;
		
		System.out.printf("Entre com a idade da pessoa: ");
		idade=ler.nextInt();
		step();
		
		while(idade!=-99)
		{
			System.out.printf("Entre com a idade da pessoa: ");
			idade=ler.nextInt();
			step();
			
			if(idade<21)
			{
				totalMenor++;
			}
			else if(idade>50)
			{
				totalMaior++;
			}
			else
			{
				System.out.printf("Entrada inválida");
			}
			//step();
		}
		System.out.printf("Quantidade de pessoas com menos 21:%d",totalMenor);
		step();
		System.out.printf("Quantidade de pessoas com mais de 21:%d",totalMaior);
	}

}
