package Lista6Exerc�cios_Heran�aEncapsulamento;

public class Administrador extends Pessoa {

	private double ajudaDeCusto;

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Administrador(String nome, String endereco, String telefone, char sexo, int idade, double ajudaDeCusto) {
		super(nome, endereco, telefone, sexo, idade);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
}
