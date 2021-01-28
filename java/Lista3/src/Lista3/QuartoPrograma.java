package Lista3;

import java.util.Scanner;

public class QuartoPrograma 
{
	public static void step ()
	{
		System.out.println();
	}
	public static void main(String[] args)
	{
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as 
		 * características psicológicas dos indivíduos de uma 
		 * região. Para tanto, a cada uma das pessoas era 
		 * perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		 * e as opções (1, se a pessoa era calma; 2, se a pessoa era
		 *  nervosa e 3, se a pessoa era agressiva). Pede-se para 
		 *  elaborar um sistema que permita ler os dados de 150 pessoas, 
		 *  calcule e mostre: (WHILE)
		 *  o número de pessoas calmas; 
		 *  o número de mulheres nervosas; 
		 *  o número de homens agressivos; 
		 *  o número de outros calmos;
		 *  o número de pessoas nervosas com mais de 40 anos; 
		 *  o número de pessoas calmas com menos de 18 anos.
		 */
		Scanner ler = new Scanner (System.in);
		
		int idade=0,sexo=0,estado=0,pessoas=0;
		int caso1=0,caso2=0,caso3=0,caso4=0,caso5=0,caso6=0;
				
		while(pessoas<20)
		{
			System.out.print("Insira a sua idade: ");
			idade=ler.nextInt();
			System.out.print("Insira o seu sexo, sendo:");
			System.out.print("1-fem/2-masc/3-outros:");
			sexo=ler.nextInt();
			System.out.print("Como se considera?");
			System.out.print("1-Calmo/2-nervosa/3-agressiva");
			estado=ler.nextInt();
			
			pessoas++;
			
			if(estado==1)
			{
				 caso1++;
			}
			else if(sexo==1 && estado==2)
			{
				 caso2++;
				 //contEstadoNer++;
			}
			else if(sexo==2 && estado==3)
			{
				 caso3++;
				 //contEstadoAgre++;
			}
			else if(sexo==3 && estado==1)
			{
				 caso4++;
				 //contSexoOutr++;
			}
			else if(estado==2 && idade>40)
			{
				 caso5++;
				 //contIdadeQua++;
			}else if(estado==1 && idade<18)
			{
				 caso6++;
				 //contIdadeDezt++;
			}
			
		}
		System.out.printf("\nO número de pessoas calmas é:%d",caso1);
		System.out.printf("\nO número de mulheres nervosas é:%d",caso2);
		System.out.printf("\nO número de homens agressivos é:%d",caso3);
		System.out.printf("\nO número de outros calmos é:%d",caso4);
		System.out.printf("\nO número de pessoas nervosas com mais de 40 anos é:%d",caso5);
		System.out.printf("\nO número de pessoas calmas com menos de 18 anos é:%d",caso6);
		
	}

}
