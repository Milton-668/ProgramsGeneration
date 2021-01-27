programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que leia um vetor de 5 posições para 
		 * números reais e, depois, um código inteiro. Se o código 
		 * for zero, finalize o programa; se for 1, mostre o vetor 
		 * na ordem direta; se for 2, mostre o vetor na ordem 
		 * inversa. Caso, o código for diferente de 1 e 2, escreva 
		 * uma mensagem informando que o código inválido.
		 */

		real num[5]
		inteiro codigo=0,i=0

		
		
		para( i=0; i<5;i++)
		{			
			escreva("\nInsira os numeros:")
			leia(num[i])
		}
		 	escreva("\nEscolha os seguintes códigos:")
			escreva("\n1- Ordem Direta")
			escreva("\n2- Ordem Indireta")
			escreva("\n0- Finaliza o programa")
			
			escreva("\nInsira o código")
			leia(codigo)
			
				se(codigo==1)
				{
					para( i=0; i<5;i++)
					{
						escreva(": ",num[i])	
					}
				}
				senao se (codigo==2)//inversa
				{
					para( i=4; i>=0; i--)
					{
						escreva(": ",num[i])	
					}
				}
				senao se(codigo==0)
					{
						escreva("Programa Finalizado")
						limpa()
					}
				senao 
				{
					escreva("Opção Inválida")
				}
				
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 891; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */