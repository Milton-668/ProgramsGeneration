package Lista3;

import java.util.Scanner;

public class SextoPrograma 
{
	public static void step ()
	{
		System.out.println();
	}
	

	public static void main(String[] args) 
	{
		/*
		 * Escrever um programa que receba v�rios n�meros
		 * inteiros no teclado. E no final imprimir a m�dia 
		 * dos n�meros m�ltiplos de 3. Para sair digitar 
		 * 0(zero).(DO...WHILE)
		 */
		Scanner ler = new Scanner (System.in);
		
		int num=0,cont=0,soma=0;
		double media=0.0;
		
		do
		{
			System.out.printf("Insira os numeros: ");
			num=ler.nextInt();
			step();
			
			if(num%3==0 && num!=0)
			{
				soma=(soma+num);
				cont++;
			}
			
		}while(num!=0);
		
		media=((soma/cont));
		System.out.printf("A m�dia dos num�ros �:%.2f",media);
		
		
	}

}
