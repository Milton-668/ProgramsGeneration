package SextoPrograma;

public class ObjVendedor {

	public static void main(String[] args) {
		
		Vendedor boy = new Vendedor("Marcinho","M.APARECIDA","90908070",10000,0.05,1200);
		
		System.out.println(boy.getNome());
		System.out.println(boy.getEndereco());
		System.out.println(boy.getTelefone());
		System.out.println(boy.getValorVendas());
		System.out.println(boy.getComissaoVendedor());
		System.out.println(boy.getVencimentoBase());
		System.out.println(boy.calcularComissao());
		System.out.println(boy.salarioComissao());
		

	}

}
