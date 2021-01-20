programa {
	funcao inicio()
	{
       inteiro a, b, c, d, E, f, x, y
       
       escreva ("Digite a: ")
       leia(a)
       escreva ("Digite b: ")
       leia(b)
       escreva ("Digite c: ")
       leia(c)
       escreva ("Digite d: ")
       leia(d)
       escreva ("Digite E: ")
       leia(E)
       escreva ("Digite f: ")
       leia(f)

       x = (c*E - b*f) / (a*E - b*d)
       y = (a*f - c*d) / (a*E - b*d)

       escreva("o resultado de x é: " + x + " e o de y é: " + y)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 493; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */