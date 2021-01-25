programa 
{
	
funcao inicio()
	{
	
    inteiro multa = 0 
    inteiro pesoTomate = 0
    inteiro excesso = 0

		
	escreva("Quantos kg de tomate? ")
	leia(pesoTomate)

	multa = 4
	excesso = multa * pesoTomate /2

	se (pesoTomate>50) {
            escreva("Você ultrapassou o peso estabelecido e deverá pagar uma multa de " +excesso+ " reais")  
		}
	 senao se (pesoTomate<=50) { 
	 escreva("Você não ultrapassou o peso estabelecido e não terá que pagar multa")
		}
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