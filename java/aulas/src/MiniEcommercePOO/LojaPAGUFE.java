package MiniEcommercePOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LojaPAGUFE {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		char comando;
		System.out.println("\n───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───\r\n"
				           + "───█▒▒░░░░░░░░░▒▒█───\r\n"
				           + "────█░░█░░░░░█░░█────\r\n"
				           + "─▄▄──█░░░▀█▀░░░█──▄▄─\r\n"
				           + "█░░█─▀▄░░░░░░░▄▀─█░░█\r\n"
				           + "█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\r\n"
				           + "█░░╦ ╦╔╗╦ ╔╗╔╗╔╦╗╔╗░░█\r\n"
				           + "█░░║║║╠ ║ ║ ║║║║║╠ ░░█\r\n"
				           + "█░░╚╩╝╚╝╚╝╚╝╚╝╩ ╩╚╝░░█\r\n"
				           + "█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█");
		linha(32);
		System.out.print("\nPAGUFE PET\nAqui, seu animal é mais feliz! \n");
		linha(32);
		System.out.print("\nInforme seu nome: ");
		String nome = ler.nextLine();
		System.out.print("Informe seu sexo [M/F/O]: ");
		char sexo = ler.next().toUpperCase().charAt(0);
		
		while(sexo != 'M' && sexo != 'F' && sexo != 'O')
		{
			System.out.print("Informe seu sexo [M/F/O]: ");
			sexo = ler.next().toUpperCase().charAt(0);
		}
		
		Cliente cliente = new Cliente(nome,sexo);
		
		List<Produto> produtos = new ArrayList();
		
		produtos.add(new Produto(1,10,9.9,"Bolinha de morder para cães"));
		produtos.add(new Produto(2,10,22.9,"Tabuleiro roleta para cães"));
		produtos.add(new Produto(3,10,12,"Rato João-Bobo para gatos"));
		produtos.add(new Produto(4,10,35.9,"Arranhador para gatos"));
		produtos.add(new Produto(5,10,29.9,"Pelúcia para cães"));
		produtos.add(new Produto(6,10,16.9,"Rodinha para hamsters"));
		produtos.add(new Produto(7,10,9.90,"Mordedor de borracha para cães"));
		produtos.add(new Produto(8,10,20.90,"Caixa toca para gatos"));
		produtos.add(new Produto(9,10,15.90,"Mordedor osso de pelúcia para cães"));
		produtos.add(new Produto(10,10,99.9,"Piscina de bolinhas para cães"));
		
		System.out.print("\nCOD PRODUTO\tESTOQUE \tPREÇO UNITÁRIO \t NOME DO PRODUTO\n");
		for(Produto p : produtos) { 
			System.out.println(p.getCodigo()+"\t\t"+p.getQtdEstoque()+"\t\t"+p.getPreco()+"\t\t "+p.getDescricao()); 
		}
		
		System.out.print("\nCOMANDOS:\na = Adicionar produto ao carrinho\nr = Retirar produto do carrinho\nc = Exibir o carrinho de compras\nf = Finalizar compra\ns = Sair\n");
		System.out.print("\nDigite o que deseja: ");
		comando = ler.next().toLowerCase().charAt(0);
	}

	

	public static void linha(int tamanho) 
	{
		for (int x=1;x< tamanho; x++)
		{
			System.out.print("_");
		}
		System.out.println();
	}

}
