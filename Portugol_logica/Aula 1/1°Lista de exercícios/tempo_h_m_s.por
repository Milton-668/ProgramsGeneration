programa
{
	
	funcao inicio()
	{
		/*
		 * 3. Faça um sistema que leia o tempo de 
		 * duração de um evento em uma fábrica 
		 * expressa em segundos e mostre-o expresso 
		 * em horas, minutos e segundos. 

		 */
		
		inteiro h,m,s,tempo
		escreva("Insira o tempo do evento:")
		leia(tempo)

		s=tempo
		m=(tempo/60)
		h=(tempo/3600)


		escreva("\nA quantidade em horas é:",h)
		escreva("\nA quantidade em minutos é:",m)
		escreva("\nA quantidade em segundos é:",s)

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */