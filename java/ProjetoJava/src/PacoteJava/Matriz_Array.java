package PacoteJava;

import java.util.*;

public class Matriz_Array {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int [3][3];
		
		System.out.println("Matriz [3][3]\n");
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna]=leia.nextInt();
			}
		}
		
		System.out.println("\nA matriz: \n");
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.printf("  %d  ",matriz[linha][coluna]);
			}
			System.out.println();
		}
	}

}
