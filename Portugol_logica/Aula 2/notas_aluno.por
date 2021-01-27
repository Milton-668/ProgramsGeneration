programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca 
	funcao inicio()
	{
		 cadeia nome
		 real n1,n2,n3,media
		 
		 escreva("Insira seu nome:")
		 leia(nome)
		 escreva("insira a 1°nota")
		 leia(n1)
		 escreva("insira a 2°nota")
		 leia(n2)
		 escreva("insira a 3°nota")
		 leia(n3)

		 media=((n1+n2+n3)/3)
		 limpa()

		 se(media>=7.00)
		 {
		 escreva("Parabéns",nome," ,você foi aprovado, com a nota:",media)	
		 }
		 senao se (media>=4 e media<7)
		 {
		 	escreva("Você",nome," ,ficou de exame, com a nota:",media)
		 }
		 senao
		 {
		 	escreva("Você",nome,",ficou de exame, com a nota:", )
		 }
	} 
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */