programa
{
	
	funcao inicio()
	{
		 inteiro matriz[3][3], vetor[3]

		 para(inteiro v=0; v<3; v++) {
		 	escreva("Digite um número: ")
		 	leia(vetor[v])
		 }   escreva("\n") 
		 
		 para (inteiro x = 0; x<3; x++) {
		 para (inteiro y = 0; y<3; y++) {
		 		
		 	escreva("Digite um número: ")
		 	leia(matriz[x][y])  
		 	}
		 	escreva("\n")  
		 	}
		 	
		 limpa()
		
		escreva("Números Vetor: \n")
		
		para(inteiro v=0; v<3; v++) {
			escreva(vetor[v]," ") }
			
          para(inteiro x = 0; x <3; x++){
		para(inteiro y = 0; y <3; y++){
			escreva(" ")
		}
		}
			escreva("\nNúmeros Matriz: ")
		para(inteiro v=0; v<3; v++){
			escreva("\n")	

		para(inteiro x = 0; x <3; x++){
		para(inteiro y = 0; y <3; y++){
			matriz[x][y] = vetor[v]*matriz[x][y]
			escreva(matriz[x][y], " ")
		}
			escreva("\n")	
		}}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 790; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */