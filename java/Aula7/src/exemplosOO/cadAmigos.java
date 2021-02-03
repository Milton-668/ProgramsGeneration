package exemplosOO;

import java.util.Scanner;
import Entidades.Pessoas;

public class cadAmigos {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		Pessoas  alune1 = new  Pessoas();
		
		System.out.print("Digite o nome: ");
		alune1.nome = leia.next();
		System.out.print("Digite o sexo M-Masculino/F-Feminino/O-Outros: ");
		alune1.genero = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite o ano do nascimento[aaaa]: ");
		alune1.anoNascimento = leia.nextInt();
		
		System.out.printf("Olá %s %s, sua idade aproximada é %d anos!!",alune1.tratamento(),alune1.nome,alune1.idade());
		
		System.out.print(alune1.statusIdade());
	
		
		

	}

}
