package Lista3Exercícios_LaçoRepetição;

import java.util.*;

public class Exercício5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero=0, soma=0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt(); 
			soma+=numero;
		}	
		while (numero>0);
			System.out.printf("\nA soma dos números fornecidos é: %d",soma);
	}
}
