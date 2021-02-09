package Aulas;

import java.util.*;

import java.math.*;

public class MiniEcommerce {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			final int n = 10;
			String[] codigoProdutos = {"01", "02", "03", "04", "05", "06", "07", "08", "09","10"};
			String[] nomeProdutos = {"Bolinha de morder para c�es",
									 "Tabuleiro roleta para c�es",
									 "Rato Jo�o-Bobo para gatos",
									 "Arranhador para gatos",
									 "Pel�cia para c�es",
									 "Rodinha para hamsters",
									 "Mordedor de borracha para c�es",
									 "Caixa toca para gatos",
									 "Mordedor osso de pel�cia para c�es",
									 "Piscina de bolinhas para c�es"};
			double precoProdutos[] = {9.9 , 22.9, 12 , 35.9 , 29.9 , 16.9 , 9.90 , 20.90, 15.90, 99.9};
			int estoque[] = {10,10,10,10,10,10,10,10,10,10};
			char comando;
			String codProduto;
			int qtdProduto;
			char comandoExterno = 'n';
						
			do {
				int carrinhoCompras[] = new int[n];
				String nome;
				char sexo;
				
				linha(32);
				System.out.print("\nPAGUFE Pet\nAqui, seu animal � mais feliz! \n");
				linha(32);
				System.out.print("\nInforme seu nome: ");
				nome = ler.nextLine();
				System.out.print("Informe seu sexo [M/F/O]: ");
				sexo = ler.next().toUpperCase().charAt(0);
				
				
				while (!(sexo == 'M' || sexo == 'F' || sexo == 'O'))
				{
					System.out.print("Informe seu sexo [M/F/O]: ");
					sexo = ler.next().toUpperCase().charAt(0);
				}	
					
				do {
					linha(90);
					imprimeLista(n,codigoProdutos,nomeProdutos,estoque,precoProdutos);
					linha(90);
					System.out.print("\nCOMANDOS:\na = Adicionar produto ao carrinho\nr = Retirar produto do carrinho\nc = Exibir o carrinho de compras\nf = Finalizar compra\ns = Sair\n");
					System.out.print("\nDigite o que deseja: ");
					comando = ler.next().toLowerCase().charAt(0);
				
					if (comando == 'a') {
					System.out.print("\nC�DIGO DO PRODUTO: ");
					codProduto = ler.nextLine();
					codProduto = ler.nextLine();
					int indice = encontraIndice(codProduto, n, codigoProdutos);
					if (indice > -1)
					
				{
				
				do 
				{
					System.out.print("\nQUANTIDADE DO PRODUTO: ");
					qtdProduto = ler.nextInt();
				    boolean result = adicionaAoCarrinho(indice, codProduto, qtdProduto, carrinhoCompras, n, codigoProdutos, estoque, precoProdutos);
				
				if (result)
				{
					System.out.print("\n***PRODUTO ADICIONADO AO CARRINHO***\n\n");
					comando = 'n';
				}
				else
				{
				if (estoque[indice] > 0)
				{
					System.out.print("\nH� APENAS "+estoque[indice]+" UNIDADES DISPON�VEIS\nDESEJA ADICIONAR OUTRA QUANTIDADE? [s/n]: ");
					comando = ler.next().toLowerCase().charAt(0);
				}
				else System.out.print("\nPRODUTO ESGOTADO\n");
										}
									}
									while (comando == 's');
								}
								else 
								{
									System.out.print("\n\n\n---C�DIGO DO PRODUTO N�O ENCONTRADO---\n");
								}
							}
					else if (comando == 'r') {
						System.out.print("\nC�DIGO DO PRODUTO: ");
						ler.nextLine();
						codProduto = ler.nextLine();
						int indice = encontraIndice(codProduto, n, codigoProdutos);
						if (indice > -1)
						{
							do 
							{
								System.out.print("\nQUANTIDADE A REMOVER: ");
								qtdProduto = ler.nextInt();
								
					boolean result = retiraDoCarrinho(indice, codProduto, qtdProduto, carrinhoCompras, n, codigoProdutos, estoque);
								if (result)
								{
									System.out.print("\nPRODUTO(S) RETIRADO(S) DO CARRINHO\n\n");
									comando = 'n';
								}
								else
								{
									if (carrinhoCompras[indice] > 0)
									{
										System.out.print("\nH� APENAS"+carrinhoCompras[indice]+" UNIDADES EM SEU CARRINHO\nDESEJA REMOVER OUTRA QUANTIDADE? [s/n]: ");
										comando = ler.next().toLowerCase().charAt(0);
									}
									else System.out.print("\nN�O H� PRODUTOS DESTE TIPO NO SEU CARRINHO\n");
								}
							}
							while (comando == 's');
						}
						else 
						{
							System.out.print("\n\n\n---C�DIGO DO PRODUTO N�O ENCONTRADO---\n");
						}
					} else if(comando == 'c')
					{
						System.out.print("\n\n|\tCOD\t|\tPre�o\t|   Seu Carrinho   |\tProduto Restante\t\n");
						for(int i=0;i<10;i++)
						{
							if(carrinhoCompras[i] != 0){
								System.out.print("|\t"+(i+1)+"\t|\t"+precoProdutos[i]+"\t|\t"+carrinhoCompras[i]+"\t|\t"+estoque[i]+"\n");
							}
						}
					}
							else if(comando == 's')
							{
								break;
							}
							else if(comando == 'f')
							{
								boolean result = pagamento( estoque,carrinhoCompras,  precoProdutos, nome, sexo);
								if (result) break;
								else {
									linha(90);
									System.out.println("\n**N�O FOI POSS�VEL FINALIZAR A COMPRA, POIS O CARRINHO ESTA VAZIO**\n");
								}
							}
						}
						while (true);
						linha(50);
						System.out.println("\nDESEJA SAIR DO PROGRAMA? [s/n]");
						comandoExterno = ler.next().toLowerCase().charAt(0);
						ler.nextLine();
					}
			
