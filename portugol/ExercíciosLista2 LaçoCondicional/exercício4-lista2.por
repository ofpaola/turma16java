programa 
{
	
	funcao inicio()
	{
          inteiro numero

          escreva("Informe um número: ")
          leia(numero)

          se (numero > 0)
          escreva("Esse número é positivo\n")

          senao se (numero == 0)
          escreva("Esse número é neutro\n")
          
          senao se (numero < 0)
          escreva("Esse número é negativo\n")

          se (numero % 2 == 0)
          escreva("Esse número é par\n")

          senao se ( numero % 2 != 0)
          escreva("Esse número é ímpar\n")

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */