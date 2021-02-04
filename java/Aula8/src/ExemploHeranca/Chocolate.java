package ExemploHeranca;

public class Chocolate extends Fabrica {

	public Chocolate(String freezer, String misturador, String materiaPrima) {
		super();
		this.freezer = freezer;
		this.misturador = misturador;
		this.materiaPrima = materiaPrima;
	}

	public Chocolate() {
	}

	private String freezer;
	private String misturador;
	private String materiaPrima;

	public void Ligarfreezer() {
		System.out.println("Ligar freezer !!!");
	}

	public void Desligarfreezer() {
		System.out.println("Ligar freezer !!!");
	}

	public String getFreezer() {
		return freezer;
	}

	public void setFreezer(String freezer) {
		this.freezer = freezer;
	}

	public String getMisturador() {
		return misturador;
	}

	public void setMisturador(String misturador) {
		this.misturador = misturador;
	}

	public String getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(String materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
}
