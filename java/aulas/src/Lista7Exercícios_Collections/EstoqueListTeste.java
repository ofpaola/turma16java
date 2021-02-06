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
		
		while(opcao!=0) {
			System.out.println("[PRODUTO][PREÇO][ESTOQUE]");
			for(EstoqueCollection produtos : lista) {
				System.out.printf("%s\t%.2f\t%d\n",produtos.getDescricao(), produtos.getPreco(), produtos.getEstoque());
		}
			
		System.out.println("Digite uma opção: "
							+"1 = Adicionar algum produto."
							+"2 = Remover algum produto."
							+"3 = Atualizar produtos."
							+"0 = Sair do programa!");
		opcao = leia.next().charAt(0);
		
		if(opcao==1) {
			System.out.print("Digite o nome do produto: ");
			String descricao = leia.next();
			System.out.print("Digite o preço do produto: ");
			double preco = leia.nextDouble();
			System.out.println("Digite o estoque disponível: ");
			int estoque = leia.nextInt();
			EstoqueCollection estoquec = new EstoqueCollection(preco, descricao, estoque);
			lista.add(estoquec);
			}
		else if(opcao==2) {
			System.out.println("Digite o nome do produto que deseja remover: ");
			String removePro = leia.next();
			for (EstoqueCollection estoquec : lista) {
				if (estoquec.getDescricao().equals(removePro))
				{
					lista.remove(estoquec);
				}
			  }
			}
		else if(opcao==3) {
			
		}
		}
		
	}

}
