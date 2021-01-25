programa
{
	
	funcao inicio()
	{
	
		 real vetor[5]
		 inteiro codigo, x

		 para(x=0;x<5;x++) {
		 	escreva("Digite um número: ")
		 	leia(vetor[x])
		 }
		     escreva("\nEscolha um código: [0]Finalizar [1]Ordem direta [2]Ordem inversa: ")
		     leia(codigo)
		 
		limpa()

		se (codigo == 1) 
		{
		escreva("Ordem direta:\n")
		para(x=0;x<5;x++)
		escreva("\n",vetor[x])
		}
		se(codigo == 2)
		{
		escreva("Ordem inversa:\n")
		para(x=5-1;x>=0;x--)
		escreva("\n",vetor[x])
		}
		se(codigo == 0) 
		{
		escreva("Fim!")
		}	
		senao se(codigo !=1 e codigo != 2)
		{
		escreva("Código inválido!")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 605; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */