programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * 1) João Papo-de-Pescador, homem de bem, comprou um 
		 * microcomputador para controlar o rendimento diário 
		 * de seu trabalho. Toda vez que ele traz um peso de 
		 * tomate maior que o estabelecido pelo regulamento 
		 * do estado de São Paulo (50 quilos) deve pagar um 
		 * multa de R$ 4,00 por quilo excedente. João precisa 
		 * que você faça um sistema que leia a variável P 
		 * (peso de tomates) e verifique se há excesso. 
		 * Se houver, gravar na variável E (Excesso) e na 
		 * variável M o valor da multa que João deverá pagar. 
		 * Caso contrário mostrar tais variáveis com o conteúdo 
		 * ZERO.

		 */
		real peso=0.00,multa=0.00,excesso=0.00
		escreva("Insira o peso do do tomate:")
		leia(peso)

		se(peso>50)
		{
			excesso=(peso-50)
			multa=(excesso*4)
			escreva("\nO excesso é de:",excesso,"kg")
			escreva("\nO valor da multa é R$:",mat.arredondar(multa,2))
		}
		senao
		{
			escreva("Ufa João não houve excessos!")	
		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 695; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */