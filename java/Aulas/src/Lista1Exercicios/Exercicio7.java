package Lista1Exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c, d, e, f, x, y;
		
		System.out.print("A - Digite um número: ");
		a = leia.nextInt();
		System.out.print("B - Digite um número: ");
		b = leia.nextInt();
		System.out.print("C - Digite um número: ");
		c = leia.nextInt();
		System.out.print("D - Digite um número: ");
		d = leia.nextInt();
		System.out.print("E - Digite um número: ");
		e = leia.nextInt();
		System.out.print("F - Digite um número: ");
		f = leia.nextInt();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.println("o resultado de x é: " + x + " e o de y é: " + y);
}
}