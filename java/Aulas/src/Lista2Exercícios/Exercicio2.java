package Lista2Exerc�cios;

import java.util.*;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num1,num2,num3;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if (num1<=num2 && num1<=num3 && num2<=num3) {
			System.out.printf("A ordem crescente �: %d, %d e %d",num1,num2,num3);
		} 
		else if (num1<=num2 && num1<=num3 && num3<=num2) {
			System.out.printf("A ordem crescente �: %d, %d e %d",num1,num3,num2);
		} 
		else if (num2<=num1 && num2<=num3 && num1<=num3) {
			System.out.printf("A ordem crescente �: %d, %d e %d",num2,num1,num3);
		} 
		else if (num2<=num1 && num2<=num3 && num3<=num1) {
			System.out.printf("A ordem crescente �: %d, %d e %d",num2,num3,num1);
		} 
		else if (num3<=num1 && num3<=num2 && num1<=num2) {
			System.out.printf("A ordem crescente �: %d, %d e %d",num3,num1,num2);
		} 
		else if (num3<=num1 && num3<=num2 && num2<=num1) {
			System.out.printf("A ordem crescente �: %d, %d e %d",num3,num2,num1);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
