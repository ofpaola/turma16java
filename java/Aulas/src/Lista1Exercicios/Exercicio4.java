package Lista1Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c, r, s, d;
		
		System.out.print("Digite um número positivo: ");
		a = leia.nextInt();
		System.out.print("Digite um número positivo: ");
		b = leia.nextInt();
		System.out.print("Digite um número positivo: ");
		c = leia.nextInt();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d= ((r + s) / 2);
		
		System.out.println("O resultado da expressão é: "+d);
	}

}
