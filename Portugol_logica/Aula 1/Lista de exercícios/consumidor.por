programa
{
	
	funcao inicio()
	{	
		/*
		 * 8. O custo ao consumidor de um carro 
		 * novo é a soma do custo de fábrica com 
		 * a percentagem do distribuidor e dos 
		 * impostos (aplicados ao custo de fábrica). 
		 * Supondo que a percentagem do distribuidor 
		 * seja de 28% e os impostos de 45%, escrever 
		 * um sistema que leia o custo de fábrica de 
		 * um carro e escreva o custo ao consumidor. 

		 */
		real dis,imp,custo,cons
		escreva("Insira o custo da fábrica:")
		leia(custo)

		dis=(custo*28/100)
		imp=(custo*45/100)

		cons=(dis+imp+custo)

		escreva("\nO custo ao consumidor é R$:",cons)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */