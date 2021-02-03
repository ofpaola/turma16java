package TestePOO;

public class Carro {
		String cor;
		String modelo;
		double velocidadeAtual;
		double velocidadeMaxima;
		
		void liga() {
			System.out.println("O carro está ligado...");
		}
		void acelera(double quantidade) {
			double velocidadeNova = this.velocidadeAtual+quantidade;
			this.velocidadeAtual = velocidadeNova;
		}
		int pegaMarcha() {
			
		}
}
