package Lista2Exercícios;

import java.util.*;
import java.math.*;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero %2 == 0) {
			System.out.printf("O numero é par e a raiz quadrada dele é: ");
			System.out.println(Math.sqrt(numero));
		}
		else {
			System.out.printf("O número é impar e o valor dele elevado ao quadrado é: ");
			System.out.println(Math.pow(numero, 2));
		}
	}

}
