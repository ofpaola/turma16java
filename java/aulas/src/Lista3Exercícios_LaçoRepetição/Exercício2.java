package Lista3Exerc�cios_La�oRepeti��o;

import java.util.*;

public class Exerc�cio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, totalPares=0, totalIm=0;
		
		for(int x=1; x<=10; x++) {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
		
		
		if(numero%2==0) {
			totalPares++;
		}
		else {
			totalIm++;
		}
		}
		System.out.printf("\nA quantidade de n�meros pares fornecidos: %d",totalPares);
		System.out.printf("\nA quantidade de n�meros �mpares fornecidos: %d",totalIm);
	}

}
