package SistemaBanco;

import java.util.Scanner;

public class Poupanca 
{
	public static void step ()
	{
		System.out.println();
	}
	public static void main(String[] args) 
	{
		
		Scanner ler = new Scanner (System.in);
		
		int tipo,c1,c2,c3,c4,c5;
		char mov,opc,ces='S';
		String desc;
		double valor=0.0,saldo=0.0,saldoAtual=0.0;
		
		//System.out.print("Você selecionou a Conta Estudandil");
		
		//do
		//{
			//System.out.println("CONTA ESTUDANTIL\n");
			//System.out.print("DESEJA USAR O LIMITE DE ESTUDANTE - S/N:");
			//System.out.print("SE SIM ELE TE PODE USAR 5 MIL: ");
			//System.out.print("\nCONTA ESTUDANTIL");
			//ces=ler.next().charAt(0);
			//while(ces=='N') 
			//{
				//System.out.print("CONTA ESTUDANTIL\n");
				System.out.printf("DESEJA USAR O LIMITE DE ESTUDANTE - S/N:");
				System.out.printf("SE SIM ELE TE PODE USAR 5 MIL: ");
				//System.out.printf("\nCONTA ESTUDANTIL");
				ces=ler.next().charAt(0);
			
			System.out.printf("SELECIONE O MOVIMENTO - D/C:");
			mov=ler.next().charAt(0);
			
			if(mov=='D' || mov=='d')
			{
				System.out.printf("VALOR:");
				saldo=ler.nextDouble();
				step();
				System.out.printf("DESCRIÇÃO:");
				desc=ler.next();
				step();
			if(valor<5000)
			{
				saldoAtual=valor+saldo;
			}
				System.out.printf("SALDO ATUAL:%.2f",saldoAtual);
				//saldoAtual=ler.nextDouble();
				step();
			}
			else if(mov=='C' || mov=='C')
			{
				System.out.printf("VALOR:");
				saldo=ler.nextDouble();
				step();
				System.out.printf("DESCRIÇÃO:");
				desc=ler.next();
				step();
				if(valor<5000)
				{
					saldoAtual=valor+saldo;
				}
					System.out.printf("SALDO ATUAL:%.2f",saldoAtual);
					//saldoAtual=ler.nextDouble();
					step();
				}
			
			}
		//System.out.printf("CONTINUA S/N:");
		//ces=ler.next().charAt(0);
	//	}while(ces=='N');
	}
}
