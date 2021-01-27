programa
{
	inclua biblioteca Graficos
	
	funcao inicio()
	{
		//PAULISTINHA
		// 0 - CORITHIANS, 1 - PALMEIRAS, 2 - SANTOS, 3 - SPFC
		// PONTOS - INTEIRO - 4
		// GANHA - 3 PONTOS
		// PERDE - 0 PONTO
		// EMPATA - 1 PONTO
		// FAÇA UM PROGRAMA QUE PEÇA SE O CADA TIME G-GANHOU, P-PERDEU
		// OU EMPATOU  EM 4 RODADAS, AO FINAL MOSTRA O NOME DE CADA TIME
		// E SEUS RESPECTIVOS PONTOS
		//CORINTHIANS - G-ganhou P-perdeu ou E-empatou [G/P/E]:
		
		cadeia times[]  
		inteiro pontos [4] 
		
		
		times [0] = "CORINTHIANS"
		times [1] = "PALMEIRAS"
		times [2] = "SANTOS"
		times [3] = "SPFC"
	}

	para(inteiro i=0;i<4;i++)
	{
		escreva("insira o Código do seu time, conforme abaixo":)
		escreva("0 - CORITHIANS, 1 - PALMEIRAS, 2 - SANTOS, 3 - SPFC")
		leia(time)	
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 597; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */