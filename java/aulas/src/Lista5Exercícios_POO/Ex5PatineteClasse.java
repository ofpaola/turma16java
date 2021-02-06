package Lista5Exercícios_POO;

public class Ex5PatineteClasse {
	
	String tipo;
	String cor;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
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
