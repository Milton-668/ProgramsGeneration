package PrimeiroPrograma;

public class TesteAnimal {
	
	public static void main (String args[])
	{
		
		Animal cao = new Animal ("TICO",6,"VIRA-LATA CARAMELO","MÉDIO");
		Animal cavalo= new Animal ("PÉ-DE-PANO",6,"MUSTANG","GRANDE");
		Animal preguica= new Animal ("FILÓ-DORME-BEM",8,"BAHIANA","MEDIO");
		
		System.out.println(cao.getNome());
		System.out.println(cao.getIdade());
		System.out.println(cao.getRaca());
		System.out.println(cao.getTamanho());
		System.out.println(cao.latido());
		System.out.println(cao.deveCorrer());
		step();
		System.out.println(cavalo.getNome());
		System.out.println(cavalo.getIdade());
		System.out.println(cavalo.getRaca());
		System.out.println(cavalo.getTamanho());
		System.out.println(cavalo.relincho());
		System.out.println(cavalo.deveCorrer());
		step();
		System.out.println(preguica.getNome());
		System.out.println(preguica.getIdade());
		System.out.println(preguica.getRaca());
		System.out.println(preguica.getTamanho());
		System.out.println(preguica.assuvio());
		System.out.println(preguica.subirArvore());
		//preguica.subirArvore();
		//preguica.assuvio();
	}
	
	public static void step() {
		System.out.print("\n\n");
	}
	

}
