package Lista2Exercícios;

import java.util.*;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		if (num1>=num2 && num1>=num3) {
			System.out.printf("O maior número foi %d",num1);
		} else if (num2>=num1 && num2>=num3) {
			System.out.printf("O maior número foi %d",num2);
		} else { 
			System.out.printf("O maior número foi %d",num3);
		}

	}
		
}
