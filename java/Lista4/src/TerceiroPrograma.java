import java.util.Scanner;
import java.util.Random;

public class TerceiroPrograma {

	public static void main(String[] args) {
		/*
		 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: a) Uma
		 * matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
		 * matrizes N1 e N2; b) Uma matriz M2 cujos elementos serão as diferenças dos
		 * elementos de mesma posição das matrizes N1 e N2.
		 */
		Scanner ler = new Scanner(System.in);
		Random random = new Random();

		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];

		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				n1[linha][coluna] = random.nextInt(9) + 1;
				n2[linha][coluna] = random.nextInt(9) + 1;

				m1[linha][coluna] = (n1[linha][coluna] + n2[linha][coluna]);
				m2[linha][coluna] = (n1[linha][coluna] - n2[linha][coluna]);
			}

		}
		System.out.print("MATRIZ 1");
		for (int linha = 0; linha < 4; linha++) {
			System.out.print("\n");
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.printf("|" + m1[linha][coluna] + "|");
			}
		}

		System.out.print("\nMATRIZ 2");
		for (int linha = 0; linha < 4; linha++) {
			System.out.print("\n");
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.printf("|" + m2[linha][coluna] + "|");

			}
		}
	}

}
