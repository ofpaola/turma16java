package ProjetoCadFun;

import java.util.Scanner;

public class CadFunTeste {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Você é terceiro? S-sim N-não: ");
		char terceiro = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite a matricula: ");
		int matricula = leia.nextInt();
		System.out.print("Digite o seu nome: ");
		String nome = leia.next();
		System.out.print("Digite as horas trabalhadas: ");
		int horas = leia.nextInt();
		System.out.print("Digite o valor por hora trabalhada: ");
		double valorHora = leia.nextDouble();
		
		if(terceiro == 'S') {
			Empregado terceiro1 = new Terceiro(nome, horas, horas, valorHora, valorHora);
			System.out.println("------------------------------------\nFUNCIONARIO:");
			System.out.printf("Nome: %s\nMatricula: %d\nHoras trabalhadas: %d\nValor por Hora: %.2f\n", terceiro1.getNome(), terceiro1.getMatricula(), terceiro1.getHoras(), terceiro1.getValorHora());
			System.out.printf("\nSalário total: %.2f", terceiro1.salario());
			
		}else {
			Empregado empregado = new Empregado(nome, matricula, horas, valorHora);
			System.out.println("------------------------------------\nFUNCIONARIO:");
			System.out.printf("Nome: %s\nMatricula: %d\nHoras trabalhadas: %d\nValor por Hora: %.2f", empregado.getNome(), empregado.getMatricula(), empregado.getHoras(), empregado.getValorHora());
			System.out.printf("\nSalário total: %.2f", empregado.salario());
		
		System.out.println("");
		
		
		
		
		
		
	}

	}}
