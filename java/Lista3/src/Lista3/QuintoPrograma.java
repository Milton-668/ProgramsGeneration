package Lista3;

import java.util.Scanner;

public class QuintoPrograma 
{
	public static void step ()
	{
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int num=0,soma=0;
		
		do
		{
			System.out.printf("Insira o numero: ");
			num=ler.nextInt();
			step();
			
			soma=soma+num;
			
		}while(num!=0);
		System.out.printf("A soma dos numeros é:%d",soma);
		
	}

}
