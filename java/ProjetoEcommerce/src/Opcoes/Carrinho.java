package Opcoes;

public class Carrinho {

	public String produto;
	public double preco;
	public int quantidade;
	public double subtotal;
	public double somaTotal;
	public Carrinho(String produto, double preco, int quantidade) {
		this.produto=produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public double subtotal() {
		subtotal=preco*quantidade;
		return subtotal;
	}
	//Tinha feito um m�todo para calular o Total aqui, mas ele n�o funcionou no la�o for da list
	
}
