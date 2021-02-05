package Colletions;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapAluno {

	public static void main(String[] args) {
		
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a = new Aluno("JOÃO CRENTE","JAVA",7.0);
		Aluno b = new Aluno("JOSE GREGO",".NET",8.0);
		Aluno c = new Aluno("JOAQUIM MANDARIM","PYTHON",7.0);
		Aluno d = new Aluno("JUVENAL ESPANICO","HTML",9.5);
		
		mapa.put("JOÃO CRENTE", a);
		mapa.put("JOSE GREGO", b);
		mapa.put("JOAQUIM MANDARIM", c);
		mapa.put("JUVENAL ESPANICO", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("JOAQUIM MANDARIM"));
		
		Collection<Aluno>alunos = mapa.values();
		for(Aluno e:alunos)
		{
			System.out.println(e);
		}
	}

}
