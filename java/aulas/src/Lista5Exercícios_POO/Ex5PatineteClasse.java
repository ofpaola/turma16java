package Lista5Exercícios_POO;

public class Ex5PatineteClasse {
	
	String tipo;
	String cor;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	public String tipo() {
		return tipo;
	}
	public void tipo (String tipo) {
		this.tipo = tipo;
	}
	
	public String cor() {
		return cor;
	}
	public void cor (String cor) {
		this.cor = cor;
	}
	
	void liga() {
		System.out.println("O patinete está ligado!");
	}
	
	void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	public Ex5PatineteClasse (String tipo, String cor) {
		this.tipo = tipo;
		this.cor = cor;
	}
	

}
