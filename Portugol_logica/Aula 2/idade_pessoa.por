programa
{
	
	funcao inicio()
	{
		/*
		 * Pedir ao usuário nome[COMPLETO]
		 * sexo[H/S]
		 * ano nascimento[AAAA]
		 * escreva na tela a idade aproximada 
		 * até 18 - jovem
		 * de 18 até 59 anos - adulto/a
		 * de 60 anos pra cima idoso/a
		 */

		 inteiro ano,idade
		 cadeia nomePessoa
		 caracter sexoPessoa
		 const inteiro ATUAL=2021 //constante
		 
		 escreva("Insira seu nome:")
		 leia(nomePessoa)
		 escreva("Insira seu sexo(M/F):")
		 leia(sexoPessoa)
		 escreva("Escreva o ano de nascimento:")
		 leia(ano)

		 idade=(ATUAL-ano)

		se (sexoPessoa =='M'ou sexoPessoa =='m')
		{
			se (idade<18)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerado jovem")		
			}
			senao se (idade<60) {
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerado adulto")		
			}
			senao{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerado idoso")
			}
		}
		se (sexoPessoa =='F'ou sexoPessoa =='f')
		{
			se (idade<18)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerada jovem")		
			}
			senao se (idade<60) {
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerada adulta")		
			}
			senao{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerada idosa")
			}
		}
		senao
		//se (sexoPessoa =='X'ou sexoPessoa =='x')
		{
			se (idade<18)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerade jovem")		
			}
			senao se (idade<60) {
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerade adulte")		
			}
			senao{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerade idose")
			}
		}
		escreva("\nFIM DE PROGRAMA!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */