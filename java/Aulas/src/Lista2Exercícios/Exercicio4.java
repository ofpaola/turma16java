package Lista2Exerc�cios;

import java.util.*;
import java.math.*;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		if (numero %2 == 0) {
			System.out.printf("O numero � par e a raiz quadrada dele �: ");
			System.out.println(Math.sqrt(numero));
		}
		else {
			System.out.printf("O n�mero � impar e o valor dele elevado ao quadrado �: ");
			System.out.println(Math.pow(numero, 2));
		}
	}

}
