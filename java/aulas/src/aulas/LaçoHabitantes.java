package aulas;

import java.util.*;

public class La�oHabitantes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int filhos, somaFilhos=0,mediaFilhos;
		double salario, mediaSalario, salario100=0, percentual, maiorSalario=0, somaSalario=0;
		final int habitantes = 3;
		
		for (int y=1; y <=habitantes; y++) {
			System.out.printf("Digite o sal�rio do habitante %d: ",y);
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
			
			System.out.printf("\nA m�dia salarial dos habitantes � de R$%.2f",mediaSalario);
			System.out.printf("\nA m�dia de filhos por familia � de: %d",mediaFilhos);
			System.out.printf("\nO maior sal�rio encontrado foi de R$: R$%.2f",maiorSalario);
			System.out.printf("\nO percentual de pessoas com sal�rio de at� R$100,00 � de: %.2f",percentual);
	
	}

}
