programa
{
	
inclua biblioteca Util
	funcao inicio()
	{
		
     inteiro dado[10], soma=0, vezesM=0, maior=0
     real media=0.0

     para(inteiro y=1; y <10; y++) {
     	dado[y] = Util.sorteia(1, 6)
     	soma += dado[y]
     	
     	se(dado[y] >= maior) {
     		
     	se(dado[y] == maior) {
     		vezesM++
     	}
     	senao {
     		vezesM=1
     	}
     	maior = dado[y]
     	}
     }
     para(inteiro y=1; y <10; y++) {
     	escreva("O número do ",y,"º lançamento, foi de: ",dado[y],"\n")
     }

     media = soma / 10

     escreva("A soma dos números foi de: ",soma,"\n")
	escreva("A média aritmética dos lançamentos foi de: ",media,"\n")
     escreva("O lançamento do maior número ocorreu ",vezesM," vezes")
     
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */