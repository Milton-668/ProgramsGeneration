package Aula3;

import java.util.Scanner;

public class Exemplo_for {

	public static void main(String[] args) 
	{
		
	/*					PARA
		* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de 
		* seus habitantes, coletando dados sobre o sal�rio e n�mero de 
		* filhos. A prefeitura deseja saber:   
		* a) m�dia do sal�rio da popula��o; 
		* b) m�dia do n�mero de filhos; 
		* c) maior sal�rio; 
		d) percentual de pessoas com sal�rio at� R$100,00
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
				System.out.printf("Insira o Sal�rio:",giro," :");
				sal= ler.nextDouble();
					
				System.out.printf("Insira o n�mero de filhos:",giro," :");
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
				
		System.out.printf("A media salarial �:R$%.2f",mediaSal);
		System.out.printf("\nA media de filhos �:%.2f",mediaF);
		System.out.printf("\nO maior salario inserido foi:%.2f",maiorSal);
		System.out.printf("\nNumero de pessoas que ganham at� R$100,00: %.0f sendo o percentual:%.2f",contador,percentualSal,"%");

	}
	
	public static void step ()
	{
		System.out.println();
	}

}
