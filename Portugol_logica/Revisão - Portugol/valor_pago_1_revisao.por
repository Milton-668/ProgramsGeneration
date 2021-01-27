programa
{
	
	funcao inicio()
	{
		/*
		 * Elabore um programa que calcule o que deve ser pago por 
		 * um produto, considerando o preço normal de etiqueta e a 
		 * escolha da condição de pagamento. Utilize os códigos da 
		 * tabela a seguir para ler qual a condição de pagamento 
		 * escolhida e efetuar o cálculo adequado. 
			Código Condição de pagamento 
			1 À vista em dinheiro ou cheque, recebe 20% de desconto 
			2 À vista no cartão de crédito, recebe 15% de desconto 
			3 Em duas vezes, preço normal de etiqueta sem juros 
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 */

		 inteiro codigo=0
		 real preco=0.00
		 real desconto=0.00
		 real juros=0.00
		 real pagamento=0.00
		 caracter continua='S'

		 /*escreva("Olá, esse programinha te mostrará o você irá pagar ")
		 escreva("\na partir da condição de pagamento selecionada.\n")
	      escreva("\n")*/
	      enquanto (continua == 'S' ou continua =='s'){
		 escreva("Insira o preço do Produto: ")
		 leia(preco)
		 escreva("Escolha uma condição de pagamento do produto:\n")
		 escreva("1. À vista dinheiro ou cheque 20% de desconto\n")
		 escreva("2. À vista cartão de crédito  15% de desconto\n")
		 escreva("3. Parcelado em duas vezes 0% de juros\n")
		 escreva("4. Parcelado em três vezes  10% de acréscimo\n")
		 leia(codigo)

		 se(codigo==1)
		 {
		 	desconto=((preco*20)/100)
		 	pagamento=preco-desconto
		 	escreva("Desconto:R$",desconto," Pagamento:R$",pagamento)
		 }
		 senao se(codigo==2)
		 {
		 	desconto=((preco*15)/100)
		 	pagamento=preco-desconto
		 	escreva("Desconto:R$",desconto," Pagamento:R$",pagamento)
		 }
		 senao se(codigo==3)
		 {
		 	escreva(preco)
		 }
		 senao se(codigo==4)
		 {	
		 	juros=((preco*10)/100)
		 	pagamento=preco+juros
		 	escreva("Juros:R$",juros," Pagamento:R$",pagamento)
		 }
		 senao
		 {
		 	escreva("Código Inválido")
		 }
		 limpa()
		 escreva("Deseja continuar? S/s:Sim||N:Não: ")
		 leia(continua)
	      }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1963; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */