package PacoteJava;

import java.util.*;

public class Condicional1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.print("Digite seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSua idade: %d",idade);
		
		if (idade>18) {
			System.out.println("\nVocê é maior de idade");
		}
		else if (idade>=1 && idade<18) {
			System.out.println("\nVocê é menor de idade");
		}
		else {
			System.out.println("\nVocê digitou uma idade inválida");
		}
	}

}
