package Aulas;

import java.util.*;

public class ExemploFacaEnquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, resultado=0;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		do {
		numero = numero - 1;
		resultado = numero + resultado;
		} 
		while (numero>=0); 
	    System.out.printf("O resultado é: %d", resultado);
	}

}
