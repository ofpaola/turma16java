package Lista5Exercícios_POO;

public class Ex4FuncionarioClasse {
		
		String nome;
		String cargo;
		double salario;
		
		public String nome() {
			return nome;
		}
		public void nome (String nome) {
			this.nome = nome;
		}
		
		public String cargo() {
			return cargo;
		}
		public void cargo (String cargo) {
			this.cargo = cargo;
		}
		
		public double salario() {
			return salario;
		}
		public void salario (double salario) {
			this.salario = salario;
		}
		
		public Ex4FuncionarioClasse (String nome, String cargo, double salario) {
			this.nome = nome;
			this.cargo = cargo;
			this.salario = salario;
		}
}
