package lista1;

import java.util.Scanner;

public class media_ponderada_exe_5_1 
{
		/*
		 * 5. Fa�a um sistema que leia as 3 notas 
		 * de um aluno e calcule a m�dia final 
		 * deste aluno. Considerar que a m�dia � 
		 * ponderada e que o peso das notas 
		 * �: 2,3 e 5, respectivamente. 
		 */
		public static void main (String []args)
		{
			Scanner ler = new Scanner (System.in);
			
			double n1,n2,n3,media;
		
			System.out.println("\nEscreva a 1�nota");
			n1= ler.nextDouble();
			System.out.println("\nEscreva a 2�nota");
			n2= ler.nextDouble();
			System.out.println("\nEscreva a 3�nota");
			n3= ler.nextDouble();
			
			
			media=(((n1*2 + n2*3 + n3*5)/10));
		
			System.out.print("A media �:"+ media);
		}
		

}
