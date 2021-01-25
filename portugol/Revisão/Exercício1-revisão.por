programa
{
	
	funcao inicio()
	{
	 
	 inteiro x,valorFinal 
	 real produto 

	 escreva("Digite o valor do produto: ")
	 leia(produto)
	 escreva("\nAs opções de pagamento são: \n")
	 escreva("[1] À vista em dinheiro ou cheque, recebe 20% de desconto\n")
	 escreva("[2] À vista no cartão de crédito, recebe 15% de desconto\n")
	 escreva("[3] Em 2x, preço normal de etiqueta sem juros\n")
	 escreva("[4] Em 3x, preço normal de etiqueta mais juros de 10%\n")
	 escreva("\nEscolha uma opção: ")
	 leia(x)

	 limpa()
	 
	 se(x==1)
	 {
	   valorFinal = produto-(produto*20/100)
	   escreva("Você recebeu 20% de desconto.\n\n Total à pagar: ",valorFinal,"R$\n")
	 }
	 senao se(x==2)
	 {
	   valorFinal = produto-(produto*15/100)
	   escreva("Você recebeu 15% de desconto.\n\n Total à pagar: ",valorFinal,"R$\n")
	 }
	 senao se(x==3)
	 {
	   valorFinal = produto/2
	   escreva("Total à pagar: 2x de: ",valorFinal,"R$ sem juros\n")
	 }
	 senao se(x==4)
	 {
	   valorFinal = produto+(produto*10/100)
	   escreva("Total à pagar: 3x de: ",valorFinal/3,"R$ com 10% de juros\n")
	 }
	 senao {
	 	escreva("Você digitou um número inválido!")
	 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */