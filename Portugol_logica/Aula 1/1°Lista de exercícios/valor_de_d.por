programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/*
		 * 4. Escreva  um sistema que leia três 
		 * números inteiros e positivos (A, B, C) 
		 * e calcule a seguinte expressão: 
		 * D=R+S/2, ONDE R=(A+B)^2
		 * 			  S=(B+C)^2

		 */
		real a,b,c,r,s,d

		escreva("Insira o valor de a:")
		leia(a)
		escreva("Insira o valor de b:")
		leia(b)
		escreva("Insira o valor de c:")
		leia(c)


		r=Matematica.potencia((a+b), 2)
		s=Matematica.potencia((b+c), 2)
		

		d=((r+s)/2)

		escreva("O valor de D é: ",d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */