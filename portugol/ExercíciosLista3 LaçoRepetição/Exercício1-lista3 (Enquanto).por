programa
{
	
	funcao inicio()
	{ 

     inteiro numero=0, totalSoma=0, numTotal=0
     real media=0.00

     enquanto(numero>=0) {
     	escreva("Digite um número: ")
          leia(numero)
     	
     	se(numero>=0) {
     	totalSoma += numero
     	numTotal++ }
     }
     
     media = totalSoma / numTotal
   
     escreva("O valor total dos números fornecidos é de: ",totalSoma,"\n") 
     escreva("A média dos números é de: ",media,"\n")
     escreva("O total de números fornecidos foi: ",numTotal)

     
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */