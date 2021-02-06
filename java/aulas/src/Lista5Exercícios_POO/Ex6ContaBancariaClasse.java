package Lista5Exercícios_POO;

public class Ex6ContaBancariaClasse {
		
		String titular;
		int numeroConta;
		int cpf;
		double saldo;
		double limite;

		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public int getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		public int getCpf() {
			return cpf;
		}
		public void setCpf(int cpf) {
			this.cpf = cpf;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public double getLimite() {
			return limite;
		}
		public void setLimite(double limite) {
			this.limite = limite;
		}

		public Ex6ContaBancariaClasse (String titular, int numeroConta, int cpf, double saldo, double limite) {
			this.titular = titular;
			this.numeroConta = numeroConta;
			this.cpf = cpf;
			this.saldo = saldo;
			this.limite = limite;
		}
}
