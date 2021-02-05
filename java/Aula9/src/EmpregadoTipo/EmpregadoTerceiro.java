package EmpregadoTipo;

public class EmpregadoTerceiro extends CadastroEmpegado {
	protected double acrescimo=0.01;

	public EmpregadoTerceiro(String nome, int matricula, int horas, double valorHoras, double acrescimo) {
		super(nome, matricula, horas, valorHoras);
		this.acrescimo=acrescimo;

	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}

	@Override
	public double salarioNormal() {
		
		return(super.salarioNormal()*acrescimo)+super.salarioNormal();
		/*acrescimo = horas * (valorHoras+(valorHoras*acrescimo));
		return (salarioNormal);*/
	}

}
