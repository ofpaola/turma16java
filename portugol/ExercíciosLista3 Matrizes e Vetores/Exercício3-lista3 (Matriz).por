programa
{

	inclua biblioteca Util	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		para(inteiro x = 0; x < 4; x++){
		para(inteiro y = 0; y < 6; y++){
			
			N1[x][y] = Util.sorteia(1, 100)
			N2[x][y] = Util.sorteia(1, 100)
			M1[x][y] = N1[x][y] + N2[x][y]
			M2[x][y] = N1[x][y] - N2[x][y]
		}
		}

		para(inteiro x = 0; x < 4; x++){
		para(inteiro y = 0; y < 6; y++){
			
			escreva(N1[x][y], " ")
		}
			
		escreva(" |______| ")
		para(inteiro y = 0; y < 6; y++){
		escreva(N2[x][y], " ")
		}
		escreva(" |______| ")
		para(inteiro y = 0; y < 6; y++){
		escreva(M1[x][y], " ")
		}
		escreva(" |______| ")
		para(inteiro y = 0; y < 6; y++){
		escreva(M2[x][y], " ")
		}

			escreva("\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 727; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 7, 10, 2}-{N2, 7, 20, 2}-{M1, 7, 30, 2}-{M2, 7, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */