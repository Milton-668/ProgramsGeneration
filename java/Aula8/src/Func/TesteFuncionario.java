package Func;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcion func = new Funcion();
		
		func.setNome("ABREU");
		func.setSalario(1000);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
		
	}

}
