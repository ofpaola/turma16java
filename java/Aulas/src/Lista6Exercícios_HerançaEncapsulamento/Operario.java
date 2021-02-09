package Lista6Exercícios_HerançaEncapsulamento;

public class Operario extends Pessoa {
	
	private double valorProducao;
	private int comissao;
	private double salario;
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
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

	public double salarioFinal() {
		double salarioFinal = ((valorProducao + salario) * comissao / 100 + salario + valorProducao);
		return salarioFinal;
	}

	public Operario(String nome, String endereco, String telefone, char sexo, int idade, double valorProducao,
			int comissao, double salario) {
		super(nome, endereco, telefone, sexo, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.salario = salario;
	}
	
	

}
