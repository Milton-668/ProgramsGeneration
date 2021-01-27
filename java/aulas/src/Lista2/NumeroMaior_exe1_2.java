package Lista2;

import java.util.Scanner;

public class NumeroMaior_exe1_2
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int a,b,c,maior;
		
		System.out.print("\nInsira o 1° numero:");
		a= ler.nextInt();
		System.out.print("\nInsira o 2° numero:");
		b= ler.nextInt();
		System.out.print("\nInsira o 3° numero:");
		c= ler.nextInt();
		
		if(a>b && a>c)
		{
			maior=a;
		}
		else if(b>a && b>c)
		{
			maior=b;
		}
		else
		{
			maior=c;
		}
		
		System.out.printf("\nO numero maior é:%d",maior);
	}
}
