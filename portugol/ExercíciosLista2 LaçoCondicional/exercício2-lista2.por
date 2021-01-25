programa 
{
	
	funcao inicio()
	{
	
     inteiro codigo, horas, salario, horaE,excesso,horaT, total

     escreva("Digite o código do trabalhador: ")
     leia(codigo)
     escreva("Digite as horas trabalhadas: ")
     leia(horas)

     
     salario = 500
     horaT = horas * 10
     excesso = horas - 50
     horaE = excesso * 20
     total = salario + horaE
     

     se(horas>50) {
     escreva("O seu salário é de :" +salario+ "R$\n")
     escreva("O valor da hora extra de trabalho é de: " + horaE+ "R$\n")
     escreva("O valor total é de: " + total+ "R$")
     }
     senao se(horas<=50){
     escreva("Você trabalhou por " + horas + " horas\n") 
     escreva("E receberá o salário no valor de " + horaT + "R$")
     
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