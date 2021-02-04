package QuintoPrograma;

import PrimeiroPrograma.Pessoa01;

public class ObjOperator {
	
	
	public static void main(String[] args) 
	{
		
		
		Operator maurelio = new Operator("MAUREIO","SANTA-ROSA","4545-6969", 50000, 0.01,1500);
		
		System.out.println(maurelio.getNome());
		System.out.println(maurelio.getEndereco());
		System.out.println(maurelio.getTelefone());
		System.out.println(maurelio.getValorProducao());
		System.out.println(maurelio.getComissao());
		System.out.println(maurelio.calcularComissao());
		System.out.println(maurelio.salarioComissao());
	

	}

}
