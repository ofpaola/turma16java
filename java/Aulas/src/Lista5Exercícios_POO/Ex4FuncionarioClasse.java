package Lista5Exerc�cios_POO;

public class Ex4FuncionarioClasse {
		
		String nome;
		String cargo;
		double salario;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}

		public Ex4FuncionarioClasse (String nome, String cargo, double salario) {
			this.nome = nome;
			this.cargo = cargo;
			this.salario = salario;
		}
}
