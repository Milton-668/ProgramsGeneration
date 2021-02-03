package QuintoPrograma;


public class ObjPatinete {

	public static void main(String[] args)
	{
		Patinete cadastro = new Patinete("ADULTO",250,"AZUL",30);
		
		System.out.print("TAMANHO\tPREÇO\tCOR\tCÓDIGO\n");
		System.out.print(cadastro.tamanho+"\t"+cadastro.preco+"\t"+cadastro.cor+"\t"+cadastro.codigo);


	}

}
