package aulas;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero inteiro e positivo: ");
		numero = leia.nextInt();
		
		if (numero < 0) {
			System.out.println("Esse n�mero � negativo!");
		}
		else if (numero == 0) {
			System.out.println("Esse n�mero � neutro!");
		}
		else if (numero %2 == 0) {
			System.out.println("O numero � par!");
		}
		else {
			System.out.println("O n�mero � impar");
		}
		
		
	}
}
