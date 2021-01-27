programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * 3) Desenvolva um sistema em que:
			 Leia 4 (quatro) números;
		 	 Calcule o quadrado de cada um;
              Se o valor resultante do quadrado do terceiro for >= 1000, 
			 imprima-o e finalize;
		      Caso contrário, imprima os valores lidos e seus respectivos 
			 quadrados.
		 */
		inteiro n1,n2,n3,n4
		inteiro q1,q2,q3,q4
		
		escreva("Insira o 1° número:")
		leia(n1)
		escreva("Insira o 2° número:")
		leia(n2)
		escreva("Insira o 3° número:")
		leia(n3)
		escreva("Insira o 4° número:")
		leia(n4)

		q1=mat.potencia(n1, 2)
		q2=mat.potencia(n2, 2)
		q3=mat.potencia(n3, 2)
		q4=mat.potencia(n4, 2)

		se(q3>=1000)
		{
			escreva("O valor é:",q3)
		}
		senao{
			escreva("\nO valor da 1ª potencia é:",q1)
			escreva("\nO valor da 2ª potencia é:",q2)
			escreva("\nO valor da 3ª potencia é:",q3)
			escreva("\nO valor da 4ª potencia é:",q4)
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */