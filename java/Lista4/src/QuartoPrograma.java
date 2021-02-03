import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuartoPrograma {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 4* Crie um programa que receba valores do usuário para preencher uma matriz
		 * 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da
		 * primeira diagonal, ou seja, diagonal principal.
		 *
		 */

		Random random = new Random();

		int[][] cubo = new int[4][4];
		int linha, coluna;
		int somatorio = 0;

		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				cubo[linha][coluna] = random.nextInt(9) + 1;
				if (linha == coluna) {
					somatorio += cubo[linha][coluna];
				}
				System.out.printf(" ", cubo[linha][coluna]);
			}
			System.out.print("\n");

		}

		/*
		 * int delay = 5000; // delay de 5 seg. int interval = 1000; // intervalo de 1
		 * seg. Timer timer = new Timer();
		 * 
		 * timer.scheduleAtFixedRate(new TimerTask() { public void run() {
		 * System.out.printf("\nSomatorio da diagonal principal é:%d ",somatorio); } },
		 * delay, interval);
		 */

		Thread.sleep(10000);
		System.out.printf("\nSomatorio da diagonal principal é:%d ", somatorio);

	}

}
