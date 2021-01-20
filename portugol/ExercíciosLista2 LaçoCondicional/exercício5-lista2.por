programa 
{
	
	funcao inicio()
	{

          real poluicao

	escreva("Indique o índice de poluição medido: ")
	leia(poluicao)
		

          se (poluicao >= 0.3 e poluicao <= 0.39) {
          escreva("Primeiro grupo intimado a suspender suas atividades\n" )
		}
          senao se (poluicao >= 0.4 e poluicao <= 0.49) 
          escreva("Primeiro e segundo grupo estão sendo intimados a suspenderem suas atividades\n")
          senao se (poluicao >= 0.5) 
          escreva("Todos os grupos estão sendo notificados a paralisarem suas atividades\n")
          senao 
          escreva("Os índices de poluição estão baixos")
          
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