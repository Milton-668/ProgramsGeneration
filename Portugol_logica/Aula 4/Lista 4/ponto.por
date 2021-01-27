programa
{
	
	funcao inicio()
	{
		/* 1.
		 * Faça um programa que crie um vetor por leitura com 
		 * 5 valores de pontuação de uma atividade e o escreva 
		 * em seguida. Encontre após a maior pontuação e a apresente.
		 */
		real num[5]
		inteiro i, ponto=0
		real maiorPonto=0.00

		para(i=0;i<5;i++)
		{
			escreva("Insira a ",ponto+1, "° pontuação:")
			leia(num[i])
			ponto++
			
			se(num[i]>maiorPonto)
			{
				maiorPonto=num[i]
			}
		} 
		escreva("\nA maior pontuação é",maiorPonto)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 43; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maiorPonto, 13, 7, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */