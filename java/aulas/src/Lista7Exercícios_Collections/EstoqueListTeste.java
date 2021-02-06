package Lista7Exercícios_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collection;

public class EstoqueListTeste {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List <EstoqueCollection> lista = new ArrayList<>();
		char opcao=0;
		
		while(opcao!=0 ) {
			System.out.println("PRODUTO\t\tPREÇO\t\tESTOQUE");
			for(EstoqueCollection estoque : lista) {
				System.out.printf("%s\t%.2f\t%d\n",estoque.getDescricao(), estoque.getPreco(), estoque.getEstoque());
		}
			
		System.out.println("1 = Adicionar algum produto."
				+"\n2 = Remover algum produto."
				+"\n3 = Atualizar produtos."
				+"\n0 = Sair do programa!"
				+"\nDigite uma opção: ");
		opcao = leia.next().charAt(0); 
		
		if(opcao==1) {
			System.out.print("Digite o nome do produto que deseja adicionar: ");
			String descricao = leia.next();
			System.out.print("Digite o preço do produto: ");
			double preco = leia.nextDouble();
			System.out.print("Digite o estoque do produto: ");
			int estoque = leia.nextInt();
			lista.add((EstoqueCollection) lista);
			System.out.println("Produto adicionado!");
			}
		
		if(opcao==2) {
			System.out.println("Digite o nome do produto que deseja remover: ");
			String descricao = leia.next();
			System.out.print("Digite o preço do produto: ");
			double preco = leia.nextDouble();
			System.out.print("Digite o estoque do produto: ");
			int estoque = leia.nextInt();
			lista.remove((EstoqueCollection) lista);
			System.out.println("Produto removido!");
			}
		
		if(opcao==3) {
			System.out.println("PRODUTOS ATUALIZADOS");
			for (EstoqueCollection estoque : lista) {
				System.out.println(estoque);
			}
		}}
		}}