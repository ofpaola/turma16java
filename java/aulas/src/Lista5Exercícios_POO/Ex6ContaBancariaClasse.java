package Lista5Exercícios_POO;

public class Ex6ContaBancariaClasse {
		
		String titular;
		int numeroConta;
		int cpf;
		double saldo;
		double limite;
		
		public String titular() {
			return titular;
		}
		public void titular (String titular) {
			this.titular = titular;
		}
		
		public int numeroConta() {
			return numeroConta;
		}
		public void numeroConta (int numeroConta) {
			this.numeroConta = numeroConta;
		}
		
		public int cpf() {
			return cpf;
		}
		public void cpf (int cpf) {
			this.cpf = cpf;
		}
		
		public double saldo() {
			return saldo;
		}
		public void saldo (double saldo) {
			this.saldo = saldo;
		}
		
		public double limite() {
			return limite;
		}
		public void limite (double limite) {
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
