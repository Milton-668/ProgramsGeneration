package PrimeiroPrograma;

public class Cliente {
	
	public String nome;
	public char sexo;
	public int anoNascimento;
	public int saldo;
	public String cpf;
	public String endereco;
	
	//metodos
	public int dinheiro()
	{
		return saldo=10000;
	}
	public int idade()
	{
		return 2021 - anoNascimento;
	}
	public String tratamento()
	{
		String msg;
		
		if(sexo=='M')
		{
			if(idade()>17)
			{
				msg="Sr.";
			}
			else
			{
				msg="VOCÊ";
			}
		}
		else if(sexo=='F')
		{
			if(idade()>17)
			{
				msg="Sra";
			}
			else
			{
				msg="VOCÊ";
			}
		}
		else
		{
			if(idade()>17)
			{
				msg="Srx.";
			}
			else
			{
				msg="VOCÊ";
			}
		}
		return msg;
		
	
	}

}
