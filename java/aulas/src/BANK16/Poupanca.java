package BANK16;

public class Poupanca extends Conta{

	private int diaAniversario;
	
	public Poupanca(String numero, String cpf, double saldo, int diaAniversario) {
		super(numero, cpf, saldo);
		this.diaAniversario = diaAniversario;
	}
	
	public void aniversario (int dia) {
		if(dia == diaAniversario) {
		 double valor = getSaldo() * 0.0005;
		 super.creditar(valor);
		}
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	
}
