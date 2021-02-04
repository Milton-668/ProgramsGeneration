package QuintoPrograma;

import PrimeiroPrograma.Pessoa01;

public class Operator extends Pessoa01 {

	/*
	 * 5. Implemente a classe Operario como subclasse da classe Pessoa. Um
	 * determinado operário tem como atributos da classe Pessoa e também os
	 * atributos próprios como valorProducao (que corresponde ao valor monetário dos
	 * artigos efetivamente produzidos pelo operário) e comissao (que corresponde à
	 * porcentagem do valorProducao que será adicionado ao vencimento base do
	 * operário).
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
