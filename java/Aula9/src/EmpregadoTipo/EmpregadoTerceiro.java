package EmpregadoTipo;

public class EmpregadoTerceiro extends CadastroEmpegado {
	private double acrescimo=0.01;

	public EmpregadoTerceiro(String nome, int matricula, int horas, double valorHoras) {
		super(nome, matricula, horas, valorHoras);
		//this.salarioNormal = salarioNormal;

	}

	@Override
	public double salarioNormal() {
		acrescimo = horas * (valorHoras+(valorHoras*acrescimo));
		return (acrescimo);
	}

}
