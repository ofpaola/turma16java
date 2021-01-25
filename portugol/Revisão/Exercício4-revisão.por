programa
{
	
	funcao inicio()
	{

	inteiro x = 0, numerador=-1
	real soma=0.0, div=0.0, denominador=0.0

	para(x=1;x<=50;x++) 
	{
	  escreva("\n",(2*x-1),"/",x)
	}
	para(numerador=-1; numerador<100; numerador++) {
		para(denominador=1; denominador<=50; denominador++) {
			numerador += 2
			div = numerador/denominador
			soma += div
		}
	}
	  escreva("\nA soma total é: ",soma)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */