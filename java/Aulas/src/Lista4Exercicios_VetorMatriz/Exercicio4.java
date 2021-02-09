package Lista4Exercicios_VetorMatriz;

import java.util.*;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int [3][3];
		int somaTotal=0, somaDiag=0;
		
		for(int x=0; x<3; x++) {
			for(int y=0; y<3; y++) {
				System.out.printf("Digite o número [%d][%d]:",x+1,y+1);
				matriz[x][y] = leia.nextInt();
			}
		}
		for(int x=0; x<3; x++) {
			for(int y=0; y<3; y++) {
				System.out.printf("  %d  ",matriz[x][y]);
			}
			System.out.println();
		}
		for(int x=0; x<3; x++) {
			for(int y=0; y<3; y++) {
				somaTotal += matriz[x][y];
			if(x==y) {
				somaDiag += matriz[x][y];
			}
			}
		}
		System.out.printf("\nA soma total dos números da matriz é %d",somaTotal);
		System.out.printf("\nA soma da diagonal principal é %d",somaDiag);
	}
}
