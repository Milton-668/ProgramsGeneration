package QuartoPrograma;

public class ObjFuncionario {

	public static void main(String[] args) 
	{
		Funcionario cadastro = new Funcionario("JO�O",150,62,"FRIOS");
		
		System.out.print("NOME\tC�DIGO\tIDADE\tSETOR\n");
		System.out.print(cadastro.nome+"\t"+cadastro.codigo+"\t"+cadastro.idade+"\t"+cadastro.setor);


	}

}
