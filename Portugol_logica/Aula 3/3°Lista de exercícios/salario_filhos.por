programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		/*					PARA
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de 
		 * seus habitantes, coletando dados sobre o salário e número de 
		 * filhos. A prefeitura deseja saber:   
		   a) média do salário da população; 
		   b) média do número de filhos; 
		   c) maior salário; 
		   d) percentual de pessoas com salário até R$100,00
		 */
		real sal=0.00
		real mediaSal=0.00
		real maiorSal=0.00
		real mediaF=0.00 
		real percentualSal=0.00
		inteiro filho=0
		const inteiro h = 5//qntd de vezes
		inteiro giro
		real totalSal = 0.00
		real totalFil = 0.00
		real contador =0.00
		
		
		para(giro=1; giro<=h; giro++)
		{
			escreva("Insira o Salário:",giro," :")
			leia(sal)
			escreva("Insira o número de filhos:",giro," :")
			leia(filho)

			totalSal=totalSal+sal
			//totalFil=totalFil+
			totalFil+=filho
			se(sal> maiorSal)
			{
				maiorSal=sal
			}
			se(sal<=100)
			{
				//contadorValor100=contadorValor100+1
				contador+=1
				//contadorValor100++
			}
			
		}
		mediaSal=totalSal/h
		mediaF=totalFil/h
		percentualSal=(contador/h)*100

		escreva("A media salarial é:R$",mediaSal)
		escreva("\nA media de filhos é:",mediaF)
		escreva("\nO maior salario inserido foi:",maiorSal)
		escreva("\nNumero de pessoas que ganham até R$100,00 ",contador," sendo o percentual:",percentualSal,"%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 83; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */