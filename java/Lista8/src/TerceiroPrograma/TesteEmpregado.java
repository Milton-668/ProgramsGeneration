package TerceiroPrograma;

import PrimeiroPrograma.Pessoa01;

public class TesteEmpregado {

	public static void main(String[] args) 
	{
	
		Empregado joao = new Empregado("Joao","TAMANDUATEI","4545-5050",150, 1500, 0.09);
		
		System.out.println(joao.getNome());
		System.out.println(joao.getEndereco());
		System.out.println(joao.getTelefone());
	
		System.out.println(joao.getCodigoSetor());
		System.out.println(joao.getSalarioBase());
		System.out.println(joao.getImposto());
		System.out.println(joao.calcularSalario());

	}

}
