programa
{
	
inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	
	 real x1, x2, y1, y2, d, resultado
	 
        escreva("primeiro ponto: ")
        leia(x1,y1)
        escreva("segundo ponto: ")
        leia(x2,y2)

        resultado = mat.potencia((x2-x1), 2) + mat.potencia((y2-y1), 2)
	   d = mat.raiz (resultado,2)
	   
	   escreva("a distância entre eles é: " + d)
	} }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */