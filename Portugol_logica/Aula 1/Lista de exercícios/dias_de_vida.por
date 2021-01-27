programa
{
	
	funcao inicio()
	{
		/*
		 * 1. Faça um sistema que leia a idade 
		 * de uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa apenas em dias. 

		 */
		inteiro anos,dias,meses,total
		escreva("Escreva a quantidade de anos:")
		leia(anos)
		escreva("Escreva a quantidade de meses:")
		leia(meses)
		escreva("Escreva a quantidade de dias:")
		leia(dias)

		total = (anos*365)+(meses*30)+dias
		//saida
		escreva("O resultado em dias é :",total+" de vida")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 129; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */