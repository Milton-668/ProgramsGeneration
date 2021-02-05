package EmpregadoTipo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;


public class TesteEmpList {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		List <CadastroEmpegado> lista = new ArrayList<>();
		
		System.out.println("Digite o numero de empregados: ");
		int numero = leia.nextInt();
		
		for(int x=1;x<=numero; x++)
		{
			System.out.println("Funcionario: "+x);
			leia.nextLine();
			System.out.println("Terceiro S/N :");
			char op = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite a matrícula: ");
			int matricula = leia.nextInt();
			leia.nextLine();
			System.out.println("Digite o nome: ");
			String nome = leia.nextLine();
			System.out.println("Digite as horas trabalhadas: ");
			int horas = leia.nextInt();
			System.out.println("Digite o valor por hora trabalhada: ");
			double valorHora = leia.nextDouble();
			
			if (op =='S')
			{
				System.out.println("INSIRA O VALOR DO ACRESCIMO: ");
				double acrescimo= leia.nextDouble();
				lista.add(new EmpregadoTerceiro(nome,matricula,horas,valorHora,acrescimo));
			}
			else if(op =='N')
			{
				lista.add(new CadastroEmpegado(nome,matricula,horas,valorHora));
			}			
		}
		System.out.println();
		System.out.println("PAGAMENTOS");
		for (CadastroEmpegado emp: lista)
		{
			System.out.println(emp.getNome()+ "- R$" + String.format("%.2f", emp.salarioNormal()));
		}
		
		
		
		

	}

}
