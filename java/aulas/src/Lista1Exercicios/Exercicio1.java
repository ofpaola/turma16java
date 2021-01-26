package Lista1Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, m, d, resultado;
		
		System.out.print("Sua idade em anos: ");
		a = leia.nextInt();
		System.out.print("Sua idade em meses: ");
		m = leia.nextInt();
		System.out.print("Sua idade em dias: ");
		d = leia.nextInt();
		
		resultado = ((a*365)+(m*30)+d);
		
		System.out.println("Sua idade em dias é: ");
		System.out.println(resultado);
	}

}
