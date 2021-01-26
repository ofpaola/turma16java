package Lista1Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int segundos, minutos, horas, tempDuracao;
		
		System.out.print("Tempo de duração em segundos: ");
		tempDuracao = leia.nextInt();
		
		horas = tempDuracao/3600;
		minutos = (tempDuracao%3600)/60;
		segundos = tempDuracao%minutos;
		
		System.out.println("O tempo de duração do evento é: "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos");
	}

}
