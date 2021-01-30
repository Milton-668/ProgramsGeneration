import java.util.Scanner;

import java.util.Random;

public class SegundoPrograma {

	public static void main(String[] args) {
		/*
		 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um
		 * programa que gere um vetor com os lan�amentos, escreva esse vetor. A seguir
		 * determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e
		 * apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o. *
		 */
		Random random = new Random();

		Scanner ler = new Scanner(System.in);

		// int lancamentos[];
		int lancamentos[] = new int[10];
		double somatorio = 0.00;
		double media = 0.00;
		int maiorValor = 0;
		int i, contador = 0;

		for (i = 0; i < 10; i++) {
			lancamentos[i] = random.nextInt(6);
			somatorio += lancamentos[i];
			if (lancamentos[i] >= maiorValor) {
				if (lancamentos[i] == maiorValor) {
					contador++;
				} else {
					contador = 1;
				}
				maiorValor = lancamentos[i];
			}

		}

		for (i = 0; i < 10; i++) {
			System.out.printf("\nLancamento %d� � igual a %d\n",(i + 1),lancamentos[i]);
		}
		media = somatorio / 10;
		System.out.printf("\nMaior valor informado foi %d que aparece %d nos lan�amentos", maiorValor, contador);
		System.out.printf("\nA soma dos valores � %.2f\n", somatorio);
		System.out.printf("\nA m�dia aritm�tica � %.2f\n", media);

	}

}
