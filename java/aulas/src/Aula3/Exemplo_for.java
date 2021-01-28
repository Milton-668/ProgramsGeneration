package Aula3;

import java.util.Scanner;

public class Exemplo_for {

	public static void main(String[] args) 
	{
		
	/*					PARA
		* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de 
		* seus habitantes, coletando dados sobre o salário e número de 
		* filhos. A prefeitura deseja saber:   
		* a) média do salário da população; 
		* b) média do número de filhos; 
		* c) maior salário; 
		d) percentual de pessoas com salário até R$100,00
		*/		
		Scanner ler = new Scanner (System.in);
		
		double sal=0.0;
		double mediaSal=0.0;
		double maiorSal=0.0;
		double mediaF=0.0;
		double percentualSal=0.0;
		double filho=0.0;
		final int h=2;
		int giro;
		double totalSal = 0.0;
		double totalFil = 0.0;
		double contador =0.0;
				
				
		for(giro=1; giro<=h; giro++)
			{
				System.out.printf("Insira o Salário:",giro," :");
				sal= ler.nextDouble();
					
				System.out.printf("Insira o número de filhos:",giro," :");
				filho= ler.nextDouble();
					

				totalSal=(totalSal+sal);
							
				//totalFil=totalFil+
				totalFil+=filho;
				
				if(sal> maiorSal)
				{
					maiorSal=(sal);
				}
				if(sal<=100)
				{
					//contadorValor100=contadorValor100+1
					contador+=1;
					//contadorValor100++
				}
					
				}
				
		mediaSal=(totalSal/h);
		mediaF=(totalFil/h);
		percentualSal=((contador/h)*100);
				
		System.out.printf("A media salarial é:R$%.2f",mediaSal);
		System.out.printf("\nA media de filhos é:%.2f",mediaF);
		System.out.printf("\nO maior salario inserido foi:%.2f",maiorSal);
		System.out.printf("\nNumero de pessoas que ganham até R$100,00: %.0f sendo o percentual:%.2f",contador,percentualSal,"%");

	}
	
	public static void step ()
	{
		System.out.println();
	}

}
