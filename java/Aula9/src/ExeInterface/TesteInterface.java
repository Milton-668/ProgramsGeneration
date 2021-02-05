package ExeInterface;

public class TesteInterface {

	public static void main(String[] args)
	{
		ParticipanteForum participante = new ParticipanteForum();
		Leitor leitor = participante;
		
		System.out.println("O PARTICIPANTE ESTÁ LENDO:"+leitor.lendo());
		Programador programador = participante;
		String java="JAVA";
		
		programador.pensando(java.toCharArray());
		System.out.println(" E PROGAMANDO:"+programador.digitando());
		

	}

}
