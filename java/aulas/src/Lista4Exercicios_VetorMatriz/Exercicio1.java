package Lista4Exercicios_VetorMatriz;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) { 
		Scanner leia = new Scanner(System.in);
		
		int maior=0;
		int [] pontuacao = new int[5];
		
		for(int x=0; x<5; x++) {
			System.out.printf("Entre com a pontuação %d: ",x);
			pontuacao[x] = leia.nextInt();
			
			if(pontuacao[x] > maior) {
				maior = pontuacao[x];
			}
		}
		System.out.printf("\nA maior pontuação foi: %d",maior);
		
	}

}
