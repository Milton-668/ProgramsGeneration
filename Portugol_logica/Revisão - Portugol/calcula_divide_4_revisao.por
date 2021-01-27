programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que calcula e escreve a seguinte soma: 
		 * soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		 */

		 real soma=0.0
		 inteiro numerador=-1
		 inteiro denominador=0

		 para(denominador=1; denominador<=50;denominador++)
		 {	
		 	numerador+=2
		 	soma+=+(numerador/denominador)
		 }
		 escreva(soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */