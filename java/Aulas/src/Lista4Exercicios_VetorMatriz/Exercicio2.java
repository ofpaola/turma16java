package Lista4Exercicios_VetorMatriz;

import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {

		Random random = new Random();
		int [] dado = new int [10];
		int soma=0, vezesM=0, maior=0;
		double media=0.0;
		
		for(int x=0; x<10; x++) {
			dado[x] = random.nextInt(6);
			soma += dado[x];
			
			if(dado[x] >= maior ) {
				if(dado[x] == maior) {
					vezesM++;
				} else {
					vezesM = 1;
				}
				maior = dado[x];
				}
		}
		for(int x=0; x<10; x++) {
			System.out.println("O n�mero do "+(x+1)+"� lan�amento foi: "+dado[x]+"\n");
		}
		
		media = soma / 10;
		
		System.out.printf("\nA m�dia aritm�tica dos lan�amentos foi de: %.2f ",media);
		System.out.printf("\nA soma dos lan�amentos foi de: %d",soma);
		System.out.printf("\nA maior pontua��o ocorreu %d vezes ",vezesM);
	}

}
