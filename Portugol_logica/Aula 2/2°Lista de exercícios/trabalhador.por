programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * 2) Elabore um sistema que leia as variáveis C e N, 
		 * respectivamente código e número de horas trabalhadas 
		 * de um operário. E calcule o salário sabendo-se que 
		 * ele ganha R$ 10,00 por hora. Quando o número de horas 
		 * exceder a 50 calcule o excesso de pagamento armazenando-o 
		 * na variável E, caso contrário zerar tal variável. A hora 
		 * excedente de trabalho vale R$ 20,00. No final do 
		 * processamento imprimir o salário total e o salário 
		 * excedente.

		 */
		inteiro cod,num, horas,sal,excesso
		
		escreva("Insira o Código do Operário:")
		leia(cod)
		escreva("Insira a quantidade horas trabalhadas:")
		leia(horas)

		sal=10*horas

		se(horas>50)
		{
			excesso=(horas-50)*20
			escreva("\nO salário do operário é R$:",mat.arredondar(sal, 2))
			escreva("\nO excesso é R$:",mat.arredondar(excesso,2))	
		}
		senao 
		{
			escreva("\nO salário do operário é R$:",mat.arredondar(sal, 2))
			escreva("\nNão teve excesso!!!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1053; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */