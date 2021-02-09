package Lista1Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, m, d, idade;
		
		System.out.print("Escreva sua idade em dias: ");
		idade = leia.nextInt();
		
		a = idade/365;
		m = (idade%365)/30;
		d = idade%m;
		
		System.out.println("Sua idade em anos é: "+a+", em meses é: "+m+" e em dias é: "+d);
		
	}
		
}
