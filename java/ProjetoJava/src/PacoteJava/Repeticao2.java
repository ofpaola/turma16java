package PacoteJava;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		System.out.printf("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade>=1) {
			System.out.printf("\nSua idade: %d",idade);
			
			if(idade>=18) {
				System.out.printf("\nVoc� � de maior.");
			}
			else {
				System.out.printf("\nVoc� � de menor.");
			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = leia.nextInt();
		}
	}

}
