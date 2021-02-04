package Lista6Exercícios_HerançaEncapsulamento;

public class Empregado extends Pessoa {

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone, char sexo, int idade) {
		super(nome, endereco, telefone, sexo, idade);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public void calcularSalario() {
		this.salarioBase += this.salarioBase*this.imposto/100;
	}
	
	

}
