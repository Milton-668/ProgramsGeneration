import java.util.Random;
import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) 
	{
		
		/* 4*
		 * Crie um programa que receba valores do usuário para preencher
		 * uma matriz 3X3, e em seguida, exiba a soma dos valores dela e
		 * a soma dos valores da primeira diagonal, ou seja, diagonal principal.
		 *
		 */
		 
		Random random = new Random();
		
		int[][]cubo = new int[4][4];
		int linha,coluna;
		int somatorio=0;
		
		 for ( linha = 0; linha<4; linha++) 
		 {
		 	for ( coluna = 0; coluna<4; coluna++) 
		 	{
		 			cubo[linha][coluna] = random.nextInt(9)+1;
		 			if (linha==coluna)
		 			{
		 				somatorio += cubo[linha][coluna];
		 			}
		 			System.out.printf(" ",cubo[linha][coluna]);
		 	}
		 	System.out.print("\n");

		 }
		 System.out.printf("\nSomatorio da diagonal principal é:%d ",somatorio);
		 
	}

}
