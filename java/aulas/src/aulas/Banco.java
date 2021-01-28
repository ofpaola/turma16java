package aulas;

import java.util.*;

public class Banco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int limite = 1000, movimento, continua;
		double valorDeb, valorCred, saldoAtualdeb, saldoAtualcred;
		String descricao;
		
		System.out.println("[3]Bem-Vindo à sua Conta Especial");	
		System.out.print("\nSELECIONE O MOVIMENTO - 1(débito)/2(crédito): ");
		movimento = leia.nextInt();
		
		
		if(movimento == 1) {
			System.out.print("\nDESEJA USAR O SEU LIMITE DE 1000R$? SE SIM, QUANTO?: ");
			limite = leia.nextInt();
		if(limite >1000) {
			System.out.print("O seu limite é de 1000,00R$. Por favor, digite outro valor!: ");
			limite = leia.nextInt();
		}
			System.out.print("\nDigite o valor que deseja debitar: ");
			valorDeb = leia.nextDouble();
			System.out.print("\nDescreva o que gostaria de fazer: ");
			descricao = leia.next();
			saldoAtualdeb = limite - valorDeb;
			System.out.printf("\nSeu saldo é de: "+saldoAtualdeb);
			System.out.print("\nContinua: [3]sim ou [4]não?: ");
			continua = leia.nextInt();
		if(continua == 3) {
			System.out.print("\nSELECIONE O MOVIMENTO - 1(débito)/2(crédito): ");
			movimento = leia.nextInt();
		}
		}
		
		
		if(movimento == 2) {
			System.out.print("\nDigite o valor que deseja creditar: ");
			valorCred = leia.nextDouble();
			saldoAtualcred = valorCred;
			System.out.printf("\nSeu saldo é de: "+saldoAtualcred);
			System.out.print("\nContinua: [3]sim ou [4]não?: ");
			continua = leia.nextInt();
		if(continua == 4) {
			System.out.print("\nObrigadx pela transição! ");
		}
		if(continua == 3) {
			System.out.print("\nSELECIONE O MOVIMENTO - 1(débito)/2(crédito): ");
			movimento = leia.nextInt();
		}
		}
	}

}
