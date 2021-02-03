package TerceiroPrograma;

import SegundoPrograma.Aviao;

public class Eletronico {

	public static void main(String[] args) 
	{
		
		ProdutoElect eletro = new ProdutoElect("CPU","RESISTOR",55.00,"50x50cm");
		
		System.out.print("COMPONENTEA\tCOMPONENTEB\tVALOR\tTAMANHO\n");
		System.out.print(eletro.componenteA+"\t\t"+eletro.componenteB+"\t"+eletro.valor+"\t"+eletro.tamanho);

	}

}