					while (comandoExterno == 'n');
					System.out.println("\nPROGRAMA FINALIZADO");
				}
		
			public static void linha(int tamanho) 
				
				{
					for (int x=1;x< tamanho; x++)
					{
						System.out.print("_");
					}
					System.out.println();
				}
				
			static void imprimeLista(int n, String[] codigoProdutos, String[] nomeProdutos, int[] estoque, double[] precoProdutos)
				
				{
					System.out.print("\nCOD PRODUTO\tESTOQUE \tPRE�O UNIT�RIO \t NOME DO PRODUTO\n");
					for (int i = 0; i < n; ++i) {
						System.out.print(codigoProdutos[i]+" \t\t "+estoque[i]+" \t\t"+precoProdutos[i]+" \t\t "+nomeProdutos[i]+"\n");
					}
				}
				
			static int encontraIndice(String codProduto, int n, String[] codigoProdutos)
				
				{
					int indice = -1;
					for (int i = 0; i < n; ++i) {
						if (codProduto.equals(codigoProdutos[i])) {
							indice = i;
							break;
						}
					}
					return indice;
				}
				
			static boolean adicionaAoCarrinho(int indice, String codProduto, int qtdProduto, int carrinhoCompras[], int n, String codigoProdutos[], int estoque[], double precoProdutos[]) {
					if (qtdProduto < 0) return false; 
					int restante = estoque[indice]-qtdProduto;
					if (restante < 0) return false; 
					carrinhoCompras[indice] = carrinhoCompras[indice]+qtdProduto; 
					estoque[indice] = estoque[indice]-qtdProduto; 
					return true;
				}
			
			static boolean retiraDoCarrinho(int indice, String codProduto, int qtdProduto, int carrinhoCompras[], int n, String codigoProdutos[], int estoque[]) {
				if (qtdProduto < 0) return false;
				int restante = carrinhoCompras[indice]-qtdProduto;
				if (restante < 0) return false;
				estoque[indice] = estoque[indice]+qtdProduto;
				carrinhoCompras[indice] = carrinhoCompras[indice]-qtdProduto;
				return true;
			}
				
			static boolean pagamento( int []estoque, int []carrinhoCompras, double [] precoProdutos, String nome, char sexo)
				
				{
					Scanner leia = new Scanner(System.in);
					String formaPagamento,tratamento = "a";
					int opcao;
					double totalGeral = 0, totalPagar = 0,totalComImposto = 0;
					linha(60);
					if(sexo=='F') {
						tratamento = "Sra." ;
					}
					if(sexo=='M') {
						tratamento = "Sr." ;
					}
					if(sexo=='O') {
						tratamento = "Srx." ;
					}
					System.out.print("\n\n|\tCOD\t|\tPre�o\t|   Seu Carrinho   |\tProduto Restante\t\n");
					for(int i=0;i<10;i++)
					{
						if(carrinhoCompras[i] != 0){
						System.out.print("|\t"+(i+1)+"\t|\t"+precoProdutos[i]+"\t|\t"+carrinhoCompras[i]+"\t|\t"+estoque[i]+"\n");
						totalGeral = carrinhoCompras[i]*precoProdutos[i];
						}
					}
					
					if (totalGeral == 0) { //se o totalGeral � zero, o carrinho est� vazio, ent�o retorna falso
						return false;
					}
					
					totalComImposto = totalGeral+(totalGeral*0.09);
					System.out.printf("\nTotal Geral: R$ %.2f + IMPOSTO (9%%): R$ %.2f  Total com imposto: R$ %.2f \n",totalGeral,totalGeral*0.09,totalComImposto);
					System.out.printf("\nEscolha a forma de pagamento\n");
					System.out.print("\n1- ZERAR CARRINHO");
					System.out.printf("\n2- A VISTA - 10%% DESCONTO: R$%.2f",(totalComImposto*0.9));	
					System.out.printf("\n3- CART�O - 1 VEZ:  R$%.2f SEM DESCONTO", totalComImposto);
					System.out.printf("\n4- CART�O - 2 VEZES - JUROS (10%%) - PARCELAS DE:  R$%.2f - TOTAL DE: R$%.2f",((totalComImposto+(totalComImposto*0.10))/2),(totalComImposto*1.10));
					System.out.printf("\n5- CART�O - 3 VEZES - JUROS (15%%) - PARCELAS DE:  R$%.2f - TOTAL DE: R$%.2f",((totalComImposto+(totalComImposto*0.15))/3),(totalComImposto*1.15));
					System.out.print("\n\nInsira Aqui: ");
					opcao = leia.nextInt();
					linha(80);
					if(opcao == 1){
						for(int i=0;i<10;i++)
						{
							estoque[i] += carrinhoCompras[i]; 
							carrinhoCompras[i] = 0;
							totalGeral = 0.0;
						}
					}
					else if(opcao == 2){
						formaPagamento = "A VISTA";
						System.out.println("\n NOTA FISCAL - PAGUFE PET - CNPJ XXXXXXXXX ");
						System.out.printf(" Ol� %s %s Voc� efetuou uma compra na op��o %s \n",tratamento,nome,formaPagamento);
						for(int i=0;i<10;i++)
						{
							if(carrinhoCompras[i] != 0){
							System.out.print("|\t"+(i+1)+"\t|\t"+precoProdutos[i]+"\t|\t"+carrinhoCompras[i]+"\t|\t"+estoque[i]+"\n");
							
							}
						}
						System.out.printf("\nTotal a pagar: � vista c/ 10%% DESCONTO: R$%.2f\\n",totalComImposto*0.9);
					}
					else if(opcao == 3){
						formaPagamento = "1 VEZ NO CART�O";
						System.out.println(" NOTA FISCAL - PAGUFE PET - CNPJ XXXXXXXXX ");
						System.out.printf(" Ol� %s %s Voc� efetuou uma compra na op��o %s \n",tratamento,nome,formaPagamento);
						for(int i=0;i<10;i++)
						{
							if(carrinhoCompras[i] != 0){
							System.out.print("|\t"+(i+1)+"\t|\t"+precoProdutos[i]+"\t|\t"+carrinhoCompras[i]+"\t|\t"+estoque[i]+"\n");
					
							}
						}
						System.out.printf("\nTotal a pagar: 1 vez no cart�o s/ Desconto: R$%.2f\n",totalComImposto);
					}
					else if(opcao == 4){
						formaPagamento = "2 VEZES NO CART�O";
						System.out.println(" NOTA FISCAL - PAGUFE PET - CNPJ XXXXXXXXX ");
						System.out.printf(" Ol� %s %s Voc� efetuou uma compra na op��o %s \n",tratamento,nome,formaPagamento);
						for(int i=0;i<10;i++)
						{
							if(carrinhoCompras[i] != 0){
							System.out.print("|\t"+(i+1)+"\t|\t"+precoProdutos[i]+"\t|\t"+carrinhoCompras[i]+"\t|\t"+estoque[i]+"\n");
							
							}
						}
						System.out.printf("\nTotal a pagar: 2 VEZES + JUROS (10%%) - PARCELAS DE:  R$%.2f - TOTAL DE: R$%.2f \n",((totalComImposto+(totalComImposto*0.10))/2),(totalComImposto*1.10));
					}
					else if(opcao == 5){
						formaPagamento = "3 VEZES NO CART�O";
						System.out.println(" NOTA FISCAL - PAGUFE PET - CNPJ XXXXXXXXX ");
						System.out.printf(" Ol� %s %s Voc� efetuou uma compra na op��o %s \n",tratamento,nome,formaPagamento);
						for(int i=0;i<10;i++)
						{
							if(carrinhoCompras[i] != 0){
							System.out.print("|\t"+(i+1)+"\t|\t"+precoProdutos[i]+"\t|\t"+carrinhoCompras[i]+"\t|\t"+estoque[i]+"\n");
							
							}
						}
						System.out.printf("\nTotal a pagar: 3 VEZES + JUROS (15%%) - PARCELAS DE: R$%.2f - TOTAL DE: R$%.2f \n",((totalComImposto+(totalComImposto*0.15))/3),(totalComImposto*1.15));
					}else{
						System.out.print("\nOp��o inv�lida!\nTente novamente");
					}
					System.out.println("Agrademos pela compra. Volte sempre !");
					
					return true;
				}
			}