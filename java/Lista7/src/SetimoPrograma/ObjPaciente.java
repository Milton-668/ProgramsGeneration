package SetimoPrograma;



public class ObjPaciente {

	public static void main(String[] args) 
	{
		
		Paciente ficha = new Paciente ("MARIVAS",43,"ALTA");
		
		System.out.print("NOME\tIDADE\tLAUDO\n");
		System.out.print(ficha.nome+"\t"+ficha.idade+"\t"+ficha.laudo);

	}

}
