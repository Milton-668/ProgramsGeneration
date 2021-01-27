programa
{
	
	funcao inicio()
	{
		/*
		 * Escrever um programa que leia uma quantidade 
		 * desconhecida de números e conte quantos deles 
		 * estão nos seguintes intervalos: 
		 * [0-25], [26-50], [51-75] e [76-100]. 
		 * A entrada de dados deve terminar quando for 
		 * lido um número negativo.
		 */

		 inteiro num=1
		 inteiro c1=0,c2=0,c3=0,c4=0
		 //inteiro c1[],c2[],c3[],c4[]


           enquanto(num>=0)
           {
           	 escreva("Insira os numeros:\n")
			 leia(num)
			 
			 se(num>=0 e num<=25)
			 {
			 	c1=c1+1
			 }
			 senao se(num>25 e num<51)
			 {
			 	c2=c2+1
			 }
			 senao se(num>51 e num<75)
			 {
			 	c3=c3+1
			 }
			 senao se(num>75 e num<=100)
			 {
			 	c4=c4+1
			 }
		 }
		 escreva("\nA quantidade de números no 1° intervalo é:",c1)
		 escreva("\nA quantidade de números no 2° intervalo é:",c2)
		 escreva("\nA quantidade de números no 3° intervalo é:",c3)
		 escreva("\nA quantidade de números no 4° intervalo é:",c4)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */