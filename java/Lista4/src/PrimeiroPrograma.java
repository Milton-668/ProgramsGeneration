import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		/* 1.
		 * Fa�a um programa que crie um vetor por leitura com 
		 * 5 valores de pontua��o de uma atividade e o escreva 
		 * em seguida. Encontre ap�s a maior pontua��o e a apresente.
		 */
		
		int num []= new int[5];
		int ponto=0;
		double maiorPonto=0.00;

		for(int i=0;i<5;i++)
		{
			System.out.printf("Insira a %d� pontua��o:",ponto+1);
			num[i]=ler.nextInt();
			
			ponto++;
			
			if(num[i]>maiorPonto)
			{
				maiorPonto=num[i];
			}
		} 
		System.out.printf("\nA maior pontua��o �%.2f",maiorPonto);

	}

}
