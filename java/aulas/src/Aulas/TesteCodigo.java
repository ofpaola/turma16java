package Aulas;

import java.util.Scanner;

public class TesteCodigo {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int valor;
		
		/*
		instead of doing if and else
		if((valor%2)==0)
		{
			System.out.println("O numero � par!!!");
		} else 
		{
			System.out.println("O numero � impar!!");
		}
		*/
		//an easy way is:
		
		System.out.println("Digite um numero inteiro positivo: ");
		valor = leia.nextInt();
		System.out.println((valor==0)?"Zero � neutro":(valor<0)?"Valor � negativo":(valor%2==0)?"Valor � par":"Valor � impar");
		
	}

}
