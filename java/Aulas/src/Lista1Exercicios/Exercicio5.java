package Lista1Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.print("Digite a segunda nota: ");
		nota2 = leia.nextInt();
		System.out.print("Digite a terceira nota: ");
		nota3 = leia.nextInt();
		
		media = (nota1*2+nota2*3+nota3*5) / 10;
		
		System.out.println("A média final é: "+media);
	}

}
