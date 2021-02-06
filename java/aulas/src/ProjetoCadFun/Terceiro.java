package ProjetoCadFun;

public class Terceiro extends Empregado {

	private double acrescimo;

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo) {
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	}

	public Terceiro(String nome, int matricula, int horas, double acrescimo) {
		super(nome, matricula, horas);
		this.acrescimo = acrescimo;
	}

	@Override
	public double salario() {
		return (super.salario()*acrescimo)+super.salario();
	}

}
