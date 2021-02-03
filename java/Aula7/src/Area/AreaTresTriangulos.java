package Area;

import java.util.Locale;
import java.util.Scanner;

public class AreaTresTriangulos 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); // define o tipo de padronização
		
		double a,b,c;
		double base, altura, area;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("\n Digite o valor a base do %d° triangulo: %.2f",(i+1),base);
			base = ler.nextDouble();
			System.out.printf("\n Digite o valor a altura do %d° triangulo: %.2f",(i+1),altura);
			altura = ler.nextDouble();
			
		}
		if(a>b && a>c)
		{
			maior=a;
		}
		else if(b>a && b>c)
		{
			maior=b;
		}
		else
		{
			maior=c;
		}
		
	}
}
