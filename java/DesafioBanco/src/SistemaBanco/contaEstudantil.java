package SistemaBanco;

import java.util.Scanner;

public class contaEstudantil 
{
	public static void step ()
	{
		System.out.println();
	}
	
	//MENU CONTA ESTUDANTIL
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int tipo;
		char mov,opc,ces,fim;
		String desc;
		double valor=0.0,saldo=0.0,saldoAtual=0.0, credito=0.0,debito=0.0;
		double emprestimo=0.0,valorEmprestimo=0.00,saldoFinal=0.00;
		char opcao;
		
		System.out.print("\nVoc� selecionou a Conta Estudandil");
		for(int i=1;i<=10;i++)
		{
				    	
			System.out.printf("\n%d�Consulta: Escolha D-D�bito/C-Cr�dito",i);	
			mov=ler.next().toUpperCase().charAt(0);
			if(mov=='D')
			{
				System.out.printf("\nDigite o valor para d�bito: ");
				debito=ler.nextDouble();
				if(saldo>0)
				{
					while(saldo<debito)
					{
						System.out.printf("\nSaldo indisponivel, atual %.2f, tente de novo!!!\n",saldo);
						System.out.print("\nDigite o valor para d�bito :");
						debito = ler.nextDouble();
					}
					ler.nextLine();
					System.out.print("\nDescri��o do d�bito :");
					desc = ler.nextLine();
					saldo = saldo - debito;
					System.out.printf("\nSaldo atual � R$ %.2f\n", saldo);
				}
				else if (saldo==0)
				{
					System.out.println("\n0 saldo, fa�a um cr�dito primeiro!!!");
				}
			}
			else if (mov=='C')
			{
				System.out.print("\nDigite o valor do cr�dito: ");
				credito = ler.nextDouble();
				while (credito <=0 )
				{
					System.out.print("\nValor informado negativo ou zero, tente de novo:");
					System.out.print("\nDigite o valor do cr�dito: ");
					credito = ler.nextDouble();
				}
				ler.nextLine();
				System.out.print("\nDigite a descri��o do cr�dito: ");
				desc = ler.nextLine();
				saldo = saldo + credito;
				System.out.printf("\nSaldo atual � R$ %.2f \n", saldo);
			}
			else
			{
				System.out.println("\nVoc� n�o escolheu Debito ou Cr�dito!!!");
			}
			
			System.out.print("\nContinua S/N :");
			fim = ler.next().toUpperCase().charAt(0);
			if (fim == 'N')
			{
				break;
			}
			
			
		}
			System.out.printf("\nDESEJA USAR O LIMITE DE ESTUDANTE - S/N:");
			System.out.printf("\nSE SIM ELE TE PODE USAR 5 MIL: ");
			opcao = ler.next().toUpperCase().charAt(0);
			
			
			do//if(opcao=='S')
			{
				
				System.out.printf("\nInsira o valor do Empr�stimo:");
				emprestimo = ler.nextDouble();
				if(emprestimo<5000)
				{
					valorEmprestimo=emprestimo;
					
				}
				else 
				{
					System.out.printf("\nValor Inv�lido");
				}
				
				saldoFinal=valorEmprestimo+saldo;
				System.out.printf("\nO saldo final da sua conta �: %.2f\n",saldoFinal);
				
				System.out.printf("\nDESEJA CONTINUAR?- S/N: ");
				opcao = ler.next().toUpperCase().charAt(0);
			}while(opcao=='S');	
			
			System.out.printf("\nOBRIGADO POR UTILIZAR NOSSOS SERVI�OS ");
			
		}
	
	
}
