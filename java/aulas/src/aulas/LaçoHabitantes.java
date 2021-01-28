package aulas;

import java.util.*;

public class LaçoHabitantes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int filhos, somaFilhos=0,mediaFilhos;
		double salario, mediaSalario, salario100=0, percentual, maiorSalario=0, somaSalario=0;
		final int habitantes = 3;
		
		for (int y=1; y <=habitantes; y++) {
			System.out.printf("Digite o salário do habitante %d: ",y);
			salario = leia.nextFloat();
			System.out.printf("Digite a quantidade de filhos do habitante %d: ",y);
			filhos = leia.nextInt();
			
			somaSalario = somaSalario + salario;
			somaFilhos = somaFilhos + filhos;
			
			if(salario<=100)
				salario100++;
			if(salario > maiorSalario) 
				maiorSalario = salario;
			}
		    
		    mediaSalario = somaSalario / habitantes; 
			mediaFilhos = somaFilhos /habitantes;
			percentual = (salario100 / habitantes) * 100;
			
			System.out.printf("\nA média salarial dos habitantes é de R$%.2f",mediaSalario);
			System.out.printf("\nA média de filhos por familia é de: %d",mediaFilhos);
			System.out.printf("\nO maior salário encontrado foi de R$: R$%.2f",maiorSalario);
			System.out.printf("\nO percentual de pessoas com salário de até R$100,00 é de: %.2f",percentual);
	
	}

}
