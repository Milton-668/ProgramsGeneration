programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que leia um numero 
		 * natual e diga se é par ou impar
		 * numero negativo não aceito (desculpas)
		 * 0 numero avisar que é neutro
		 *		 */
		inteiro num,par,impar
		escreva("Insira o numero:")
		leia(num)

		/*par=num%0
		*impar=num%1

		escreva("O numero é par",par)
		escreva("O numero é impar",impar)
		*/
		
		se(num<0){
			escreva("\nNúmero negativo não aceito!")
		}
		senao se (num==0){
			escreva("\nO Número neutro")
		}
		senao se(num%2==0){
			escreva("\nO número é par")
		}
		senao{
			escreva("\nO número é ímpar")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 482; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */