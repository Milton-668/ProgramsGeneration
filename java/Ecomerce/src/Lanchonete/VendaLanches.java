package Lanchonete;

import java.util.Scanner;
import java.text.DecimalFormat;

public class VendaLanches {
	
	static DecimalFormat formatar = new DecimalFormat("0.00");
	
	

	public static void main(String[] args) throws InterruptedException {

		Scanner ler = new Scanner(System.in);

		String tratamento = "";
		String nome = "";
		
		final int nItens = 10;
		int IDProduto = 0, qtd = 0;
		String produtoA[] = { "Misto-Quente", "Americano", "X-Burguer", "X-Salada", "X-Bacon", "X-Egg", "X-BaconEgg",
				"X-Frango", "X-FrangoEgg", "X-TUDO" };
		double precoA[] = { 4.0, 5.0, 6.5, 7.0, 8.0, 6.5, 9.0, 7.0, 8.0, 12.5 };
		double totalGeral = 0.0;
		int carrinhoA[] = new int[nItens], estoqueA[] = new int[nItens];
		int opcao = 0;

		if (opcao == 0) {
			for (int i = 0; i < nItens; i++) {
				estoqueA[i] = 10;
			}
		}

		opcao = menu(tratamento, nome);

		switch (opcao) {
		case 1:
			cadastro();
			break;
		case 2:
			produtos();
			break;
		case 3:
			carrinho();
			break;
		default:

			System.out.print("Op��o invalida!\n\nTente novamente. ");

			return;
		}
	}

	private static void main() {
		// TODO Auto-generated method stub

	}

	public static int menu(String tratamento1, String nome1) {
		int opcao = 0;
		Scanner ler = new Scanner(System.in);

		System.out.print("Ol�, por favor, escolha uma das op��es a seguir"
				+ "\ndigitando o numero correspondente a op��o desejada: " + "\n" + "\n1. Cadastro/login"
				+ "\n2. Produtos" + "\n3. Carrinho" + "\nInsira aqui: ");
		opcao = ler.nextInt();

		return opcao;
	}

	public static void cadastro() throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		char sexo;
		String nome = "";
		String tratamento = "";
		final int nItens = 10;
		int carrinhoA[] = new int[nItens], estoqueA[] = new int[nItens];
		double totalGeral = 0.0;
		for (int i = 0; i < nItens; i++) {
			estoqueA[i] += carrinhoA[i];
			carrinhoA[i] = 0;
			totalGeral = 0.0;
		}

		System.out.print("#CADASTRO");
		System.out.print("\n\nInsira o seu nome: ");
		nome = ler.next();
		System.out.print("Insira o seu sexo (F/M): ");
		sexo = ler.next().charAt(0);

		if (sexo == 'M' || sexo == 'm') {
			tratamento = "Sr. ";
		} else if (sexo == 'F' || sexo == 'f') {
			tratamento = "Sra. ";
		} else {
			tratamento = "Srx. ";
		}

		Thread.sleep(1000);
		step();

		System.out.print("cadastro concluido!");
		Thread.sleep(2000);

