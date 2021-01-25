programa
{
	
	funcao inicio()
	{
		caracter opcao = '1'
		inteiro nota[40]
		cadeia numMatricula, resultado, matricula[40], alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS",
		"ATHOS GIOM DE PAIVA MESQUITA","CÂNDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA",
		"DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA",
		"DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS",
		"FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN",
		"GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS",
		"JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI",
		"KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT",
		"LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS","MARIA NAZARE CORTEZ LIMA",
		"MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI","MILTON JUNIOR CAVALCANTE DA PENHA",
		"NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI",
		"RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}

		escreva("Matrículas\tAlunos\n")
		
		para(inteiro x=0; x<40; x++) 
		{
			matricula[x] = "G16-"+(x+1)	
			escreva(matricula[x], "\t\t",alunos[x],"\n")
		}
		enquanto(opcao=='1') {
		escreva("\nDigite o número da matrícula do aluno: ")
		leia(numMatricula)

		para(inteiro x=0; x<40; x++) 
		{
			se(numMatricula==matricula[x]) 
			{
			escreva("Você selecionou o aluno: ",alunos[x],"! Digite uma nota [0 a 10]: ")
			leia(nota[x])
			enquanto(nota[x]<0 ou nota[x]>10){
			leia(nota[x])
			}
			escreva("Deseja continuar? 1-[Sim] 2-[Não]: ")
			leia(opcao)
			}
		}
	}
		limpa()
		escreva("Matrículas\tNotas\t\tResultado\t\tAlunos\n")
		
		para(inteiro x=0; x<40; x++)
		{
			se(nota[x]>8)
			{
			resultado = "Aprovade"
			}
			senao se(nota[x]<=8 e nota[x]>=5)
			{
			resultado = "Em análise"
			}
			senao se(nota[x]<5 e nota[x]>0)
			{
			resultado = "Reprovade"
			}
			senao
			{
			resultado = "Não avaliade"
			}
			escreva(matricula[x],"\t\t",nota[x],"\t\t",resultado,"\t\t",alunos[x],"\n")
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2083; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */