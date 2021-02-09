package Lista3Exercícios_LaçoRepetição;

import java.util.*;

public class Exercício6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;
		double media3=0.00, soma=0.00,contador=0.00;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero%3==0 && numero!=0) {
				soma = soma+numero;
				contador++;
			}
		}
		while(numero != 0);
		if(contador != 0) {
		
		media3=soma/contador;
		}
		System.out.printf("A média dos números múltiplos de 3 é: "+media3);
		
	}

}
