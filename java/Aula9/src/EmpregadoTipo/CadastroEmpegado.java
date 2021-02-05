package EmpregadoTipo;

public class CadastroEmpegado {
	private String nome;
	private int matricula;
	protected int horas;
	protected double valorHoras;
	protected double salarioNormal;
	
	
	public CadastroEmpegado(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public CadastroEmpegado(String nome, int matricula, int horas, double valorHoras) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horas = horas;
		this.valorHoras = valorHoras;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getValorHoras() {
		return valorHoras;
	}


	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}
	
	public double salarioNormal()
	{
		return(valorHoras*horas);
		
	}

	public double getSalarioNormal() {
		return salarioNormal;
	}

	public void setSalarioNormal(double salarioNormal) {
		this.salarioNormal = salarioNormal;
	}
	
	
	

}
