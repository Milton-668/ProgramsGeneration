package SextoPrograma;

import PrimeiroPrograma.Pessoa01;

public class Vendedor extends Pessoa01 {

	/*
	 * 6. Implemente a classe Vendedor como subclasse da classe Pessoa. Um
	 * determinado vendedor tem como atributos da classe Pessoa e também os
	 * atributos próprios como valorVendas (correspondente ao valor monetário dos
	 * artigos vendidos) e o atributo comissao (porcentagem do valorVendas que será
	 * adicionado ao vencimento base do Vendedor).
	 */

	private double valorVendas;
	private double comissaoVendedor;
	private double calcularComissao;
	private double salarioComissao;
	private double vencimentoBase;

	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissaoVendedor,
			double vencimentoBase) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissaoVendedor = comissaoVendedor;
		this.vencimentoBase = vencimentoBase;
	}

	public double calcularComissao() {
		calcularComissao = (valorVendas * comissaoVendedor);
		return calcularComissao;
	}

	public double salarioComissao() {
		salarioComissao = (vencimentoBase + calcularComissao);
		return salarioComissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissaoVendedor() {
		return comissaoVendedor;
	}

	public void setComissaoVendedor(double comissaoVendedor) {
		this.comissaoVendedor = comissaoVendedor;
	}

	public double getCalcularComissao() {
		return calcularComissao;
	}

	public void setCalcularComissao(double calcularComissao) {
		this.calcularComissao = calcularComissao;
	}

	public double getSalarioComissao() {
		return salarioComissao;
	}

	public void setSalarioComissao(double salarioComissao) {
		this.salarioComissao = salarioComissao;
	}

	public double getVencimentoBase() {
		return vencimentoBase;
	}

	public void setVencimentoBase(double vencimentoBase) {
		this.vencimentoBase = vencimentoBase;
	}

}
