package ExemploHeranca;

public class MainFabrica {

	public static void main(String[] args) {

		Fabrica Fab1 = new Fabrica();
		Chocolate Choco1 = new Chocolate();
		Sapato Pisante = new Sapato();

		Pisante.setNome("Bom Pé");
		Pisante.setQuantidadeDeFuncionarios(20);
		Choco1.getFreezer();
		Choco1.getMateriaPrima();

	}

}
