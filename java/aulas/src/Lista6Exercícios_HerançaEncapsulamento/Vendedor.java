package Lista6Exercícios_HerançaEncapsulamento;

public class Vendedor extends Pessoa {
		
	private double valorVendas;
	private int comissao;
	private double salario;
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public int getComissao() {
		return comissao;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Vendedor(String nome, String endereco, String telefone, char sexo, int idade, double valorVendas,
			int comissao, double salario) {
		super(nome, endereco, telefone, sexo, idade);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.salario = salario;
	}
	
	public double salarioFinal() {
			double salarioFinal = ((valorVendas + salario) * comissao / 100 + salario + valorVendas);
			return salarioFinal;
		}
}
