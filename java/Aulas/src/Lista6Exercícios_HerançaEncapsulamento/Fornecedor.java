package Lista6Exercícios_HerançaEncapsulamento;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, char sexo, int idade) {
		super(nome, endereco, telefone, sexo, idade);
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo(double getValorDivida, double getValorCredito) {
		return getValorCredito - getValorDivida;
	}

}
