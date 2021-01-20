programa
{
	
funcao inicio()
	{
         inteiro a,m,d, idade
	    
         escreva("Sua idade em dias: ")
         leia(idade)

         a = idade/365
         m = (idade % 365) / 30
         d = idade % m

         escreva("Sua idade em anos é: " +  a + ", em meses é: " + m + " e em dias é: " + d)
          
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */