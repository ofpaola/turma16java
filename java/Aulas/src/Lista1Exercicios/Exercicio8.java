package Lista1Exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float custoFabrica, custoConsum;
		
		System.out.print("Digite o custo de f�brica do carro: ");
		custoFabrica = leia.nextFloat();
		
		custoConsum = custoFabrica + (custoFabrica * 28/100) + (custoFabrica * 45/100);
		
		System.out.println("O custo do consumidor �: " + custoConsum);
	}

}
