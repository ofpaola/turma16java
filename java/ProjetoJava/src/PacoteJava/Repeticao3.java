package PacoteJava;

import java.util.Scanner;

import java.util.*;

public class Repeticao3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		do {
			System.out.printf("\nEntre com a sua idade: ");
			idade = leia.nextInt();
		
			System.out.printf("\nSua idade: %d",idade);
			
		if(idade>=18) {
			System.out.printf("\nVoc� � de maior.");
			}
		else {
			System.out.printf("\nVoc� � de menor.");
			}
		} while(idade>=1);
	}

}

