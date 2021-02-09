package Aulas;

import java.util.Scanner;

import Entidades.Pessoa;


public class AdegaDesafio {

	public static void main(String[] args) {
	  Scanner leia = new Scanner(System.in);
	  Pessoa adega = new Pessoa();
	  
	  System.out.print("Bem-vindo à Adega Generation!\n");
	  
	  System.out.print("\nPor favor, digite seu nome: ");
	  adega.nome = leia.nextLine();
	  System.out.print("Agora, digite seu ano de nascimento: ");
	  adega.anoNascimento = leia.nextInt();
	  System.out.print("Informe seu sexo (F)feminino, (M)masculino ou (O)outros: ");
	  adega.sexo = leia.next().charAt(0);
	  
	  System.out.printf("%s %s, sua idade aproximada é de: %s anos e %s",adega.tratamento(), adega.nome, adega.idade(), adega.statusIdade());
	  System.out.println("\nAgradecemos a preferência!");
	  
	}

}
