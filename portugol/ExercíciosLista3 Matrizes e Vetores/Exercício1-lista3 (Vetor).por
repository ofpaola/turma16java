programa
{
	
	funcao inicio()
	{

     inteiro valorPont[5], maior=0
     
	para(inteiro y=0; y <5; y++) {
		escreva("\nDigite o valor da pontuação da atividade ",y," :")
		leia(valorPont[y]) 

		se(valorPont[y] > maior) {
		maior = valorPont[y]
		}
	}
	escreva ("\nA maior pontuação foi: ",maior)
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 174; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */