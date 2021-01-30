import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		/* 1.
		 * Faça um programa que crie um vetor por leitura com 
		 * 5 valores de pontuação de uma atividade e o escreva 
		 * em seguida. Encontre após a maior pontuação e a apresente.
		 */
		
		int num []= new int[5];
		int ponto=0;
		double maiorPonto=0.00;

		for(int i=0;i<5;i++)
		{
			System.out.printf("Insira a %d° pontuação:",ponto+1);
			num[i]=ler.nextInt();
			
			ponto++;
			
			if(num[i]>maiorPonto)
			{
				maiorPonto=num[i];
			}
		} 
		System.out.printf("\nA maior pontuação é%.2f",maiorPonto);

	}

}