		return;//main();
	}

	public static void produtos() throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		final int nItens = 10;
		int IDProduto = 0, qtd = 0;
		String produtoA[] = { "Misto-Quente", "Americano", "X-Burguer", "X-Salada", "X-Bacon", "X-Egg", "X-BaconEgg",
				"X-Frango", "X-FrangoEgg", "X-TUDO" };
		double precoA[] = { 4.0, 5.0, 6.5, 7.0, 8.0, 6.5, 9.0, 7.0, 8.0, 12.5 };
		double totalGeral = 0.0;
		int carrinhoA[] = new int[nItens], estoqueA[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		int opcao = 0;
		System.out.println("#PRODUTOS");
		System.out.println("\n\n|\tID\t|\tPre�o\t|    Carrinho   |     Estoque   |\tProduto\t\n");
		System.out
				.println("----------------------------------------------------------------------------------------\n");
		for (int i = 0; i < nItens; i++) {
			System.out.println("|\t" + (i + 1) + "\t|\t" + precoA[i] + "\t|\t" + carrinhoA[i] + "\t|\t" + estoqueA[i]
					+ "\t|\t" + produtoA[i] + "\n");
			if (carrinhoA[i] != 0) {
				totalGeral += carrinhoA[i] * precoA[i];
			}
		}
		System.out.println("--------------------------");
		System.out.print("\nTotal Geral: "+formatar.format(totalGeral)+"\n");
		System.out.println("--------------------------");
		System.out.println("\nPor favor, insira o ID correspondente ao produto que voc� deseja adicionar ao carrinho:\n"
				+ "[Caso deseje voltar, insira 0 (Zero)]." + " Insira aqui: ");
		IDProduto = ler.nextInt();
		if (IDProduto == 0) {
			// u.aguarde(1000)
			System.out.println("Retornando para o menu.");
			// u.aguarde(1500)
			main();
		} else if (IDProduto > nItens || IDProduto < 0) {
			System.out.println("\ncaracter invalido!\nTente novamente.");
			// u.aguarde(2000)
			produtos();
		} else if (estoqueA[IDProduto - 1] == 0) {
			System.out.println("\nSinto muito!\nEste produto esta sem estoque, selecione outro produto");
			// u.aguarde(5000)
			produtos();
		}
		System.out.println("\nInsira quantas unidades do produto (" + produtoA[IDProduto - 1] + ") voc� deseja: ");
		qtd = ler.nextInt();
		if (qtd > estoqueA[IDProduto - 1]) {
			System.out.println("\nInfelizmente s� temos " + estoqueA[IDProduto - 1] + " unidades de "
					+ produtoA[IDProduto - 1] + " em estoque."
					+ "\nEscolha outro produto ou selecione uma quantidade menor para este produto");
			// u.aguarde(8000)
			produtos();
		} else if (qtd <= 0) {
			System.out.println("\nQuantidade invalida!\nEscolha outro produto.");
			// u.aguarde(2000)
			produtos();
		}
		estoqueA[IDProduto - 1] -= qtd;
		carrinhoA[IDProduto - 1] += qtd;
		do {
			System.out.println("Foram adicionadas " + carrinhoA[IDProduto - 1] + " unidades de "
					+ produtoA[IDProduto - 1] + " ao seu carrinho!"
					+ "\nVoc� deseja continuar comprando?\n1. Sim\n2. N�o\n\nInsira aqui: ");
			opcao = ler.nextInt();
			if (opcao != 1 && opcao != 2) {
				System.out.println("Op��o invalida!");
				// u.aguarde(1000)
			}
		} while (opcao != 1 && opcao != 2);
		if (opcao == 1) {
			produtos();
		} else {
			carrinho();
		}
	}

	public static void carrinho() throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		char efetuarCompra;
		String formaPagamento = "";
		double totalPagar = 0.0;
		double totalGeral = 0.0;
		int verificaCarrinho = 0;
		final int nItens = 10;
		int carrinhoA[] = new int[nItens];
		String produtoA[] = { "Misto-Quente", "Americano", "X-Burguer", "X-Salada", "X-Bacon", "X-Egg", "X-BaconEgg",
				"X-Frango", "X-FrangoEgg", "X-TUDO" };
		double precoA[] = { 4.0, 5.0, 6.5, 7.0, 8.0, 6.5, 9.0, 7.0, 8.0, 12.5 };
		int opcao = 0;
		int estoqueA[] = new int[nItens];

		System.out.printf("#CARRINHO");
		for (int i = 0; i < nItens; i++) {
			if (carrinhoA[i] == 0) {
				verificaCarrinho++;
			}
			if (verificaCarrinho == nItens) {
				System.out.printf("\n\nO Carrinho esta vazio");
				totalGeral = 0.0;
				// u.aguarde(2000)
				main();
			}
		}

		System.out.print("\n\n|\tID\t|\tPre�o\t|    Carrinho   |\tProduto\t\n");
		System.out.print("---------------------------------------------------------------------\n");

		for (int i = 0; i < nItens; i++) {
			if (carrinhoA[i] != 0) {
				System.out.printf("|\t", (i + 1), "\t|\t", precoA[i], "\t|\t", carrinhoA[i], "\t|\t", produtoA[i],
						"\n");
				totalGeral += carrinhoA[i] * precoA[i];
			}
		}
		System.out.print("-----------------------------------------");
		System.out.print("\nTotal Geral: "+formatar.format(totalGeral)+ "- IMPOSTO (9%):\n" +formatar.format(totalGeral * 0.09));
		System.out.print("-----------------------------------------\n");
		System.out.print("\nEscolha a forma de pagamento\n");
		System.out.print("\n0. DESISTIR DA COMPRA");
		System.out.print("\n1. A VISTA - 10% DESCONTO: "+formatar.format(totalGeral * 0.9));
		System.out.print("\n2. CART�O - 1 VEZ:"+formatar.format(totalGeral)+" -SEM DESCONTO");
		System.out.print("\n3. CART�O - 2 VEZES - JUROS (10%) - PARCELAS DE:"+formatar.format(totalGeral * 1.1 / 2)+"TOTAL DE: "+
				formatar.format(totalGeral * 1.1));
		System.out.print("\n4. CART�O - 3 VEZES - JUROS (15%) - PARCELAS DE:" +formatar.format(totalGeral * 1.15 / 3)+"- TOTAL DE: "
				+formatar.format(totalGeral * 1.15));
		System.out.println("\nInsira Aqui: ");
		System.out.println();

		opcao = ler.nextInt();

		if (opcao == 0) {
			for (int i = 0; i < nItens; i++) {
				estoqueA[i] += carrinhoA[i];
				carrinhoA[i] = 0;
				totalGeral = 0.0;
			}
			main();

		} else if (opcao == 1) {
			formaPagamento = "A VISTA";
			totalPagar = (totalGeral * 0.9);
		} else if (opcao == 2) {
			formaPagamento = "1 VEZ NO CART�O";
			totalPagar = (totalGeral);
		} else if (opcao == 3) {
			formaPagamento = "2 VEZES NO CART�O";
			totalPagar = (totalGeral * 1.1);
		} else if (opcao == 4) {
			formaPagamento = "3 VEZES NO CART�O";
			totalPagar = (totalGeral * 1.15);
		} else {
			System.out.print("\ncaracter invalido!\nTente novamente");
			carrinho();
		}

		System.out.printf("\nVoc� deseja efeturar a compra na op��o %s no valor de %.2f? (S/N): ", formaPagamento,
				totalPagar);
		efetuarCompra = ler.next().charAt(0);

		if (efetuarCompra == 'S' || efetuarCompra == 's') {

			step();// limpa()
			System.out.print("Compra efetuada com Sucesso!");
			Thread.sleep(1500);// u.aguarde(1500)
			step();// limpa()
			System.out.print("Burguer Store\n");
			System.out.print("-------------------------\n");
			System.out.print("VALOR DO IMPOSTO (9%)"+formatar.format(totalGeral * 0.09)+"\n");

			System.out.print("CARRINHO\tPRE�O\tPRODUTO\n");

			for (int i = 0; i < nItens; i++) {
				if (carrinhoA[i] != 0) {
					System.out.print(carrinhoA[i] + "\t\t" + (precoA[i] * carrinhoA[i]) + "\t" + produtoA[i] + "\n");
				}
			}

			System.out.print("\nTOTAL GERAL:"+formatar.format(totalGeral));
			System.out.print("\nOP��O DE PAGAMENTO:"+formatar.format(formaPagamento) );
			System.out.print("\nTOTAL A SER PAGO:"+formatar.format(totalPagar)+"\n");
			System.out.print("\nVOLTE SEMPRE:");
			Thread.sleep(10000);// u.aguarde (10000)
			String nome = "";
			String tratamento = "";

			for (int i = 0; i < nItens; i++) {
				carrinhoA[i] = 0;
			}
			main();
		} else if (efetuarCompra == 'N' || efetuarCompra == 'n') {
			carrinho();
		} else {
			System.out.print("\nCaracter Inv�lido\nTente novamente");
			Thread.sleep(2000);// u.aguarde(2000);
			carrinho();
		}
	}

	public static void step() {
		System.out.print("\n\n\n\n\n\n");
	}
}
