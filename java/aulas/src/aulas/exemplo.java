package aulas;

import java.util.Scanner;

public class exemplo 
{
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner (System.in);
		int a,b,soma;
		
		System.out.println("Entre com o valor de A: ");
		a= ler.nextInt();
		System.out.println("Entre com o valor de A: ");
		b= ler.nextInt();
		
		soma = a+b;
		
		System.out.println(soma);
	}
}
