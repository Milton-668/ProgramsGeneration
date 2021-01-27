programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/*
		 * 6. Construa um programa em c que, tendo como 
		 * dados de entrada dois pontos quaisquer no plano, 
		 * P(x1, y1) e P(x2, y2), 
		 * escreva a distância entre eles. A fórmula é
		 * d=raiz((x2-x1)^2 + (y2-y1)^2)
		 */
		real x1,x2,y1,y2,pot1,pot2,d,val1,val2
		escreva("Entre com x1:")
		leia(x1)
		escreva("Entre com x2:")
		leia(x2)
		escreva("Entre com y1:")
		leia(y1)
		escreva("Entre com x1:")
		leia(y2)

		val1=(x2-x1)
		val2=(y2-y1)
		
		pot1= Matematica.potencia(val1, 2)
		pot2= Matematica.potencia(val2, 2)

		d=Matematica.raiz(pot1+pot2,2)

		escreva("O valor de D é:",d)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */