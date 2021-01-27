programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/* 3.
		 * Escreve um programa que lê duas matrizes N1 (4,6) e 
		 * N2(4,6) e cria:
		   a) Uma matriz M1 cujos elementos serão as somas dos elementos 
		   de mesma posição das matrizes N1 e N2;
		   b) Uma matriz M2 cujos elementos serão as diferenças dos 
		   elementos de mesma posição das matrizes N1 e N2.

		 */
		inteiro N1[4][6], N2[4][6]
		inteiro M1[4][6], M2[4][6]

		para(inteiro linha=0; linha<4; linha++)
		{
			para(inteiro coluna=0; coluna<6; coluna++)
			{
				N1[linha][coluna] = Util.sorteia(1, 9)
				N2[linha][coluna] = Util.sorteia(1, 9)
				
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna]
			}
			
		}
		escreva("MATRIZ 1")
		para(inteiro linha=0; linha<4; linha++)
		{	
			escreva("\n")
			para(inteiro coluna=0; coluna<6; coluna++)
			{
				escreva("|",M1[linha][coluna],"|")
			}
		}
					
		escreva("\nMATRIZ 2")
		para(inteiro linha=0; linha<4; linha++)
		{	
			escreva("\n")
			para(inteiro coluna=0; coluna<6; coluna++)
			{
				escreva("|",M2[linha][coluna],"|")
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 68; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 16, 10, 2}-{N2, 16, 20, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */