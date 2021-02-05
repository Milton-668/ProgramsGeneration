package Colletions;

import java.util.HashSet;
import java.util.Set;

public class TesteAluno {

	public static void main(String[] args) 
	{
		Set<Aluno> conjunto =new HashSet<Aluno>();
		
		Aluno a = new Aluno("JOÃO CRENTE","JAVA",7.0);
		Aluno b = new Aluno("JOSE GREGO",".NET",8.0);
		Aluno c = new Aluno("JOAQUIM MANDARIM","PYTHON",7.0);
		Aluno d = new Aluno("JUVENAL ESPANICO","HTML",9.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}

}
