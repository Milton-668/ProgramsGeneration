programa
{
	
	funcao inicio()
	{
		/*
		 * 2. Faça um sistema que leia a idade 
		 * de uma pessoa expressa em dias e 
		 * mostre-a expressa em anos, meses e dias.
		 */
		
		inteiro dias,anos,meses,idade 
		escreva("Escreva a quantidade de dias:")
		leia(idade)

		anos=(idade/365)
		meses=(idade%365)/30
		dias=(idade%365)%30
		

		escreva("\nA quantidade de ano(s) é:"+ anos)
		escreva("\nA quantidade de mês(es) é:"+ meses)
		escreva("\nA quantidade de dia(s) é:"+ dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 164; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */