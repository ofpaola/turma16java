package Lista3Exerc�cios_La�oRepeti��o;

import java.util.*;

public class Exerc�cio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero=0, soma=0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt(); 
			soma+=numero;
		}	
		while (numero>0);
			System.out.printf("\nA soma dos n�meros fornecidos �: %d",soma);
	}
}
