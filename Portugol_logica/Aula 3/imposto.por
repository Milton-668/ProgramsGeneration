programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		// SO PAGO IMPOSTO
		// RECEBE O SALARIO DE UMA PESSOA
		// RECEBE O NOME DESSA PESSOA
		// BASEADO NO SALARIO VAI RESPONDE:
		// SALARIO ATÉ 1.100(INCLUSIVE) REAIS ISENTO
		// SALARIO MAIOR QUE 1.100 E (INCLUSIVE) 3.500 - 9% IMPOSTO 
		// (VALOR DO IMPOSTO E O SALARIO FINAL)
		// SALARIO MAIOR QUE 3.500 E (INCLUSIVE) 10.000 - 15% IMPOSTO 
		// (MESMA REGRA DE EXIBIÇÃO)
		// SALARIOS ACIMA DE 10.000 PAGAM 27% IMPOSTO (MOSTRE IGUAL)
		// DETALHE - TRATAR COMO SENHOR OU SENHORA

		real sal=0.00, imposto=0.00
		cadeia nome,tipo
		caracter sexo

		escreva("\nInsira o valor do Salario:")
		leia(sal)
		escreva("Insira o seu nome e:")
		leia(nome)
		escreva("Insira o seu sexo(M/F/X):")
		leia(sexo)

		se(sexo=='m' ou sexo=='M')
		{
			tipo="Sr."
		}
		senao se(sexo=='f' ou sexo=='F')
		{
			tipo="Sra."
		}
		senao 
		{
			tipo="Srx."
		}
		
		se(sal<=1100.00)
		{
			escreva("Parabéns "+tipo+"R$:0,00 imposto")
		}
		senao se(sal>1100.00 e sal<=3500.00)
		{
			imposto=(sal*9)/100
			escreva(tipo,"O valor do seu imposto é:R$",mat.arredondar(imposto, 2),"\n")
			escreva(tipo,"O valor do seu salario-imposto é:R$",mat.arredondar(sal-imposto, 2))
		}
		senao se(sal>3500.00 e sal<=10000.00)
		{
			imposto=(sal*15)/100
			escreva(tipo,"O valor do seu imposto é:R$",mat.arredondar(imposto, 2),"\n")
			escreva(tipo,"O valor do seu salario-imposto é:R$",mat.arredondar(sal-imposto, 2))
		}
		senao
		{
			imposto=(sal*27)/100
			escreva(tipo,"O valor do seu imposto é:R$",mat.arredondar(imposto, 2),"\n")
			escreva(tipo,"O valor do seu salario-imposto é:R$",mat.arredondar(sal-imposto, 2))
		}
		
	}
}
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 982; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */