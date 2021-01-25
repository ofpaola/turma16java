programa
{
	
	funcao inicio()
	{
		
		 inteiro cubo[3][3], somaTotal=0, somaDiagonal=0
		
		 para (inteiro linha = 0; linha<3; linha++) {
		 para (inteiro coluna = 0; coluna<3; coluna++) {
		 		
		 	escreva("Digite um número: ")
		 	leia(cubo[linha][coluna])  
		 	}
		 	escreva("\n")  
		 	}
		 	
		 limpa()

		 para (inteiro linha = 0; linha<3; linha++) {
		 para (inteiro coluna = 0; coluna<3; coluna++) {
		 		
		 	escreva(cubo[linha][coluna]," ")
		 	}
		 	escreva("\n")
		     }

		 para (inteiro linha = 0; linha<3; linha++) {
		 para (inteiro coluna = 0; coluna<3; coluna++) {

		 	somaTotal += cubo[linha][coluna]
		 
		 se (linha == coluna) {
		 	somaDiagonal += cubo[linha][coluna]
		 }
		 }	
		 }

		 escreva("A soma total dos números da matriz é: ",somaTotal,"\n")
		 escreva("A soma dos valores da diagonal principal é: ",somaDiagonal)
		 
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 585; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */