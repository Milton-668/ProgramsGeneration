programa
{
	
	funcao inicio()
	{
		//solicite o nome de 4 alunos, suas respectivas notas,
		//mostre na tela o nome e do lado a nota e mostre qual é
		// a maior nota informada

		 cadeia nome
		 inteiro i,contador=0
		 real nota=0.00, maiorNota=0.00

		 para(i=0; i<40; i++)
		 {
		 	escreva("\nInsira o nome do aluno:")
		 	leia(nome)
		 	escreva("\nInsira a nota do aluno:")
		 	leia(nota)

			//maiorNota=nota
			contador+=1
			escreva("\nA nota do",contador,"é:",nota)
			escreva("\nO nome do",contador,"é:",nome)

			se(nota>maiorNota)
			{
				maiorNota=nota
			}
		 }

		 escreva("\nA maior nota é",maiorNota)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */