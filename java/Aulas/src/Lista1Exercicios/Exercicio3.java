package Lista1Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int segundos, minutos, horas, tempDuracao;
		
		System.out.print("Tempo de dura��o em segundos: ");
		tempDuracao = leia.nextInt();
		
		horas = tempDuracao/3600;
		minutos = (tempDuracao%3600)/60;
		segundos = tempDuracao%minutos;
		
		System.out.println("O tempo de dura��o do evento �: "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos");
	}

}
