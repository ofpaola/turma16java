package Lista1Exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float x1, x2, y1, y2, d, resultado;
		
		System.out.print("Primeiro ponto: ");
		x1 = leia.nextFloat();
		y1 = leia.nextFloat();
		System.out.print("Segundo ponto: ");
		x2 = leia.nextFloat();
		y2 = leia.nextFloat();
		
		resultado = (float) ((float) Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
		d = (float) Math.sqrt(resultado);
		
		System.out.println("A distância entre eles é: "+d);
	}

}
