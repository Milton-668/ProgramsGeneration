package EmpregadoTipo;

public class TesteTipo {

	public static void main(String[] args) {
		
		CadastroEmpegado tipo = new CadastroEmpegado ("Marcos",10,100,10);
		EmpregadoTerceiro rm = new EmpregadoTerceiro ("Marcos",10,100,10);
		
		System.out.println(tipo.getNome());
		System.out.println(tipo.getMatricula());
		System.out.println(tipo.getHoras());
		System.out.println(tipo.getValorHoras());
		System.out.println(tipo.salarioNormal());
		System.out.println(rm.salarioNormal());
		

	}



}
