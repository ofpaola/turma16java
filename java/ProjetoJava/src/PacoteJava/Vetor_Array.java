package PacoteJava;

import java.util.*;

public class Vetor_Array {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
		int[] arrayDois = {43, 42, 4, 8, 21, 55, 21, 2, 45};
		
		float[] nota = new float[5];
		
		//tamanho do array 
		if(arrayDois.length <=8) {
			System.out.println("Tamanho do ArraysDois - Menor ou Igual a 8!");
		} else {
			System.out.println("Tamanho do ArrayDois - Maior que 8!");
		}
		
		System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
		
		//utilização do for-each
		String[] cars = {"\nVolvo", "Ford","Mazda"};
		
		for(String i : cars) {
			System.out.println(i);
		}
		
		//populando um array
		for(int i=0; i<5;i++) {
			System.out.println("\nEntre com uma nota: ");
			nota[i]=leia.nextFloat();
		}
		//apresentando um array 
		for(int i=0; i<5; i++) {
			System.out.println("Nota "+i+"."+1+"= "+nota[i]);
		}

	}

}
