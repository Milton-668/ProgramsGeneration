package Entidades;

public class Pessoas 
{
	//ATRIBUTOS
	public String nome;
	public char genero;
	public int anoNascimento;
	
	//METODOS
	public int idade()
	{
		return 2021 - anoNascimento;
	}
	
	public String statusIdade()
	{
		int idade;
		String msg;

		idade=2021 - anoNascimento;
		if(idade<18)
		{
			msg="Menor de 18 anos! Necessita fazer o Teams";
		}
		else
		{
			msg="Maior de 18 anos! Liberado todos os m�dulos";
		}
		return msg;
	}
	
	public String tratamento()
	{
	
		String msg;
		
		if(genero=='M')
		{
			if(idade()>17)
			{
				msg="Sr.";
			}
			else
			{
				msg="VOC�";
			}
		}
		else if(genero=='F')
		{
			if(idade()>17)
			{
				msg="Sra";
			}
			else
			{
				msg="VOC�";
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
				msg="VOC�";
			}
		}
		return msg;
	}
	

} 	

	//HERAN�A
	//ABSTRA��O
	//DELEGA��O DE RESPONSABILIDADE
	//SEGURAN�A
	
	//CONSTRUTORES
	//*sobrecargas
	
	//ENCAPSULAMENTOS
	
	//METODOS
	//*sobrecargas
	
	//OVERHIDE
	//SOBRECARGA DA SOBRECARGA - SHIT DOS LIMITES
