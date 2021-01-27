package lista1;

import java.util.Scanner;

public class calculo_expressao_exe_4_lista_1

{
	public static void main (String args[])
	{
		/*
		 * 4. Escreva  um sistema que leia três 
		 * números inteiros e positivos (A, B, C) 
		 * e calcule a seguinte expressão: 
		 * D=R+S/2, ONDE R=(A+B)^2
		 * 			  S=(B+C)^2
		 */
		Scanner ler = new Scanner (System.in);
		
		int a,b,c,r,s;
		float d;
		
		System.out.println("Entre com o valor de A: ");
		a= ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		b= ler.nextInt();
		System.out.println("Entre com o valor de C: ");
		c= ler.nextInt();
		
		r=((a+b)*(a+b));
		s=((b+c)*(b+c));
		
		d= ((r+s)/2);
		
		System.out.println(d);
		
		
	}

}
