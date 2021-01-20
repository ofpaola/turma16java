programa 
{
	
          funcao inicio()
	{

          real base, altura

          escreva("Informe a base do triângulo: ")
          leia(base)
          escreva("Informe a altura do triângulo: ")  
          leia(altura)
		

          se (base + altura > 0) {
          escreva("A área do triângulo é: " + base * altura / 2 )
		}
          senao se (base + altura < 0) 
          escreva("Não foi possível calcular a área pois o número informado é negativo")
          senao se (base < 0) 
          escreva("Não foi possível calcular a área pois um dos números informado é negativo")
          senao se (altura < 0) 
          escreva("Não foi possível calcular a área pois um dos números informado é negativo")
          
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