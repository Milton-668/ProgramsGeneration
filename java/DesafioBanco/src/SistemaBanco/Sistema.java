package SistemaBanco;

import java.util.Scanner;

public class Sistema 
{
	public static void step ()
	{
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		
		int tipo,c1,c2,c3,c4,c5;
		char mov,desc,opc,ces;
		double valor,saldo=0.0;
		
		System.out.printf("SELECIONE O TIPO DE CONTA:");
		step();
		System.out.printf("1-CONTA POUPANÇA - DATA DE ANIVERSÁRIO CORREÇÃO DE 0.05");
		step();
		System.out.printf("2-CONTA CORRENTE - PODE EMITI TALÃO NO MAXIMO 3");
		step();
		System.out.printf("3-CONTA ESPECIAL - TEM LIMITE DE CHEQUE ESPECIAL ");
		step();
		System.out.printf("4-CONTA EMPRESA - PODE PEDI EMPRESTIMO");
		step();
		System.out.printf("5-CONTA ESTUDANTIL - TEM LIMITE ESTUDANTE");//minha
		tipo=ler.nextInt();
		
		do
		{
			if(tipo==1)
			{
				System.out.printf("SELECIONE O MOVIMENTO - D/C:");
				mov=ler.next().charAt(0);
				if(mov=='D' || mov=='d')
				{
					System.out.printf("VALOR:");
					saldo=ler.nextDouble();
					step();
					System.out.printf("DESCRIÇÃO:");
					desc=ler.next().charAt(0);
					step();
					System.out.printf("SALDO ATUAL:");
					saldo=ler.nextDouble();
					step();
				}
				else if(mov=='C' || mov=='C')
				{
					System.out.printf("VALOR:");
					saldo=ler.nextDouble();
					step();
					System.out.printf("DESCRIÇÃO:");
					desc=ler.next().charAt(0);
					step();
					System.out.printf("SALDO ATUAL:");
					saldo=ler.nextDouble();
					step();
				}
			}
		step();
		System.out.printf("CONTINUA S/N:");
		opc=ler.next().charAt(0);
		}while(opc=='S' || opc=='s');
		
		while(ces=='S'|| ces=='S')
		{
			System.out.print("CONTA ESTUDANTIL");
			System.out.print("DESEJA USAR O LIMITE DE ESTUDANTE - S/N:");
			System.out.print("SE SIM ELE TE PODE USAR 5 MIL");
			System.out.print("CONTA ESTUDANTIL");
			System.out.printf("CONTINUA S/N:");
			ces=ler.next().charAt(0);
			
			
			if(valor<5000)
			{
				System.out.print("SE SIM ELE TE PODE USAR 5 MIL:");
				valor=ler.nextDouble();
				
			}
			else
			{
				System.out.print("\nValor não aceito!");
			}
				
				
				
		}
		
	}
	
	
	
	
	
}
