programa 
{
	
	funcao inicio()
	{

     inteiro  num1, num2, num3, num4, qua1, qua2, qua3, qua4
     
     escreva ("Digite 4 números a seguir \n")
     escreva ("Digite o primeiro: ")
     leia(num1)
     escreva ("Digite o segundo: ")
     leia(num2)
     escreva ("Digite o terceiro: ")
     leia(num3)
     escreva ("Digite o quarto: ")
     leia(num4)

     qua1 = num1*num1 
     qua2 = num2*num2 
     qua3 = num3*num3 
     qua4 = num4*num4 

     limpa ()

     se (qua3>=1000) {
     escreva(qua3)
     }
     senao {
     escreva("O quadrado de ",num1, " é igual a: ",qua1,"\n")
     escreva("O quadrado de ",num2, " é igual a: ",qua2,"\n")
     escreva("O quadrado de ",num3, " é igual a: ",qua3,"\n")
     escreva("O quadrado de ",num4, " é igual a: ",qua4,"\n")
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