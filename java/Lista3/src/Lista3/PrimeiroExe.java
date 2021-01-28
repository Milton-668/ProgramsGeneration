package Lista3;

import java.util.Scanner;

public class PrimeiroExe
{
	public static void step ()
	{
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		/*
		 * 1.Informar todos os números de 1000 a 1999 
		 * que quando divididos por 11 obtemos resto = 5. (FOR)
		 */
		
		Scanner ler = new Scanner (System.in);
		
		int i;
		
		for(i=1000;i<2000;i++)
		{
			if(i%11==5)
			{
				System.out.print(i);
			}
		}

	}

}
