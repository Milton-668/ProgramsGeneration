package aulas;

import java.util.Scanner;

public class Exemplo_condicional {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("Entre com a sua idade:");
		idade = ler.nextInt();
		
		ler.nextLine();//limpa o buffer
		
		System.out.printf("Entre com o seu nome:");
		nome = ler.nextLine();
		
		System.out.printf("\nSeu nome é:%s",nome);
		System.out.printf("\nSua idade é:%d",idade);
		
		if(idade>=18)
		{
			System.out.printf("\nVocê é maior de idade...");
		}
		else if (idade>=1 && idade<18)
		{
			System.out.printf("\nVocê é menor de idade...");
		}
		else
		{
			System.out.printf("\nVocê entrou com uma idade inválida...");
		}
		

	}

}
