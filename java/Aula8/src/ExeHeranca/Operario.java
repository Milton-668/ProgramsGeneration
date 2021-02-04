package ExeHeranca;

public class Operario extends Heranca1 {
	
	private String departamento;
	
	public Operario (String nome, int matricula, String departamento)
	{
		super(nome,matricula);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	

}
