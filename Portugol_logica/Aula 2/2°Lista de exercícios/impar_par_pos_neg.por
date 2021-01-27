programa
{
	
	funcao inicio()
	{
		/*
		 * 4) Faça um sistema que leia um número inteiro e mostre 
		 * uma mensagem indicando se este número é par ou ímpar, e 
		 * se é positivo ou negativo.

		 */
		inteiro num
		escreva("Insira o numero:")
		leia(num)
		
		se(num%2==0 ){
			escreva("\nO número é par")
		}
		senao{
			escreva("\nO número é ímpar")
			}
		se(num>0){
			escreva("\nO número é positivo")
		}
		se(num<0){
			escreva("\nO número é negativo!")
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */