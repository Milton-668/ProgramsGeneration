package PrimeiroPrograma;

import java.util.Scanner;

public class ObjCliente {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		Cliente  cliente1 = new  Cliente();
		
		System.out.print("Digite o nome: ");
		cliente1.nome = leia.next();
		System.out.print("Digite o sexo M-Masculino/F-Feminino/O-Outros: ");
		cliente1.sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite o ano do nascimento[aaaa]: ");
		cliente1.anoNascimento = leia.nextInt();
		System.out.print("Digite o seu CPF: ");
		cliente1.cpf = leia.next();
		
		System.out.printf("Ol� %s %s, sua idade aproximada � %d anos!!",cliente1.tratamento(),cliente1.nome,cliente1.idade());
		System.out.printf("O SEU CPF: %s � v�lido e o seu saldo �: %d",cliente1.cpf,cliente1.dinheiro());
		
		
	}

}
