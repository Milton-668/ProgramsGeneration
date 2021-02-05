package Colletions;

public class Aluno {

	private String nome;
	private String disciplina;
	double nota;

	public Aluno(String nome, String disciplina, double nota) {
		super();
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota = nota;
	}

	public String toString() {
		return this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
