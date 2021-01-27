package lista1;

import java.util.Scanner;

public class tempo_h_m_s_exe_3_1 
{
	
	public static void main (String []args)
	{
		/*
		 * 3. Faça um sistema que leia o tempo de 
		 * duração de um evento em uma fábrica 
		 * expressa em segundos e mostre-o expresso 
		 * em horas, minutos e segundos. 
		 */
		
		int h,m,s,tempo;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o tempo do evento:");
		tempo= ler.nextInt();

		s=(tempo);
		m=((tempo/60));
		h=((tempo/3600));

		
		System.out.print("\nA quantidade em horas é:"+h);
		System.out.print("\nA quantidade em minutos é:"+m);
		System.out.print("\nO resultado em dias é:"+s);	
		
	}
	

}
