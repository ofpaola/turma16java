package Lista2Exercícios;

import java.util.*;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int idade;
		
		System.out.print("Digite sua idade e descubra em qual categoria se encontra: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade <=14) {
			System.out.println("Você se encontra na categoria Infantil!");
		}
		else if (idade>=15 && idade<=17) {
			System.out.println("Você se encontra na categoria Juvenil!");
		}
		else if (idade>=18 && idade<=25) {
			System.out.println("Você se encontra na categoria Adulto!");
		}
		else {
			System.out.println("Você não se encontra em nenhuma categoria!");
		}
	}

}
