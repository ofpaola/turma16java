package aulas;

import java.util.*;

public class ExemploLa�o {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int valor = leia.nextInt();
		
		for(int x=1; x<=valor; x++) {
			System.out.println("-");
		}
	}

}
