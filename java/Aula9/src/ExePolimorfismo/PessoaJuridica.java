package ExePolimorfismo;

public class PessoaJuridica extends Pessoa001 {
	private long cnpj;
	
	public PessoaJuridica()
	{
		
	}
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome()
	{
		return "PESSOA JURÍDICA: "+super.getNome()+" -CNPJ: "+this.getCnpj();
	}
	
}


