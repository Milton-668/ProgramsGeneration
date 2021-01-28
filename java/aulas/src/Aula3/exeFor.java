package Aula3;

import java.util.Scanner;

public class exeFor {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		
		int x,soma=0;
		
		for(x=1;x<=10;x++)
		{
			System.out.printf("\n%d",x);
			soma+=+x;
		}
		
		System.out.printf("\nSoma total: %d",soma);
		
	}

}
