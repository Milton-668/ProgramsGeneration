package Lista2;

import java.util.Scanner;

public class OrdemCrescente_exe_2_2 {

	public static void main(String[] args) 
	{
		/*
		 * Fa�a um programa que entre com tr�s n�meros 
		 * e coloque em ordem crescente.
		 */
		
		Scanner read = new Scanner (System.in);
		
		int a,b,c, cont;
		
		System.out.print("\nInsira o 1� numero:");
		a= read.nextInt();
		System.out.print("\nInsira o 2� numero:");
		b= read.nextInt();
		System.out.print("\nInsira o 3� numero:");
		c= read.nextInt();
		
		if(a>b &&a>c)
		{
			System.out.printf("\nOs numeros s�o %d %d %d",a,b,c);
		}
		else if(b>a &&b>c)
		{
			System.out.printf("\nOs numeros s�o %d %d %d",b,a,c);
		}
		else
		{
			System.out.printf("\nOs numeros s�o %d %d %d",c,b,a);
		}
		
	}
	
}
