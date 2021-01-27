package lista1;

import java.util.Scanner;

public class Dois_pontos_exe_6_1 
{
	
	public static void main (String []args)
	{
		/*
		 * 6. Construa um programa em c que, tendo como 
		 * dados de entrada dois pontos quaisquer no plano, 
		 * P(x1, y1) e P(x2, y2), 
		 * escreva a distância entre eles. A fórmula é
		 * d=raiz((x2-x1)^2 + (y2-y1)^2)
		 */
		Scanner ler = new Scanner (System.in);
		
		double x1,x2,y1,y2,pot1,pot2,d,dd,val1,val2;
		
		System.out.println("\nEntre com x1:");
		x1= ler.nextDouble();
		System.out.println("\nEntre com x2:");
		x2= ler.nextDouble();
		System.out.println("\nEntre com y2:");
		y1= ler.nextDouble();
		System.out.println("\nEntre com y1:");
		y2= ler.nextDouble();
		

		val1=((x2-x1));
		val2=((y2-y1));
		
		pot1=Math.pow(val1,2);
		pot2=Math.pow(val2,2);
		d=Math.sqrt(pot1+pot2);
	
		System.out.print("O valor de D é:"+d);
	}
}
