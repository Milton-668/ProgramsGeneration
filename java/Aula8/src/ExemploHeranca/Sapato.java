package ExemploHeranca;

public class Sapato extends Fabrica{
	
	
	
	public Sapato(String prensaSola, String maquinaDeGrampeador) {
		super();
		this.prensaSola = prensaSola;
		this.maquinaDeGrampeador = maquinaDeGrampeador;
	}
	public Sapato() {
	}
	private String prensaSola;
	private String maquinaDeGrampeador;
	public void LigarPrensa() {
		System.out.println("Ligar Prensa");
	}
	public void DesligarPrensa() {
		System.out.println("Ligar Prensa");
	}
	public String getPrensaSola() {
		return prensaSola;
	}
	public void setPrensaSola(String prensaSola) {
		this.prensaSola = prensaSola;
	}
	public String getMaquinaDeGrampeador() {
		return maquinaDeGrampeador;
	}
	public void setMaquinaDeGrampeador(String maquinaDeGrampeador) {
		this.maquinaDeGrampeador = maquinaDeGrampeador;
	}


}
