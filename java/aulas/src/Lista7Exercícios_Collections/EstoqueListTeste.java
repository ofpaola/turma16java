package Lista7Exercícios_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueListTeste {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List <EstoqueCollection> lista = new ArrayList<>();
		char opcao;
		
		System.out.println("Digite uma opção: "
							+"0 = Sair do programa!"
							+"1 = Adicionar algum produto."
							+"Remover algum produto."
							+"Atualizar produtos.");
		opcao = leia.next().charAt(0);
		
		
	}

}
