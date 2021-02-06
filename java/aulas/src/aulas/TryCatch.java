package aulas;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) 
		{
			Scanner leia = new Scanner(System.in);
			
			try
			{
			
				System.out.println("Digite uma sequencia de nomes:");
				String[] vetor = leia.nextLine().split(" ");//{"ed","rafao","milton"}
				System.out.println("Digite uma posi��o da lista: ");
				int posicao = leia.nextInt();
				System.out.println("O nome na posi��o escolhida � "+vetor[posicao]);
			}
			catch (java.lang.ArrayIndexOutOfBoundsException erro)
			{
				System.out.println("Amig�o, tu digitou um tamanho de indice errado!!!");
			}
			catch (java.util.InputMismatchException erro2) {
				System.out.println("Voc� digitou uma palavra, s� aceitamos n�meros!!");
			} finally {
				System.out.println("Voc� digitou algo errado, siga o que foi pedido.");
			}
			System.out.println("Fim de programa!!!!");
		}

}
