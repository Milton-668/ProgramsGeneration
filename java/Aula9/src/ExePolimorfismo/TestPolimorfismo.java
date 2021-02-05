package ExePolimorfismo;

public class TestPolimorfismo {

	public static void main(String[] args) {
		
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(4448889002L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("RICHARD");
		juridica.setCnpj(295558480001L);
		
		Pessoa001[] pessoas = new Pessoa001[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa001 pessoa: pessoas)
		{
			System.out.println(pessoa.getNome());
		}
	}

}
