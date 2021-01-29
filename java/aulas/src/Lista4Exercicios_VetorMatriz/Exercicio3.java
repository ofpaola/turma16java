package Lista4Exercicios_VetorMatriz;

import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] N1 = new int [4][6];
		int[][] N2 = new int [4][6];
		int[][] M1 = new int [4][6];
		int[][] M2 = new int [4][6];
		
		for(int x=0; x<4; x++) {
			for(int y=0; y<6; y++) {
				N1[x][y] = random.nextInt(50);
				N2[x][y] = random.nextInt(50);
				M1[x][y] = N1[x][y] + N2[x][y];
				M2[x][y] = N1[x][y] + N2[x][y];
			}
		}
		
		for(int x=0; x<4; x++) {
			for(int y=0; y<6; y++) {
				System.out.printf("  "+N1[x][y]+"  ");
				
			}
			System.out.print("__");
			
			for(int y=0; y<6; y++) {
				System.out.printf("  "+N2[x][y]+"  ");
			}
			System.out.print("__");
			
			for(int y=0; y<6; y++) {
				System.out.printf("  "+M1[x][y]+"  ");
			}
			System.out.print("__");
			
			for(int y=0; y<6; y++) {
				System.out.printf("  "+M2[x][y]+"  ");
			}
			System.out.println();
		}
								
								
	}
}
