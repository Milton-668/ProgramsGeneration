package Aula3;

import java.util.Scanner;

public class exeWhile {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int idade;
		
		System.out.printf("Entre com a sua idade:");
		idade=ler.nextInt();
		
		while(idade>0)
		{
			System.out.printf("Sua idade é:%d\n",idade);
			if(idade>17)
			{
				System.out.printf("Menor de idade");
			}
			else
			{
				System.out.printf("Menor de idade");
			}
			System.out.printf("\nEntre com a sua idade:");
			idade=ler.nextInt();
		}
	}
}
