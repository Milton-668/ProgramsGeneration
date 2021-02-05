package ExePolimorfismo;

public class PessoaFisica extends Pessoa001 {
	
	private long cpf;
	
	public PessoaFisica()
	{
		
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome()
	{
		return "PESSOA FÍSICA: "+super.getNome()+" -CPF: "+this.getCpf();
	}
	
	

}
