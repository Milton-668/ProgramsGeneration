package Lista2;

import java.util.Scanner;

public class Par_impar_raiz_pot_exe_4_2 
{
	public static void main(String[] args) 
	{
		/*
		 * Fa�a um programa em que permita a entrada de um 
		 * n�mero qualquer e exiba se este n�mero � par ou �mpar. 
		 * Se for par exiba tamb�m a raiz quadrada do mesmo; se 
		 * for �mpar exiba o n�mero elevado ao quadrado.
		 */
		Scanner ler = new Scanner (System.in);
		
		
		double r,p,num=0.0;
		System.out.print("Insira o numero:\n");
		num= ler.nextInt();
	
		
		if(num%2==0 )
		{
			r=Math.sqrt(num);
			System.out.printf("\nO n�mero � par e a ra�z �:%.2f",r);
		}
		else
		{
			p=Math.pow(num,2);
			System.out.printf("\nO n�mero � �mpar e sua pot�ncia �:%.2f",p);
		}
		
	}

}
