package Lista3Exercícios_LaçoRepetição;

import java.util.*;

public class Exercício2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, totalPares=0, totalIm=0;
		
		for(int x=1; x<=10; x++) {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
		
		
		if(numero%2==0) {
			totalPares++;
		}
		else {
			totalIm++;
		}
		}
		System.out.printf("\nA quantidade de números pares fornecidos: %d",totalPares);
		System.out.printf("\nA quantidade de números ímpares fornecidos: %d",totalIm);
	}

}
