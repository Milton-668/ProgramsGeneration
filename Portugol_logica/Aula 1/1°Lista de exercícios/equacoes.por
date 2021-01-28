programa
{
	
	funcao inicio()
	{
		/*
		 * 7. Um sistema de equações lineares do 
		 * tipo: ax+by=c --- dx+ey=f,pode ser
		 * resolvido segundo mostra abaixo
		 * 
		 * x=ce-bf/ae-bd
		 * y=af-cd/ae-bd
		 * 
		   Escreva um sistema que lê os coeficientes 
		   a,b,c,d,e e f
		   e calcula e mostra os valores de x e y. 
		 */
		inteiro a,b,c,d,ee,f,x,y
		
		escreva("Insira o coeficiente de a:")
		leia(a)
		escreva("Insira o coeficiente de b:")
		leia(b)
		escreva("Insira o coeficiente de c:")
		leia(c)
		escreva("Insira o coeficiente de d:")
		leia(d)
		escreva("Insira o coeficiente de e:")
		leia(ee)
		escreva("Insira o coeficiente de f:")
		leia(f)

		x=((c*ee)-(b*f)/(a*ee)-(b*d))
		y=((a*f)-(c*d)/(a*ee)-(b*d))

		escreva("\nO valor de X é: ",x)
		escreva("\nO valor de Y é: ",y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */