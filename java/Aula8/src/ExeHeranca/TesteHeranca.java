package ExeHeranca;

public class TesteHeranca {

	public static void main(String[] args) 
	{
		Heranca1 abreu = new Heranca1 ("ABREU",111);
		Operario marcos = new Operario ("Marcos",222,"SOLDA");
		Heranca1 marcio = new Operario ("MARCIO",333,"ENGENHARIA");
		Heranca1 joana = new Coordenador ("JOANA",848,"MARKETING DIGITAL");
		
		System.out.println(abreu.getMatricula());
		System.out.println(marcos.getDepartamento());
		System.out.println(marcio.getNome());
		System.out.println(joana.getMatricula());

	}

}
