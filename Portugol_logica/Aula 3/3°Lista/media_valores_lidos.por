programa
{
	
	funcao inicio()
	{
		/*	ENQUANTO
		 * 1- Elaborar um programa que efetue a leitura sucessiva 
		 * de valores numéricos e apresente no final o total do 
		 * somatório, a média e o total de valores lidos. O programa 
		 * deve fazer as leituras dos valores enquanto o usuário 
		 * estiver fornecendo valores positivos. Ou seja, o programa 
		 * deve parar quando o usuário fornecer um valor negativo.
		 */
		
		inteiro contador=0
		inteiro num=1
		real media=0.00
		real soma=0.00

		enquanto (num>0)
		{
			escreva("\nInsira um número:")
			leia(num)
			
			se(num>0)
			{
				soma=soma+num
				contador=contador+1
			}
			
		}

		media=(soma/contador)
		escreva("\nA soma dos numeros é:",soma)
		escreva("\nA média dos numeros é:",media)
		escreva("\nO total de números lidos é:",contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */