package QuintoPrograma;

import PrimeiroPrograma.Pessoa01;

public class Operator extends Pessoa01 {

	/*
	 * 5. Implemente a classe Operario como subclasse da classe Pessoa. Um
	 * determinado oper�rio tem como atributos da classe Pessoa e tamb�m os
	 * atributos pr�prios como valorProducao (que corresponde ao valor monet�rio dos
	 * artigos efetivamente produzidos pelo oper�rio) e comissao (que corresponde �
	 * porcentagem do valorProducao que ser� adicionado ao vencimento base do
	 * oper�rio).
	 */
	private double valorProducao;
	private double comissao;
	private double calcularComissao;
	private double salarioComissao;
	private double baseVencimento;

	public Operator(String nome, String endereco, String telefone, double valorProducao, double comissao,
			double baseVencimento) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.baseVencimento = baseVencimento;
	}

	public double calcularComissao() {
		calcularComissao = (valorProducao * comissao);
		return calcularComissao;
	}

	public double salarioComissao() {
		salarioComissao = (baseVencimento + calcularComissao);
		return salarioComissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getCalcularComissao() {
		return calcularComissao;
	}

	public void setCalcularComissao(double calcularComissao) {
		this.calcularComissao = calcularComissao;
	}

}
