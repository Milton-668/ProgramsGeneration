package SegundoPrograma;

public class TesteFornecedor01 {

	public static void main(String[] args) {
		
		Fornecedor01 joy = new Fornecedor01("AURELIO","MOOCA","48481000",25000,1500);
		
		System.out.println(joy.getNome());
		System.out.println(joy.getEndereco());
		System.out.println(joy.getTelefone());
		System.out.println(joy.getValorCredito());
		System.out.println(joy.getValorDivida());
		System.out.println(joy.obterSaldo());

	}

}
