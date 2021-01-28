package Lista3Exercícios_LaçoRepetição;

import java.util.*;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade=0, pessoa21=0, pessoa50=0;
		
		while(idade>=-98 && idade>=0) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			
		if(idade<21) {
			pessoa21++;
		}
		else if(idade>50) {
			pessoa50++;
		}
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d",pessoa21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d",pessoa50);
	}

}
