package Lista3;

import java.util.Scanner;

public class SegundoExe 

{
	public static void step ()
	{
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		/*
		 * 2-Ler 10 n�meros e imprimir quantos s�o 
		 * pares e quantos s�o �mpares. (FOR)
		 */
		Scanner ler = new Scanner (System.in);
		
		int num,i,par=0,impar=0;
		
		for(i=1;i<=10;i++)
		{
			System.out.printf("Entre com o %d� numero: ",i);
			num=ler.nextInt();
			
			
			if(num%2==0)
			{
				par++;
				//cont= cont + i;
			}
			else
			{
				//cont= cont + i;
				impar++;
			}
		}
		System.out.printf("A quantidade de pares s�o:%d",par);
		step();
		System.out.printf("A quantidade de �mpares s�o:%d",impar);
	}

}
