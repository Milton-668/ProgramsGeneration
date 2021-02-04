package QuartaPrograma;

public class TesteAdm {

	public static void main(String[] args) 
	{
		Administrador ajuda = new Administrador("Joao","TAMANDUATEI","4545-5050", 5000);
		
		System.out.println(ajuda.getNome());
		System.out.println(ajuda.getEndereco());
		System.out.println(ajuda.getTelefone());
		System.out.println(ajuda.getAjudaDeCusto());
	}

}
