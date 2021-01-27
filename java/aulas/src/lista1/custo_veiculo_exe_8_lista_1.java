package lista1;

import java.util.Scanner;

public class custo_veiculo_exe_8_lista_1 
{
	
	public static void main (String []args)
	{
		/*
		 * 8. O custo ao consumidor de um carro 
		 * novo é a soma do custo de fábrica com 
		 * a percentagem do distribuidor e dos 
		 * impostos (aplicados ao custo de fábrica). 
		 * Supondo que a percentagem do distribuidor 
		 * seja de 28% e os impostos de 45%, escrever 
		 * um sistema que leia o custo de fábrica de 
		 * um carro e escreva o custo ao consumidor. 
		 */
		
		Scanner ler = new Scanner (System.in);
		
		double valorVeiculo,imp,dist;
		double custo, valorFinal;
		
		System.out.println("Entre com os custos da fabrica: ");
		custo= ler.nextDouble();
		
		imp=(custo*0.45);
		dist=(custo*0.28);
		
		valorVeiculo=(imp+dist+custo);
		
		
		
		System.out.println("O cliente pagará:\n");
		System.out.println(valorVeiculo);
	}
}
