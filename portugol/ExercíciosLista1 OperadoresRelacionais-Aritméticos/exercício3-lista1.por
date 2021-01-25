programa
{
	
	funcao inicio()
	{
         inteiro segundos, minutos, horas, tempDuracao
	    
         escreva("tempDuracao em segundos: ")
         leia(tempDuracao)

         horas = tempDuracao / 3600
         minutos = (tempDuracao % 3600) / 60
         segundos = tempDuracao % minutos  

         escreva("O tempo de duração do evento é: " + horas + " horas " + minutos + " minutos e " + segundos + " segundos ")
          
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */