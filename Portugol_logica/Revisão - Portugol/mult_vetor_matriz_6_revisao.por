programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que lê um vetor de 3 elementos e 
		 * uma matriz de 3 x 3 elementos. Em seguida o programa 
		 * deve fazer a multiplicação do vetor pelas colunas da matriz.
		 */

		inteiro vet[3]
		inteiro matriz[3][3]
		inteiro mult[3][3]
		inteiro linha=0,coluna=0
	

		para( linha=0; linha<3;linha++)//matriz
		{
			para( coluna=0;coluna<3;coluna++)
			{
				leia(matriz[linha][coluna])
			}
			
		}
		escreva("\n\n")
			para ( linha=0; linha<3;linha++)//vetor
			{
				leia(vet[linha])
			}
			escreva("\n\n")

			para( linha=0; linha<3;linha++)
			{
				para( coluna=0;coluna<3;coluna++)
				{
					mult[linha][coluna]=(vet[linha]*matriz[linha][coluna])
				}
			}

			para( linha=0; linha<3;linha++)
			{
				para( coluna=0;coluna<3;coluna++)
				{
					escreva(mult[linha][coluna])
				}
			}
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 701; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */