programa
{
	
	funcao inicio()
	{
  
     real salario, mediasalario, mediafilhos=0.00, salario100=0.00, percentual, maiorsalario=0.00, somasalario=0.00
     inteiro filhos, somafilhos=0
     const inteiro habitantes = 20
     
	para(inteiro y=1; y <=habitantes; y++) {
		escreva("Digite o salário do habitante ",y,": ")
		leia(salario)
		escreva("Digite a quantidade de filhos do habitante ",y,": ")
		leia(filhos)

		somasalario = somasalario + salario
  		somafilhos = somafilhos + filhos

		se(salario <= 100)
		salario100++
		se(salario > maiorsalario)
		maiorsalario = salario
	}
     

     mediasalario = somasalario / habitantes 
     mediafilhos = somafilhos /habitantes
     percentual = (salario100 / habitantes) * 100
     
     escreva ("A média salarial dos habitantes é de R$",mediasalario)
	escreva ("\nA média de filhos por familia é de: ", mediafilhos)
	escreva ("\nO maior salário encontrado foi de R$: ",maiorsalario)
	escreva ("\nO percentual de pessoas com salário de até R$100,00 é de: ",percentual,"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1031; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */