package BANK16;

public class Conta {
	private String numero;
	private String cpf;
	private double saldo;
	
	public void creditar(double valor)
	{
		saldo = valor + saldo;
	}
	public void debitar (double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor; 
		}
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public Conta(String numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
}
