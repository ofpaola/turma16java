package Lista5Exercícios_POO;

public class Ex4FuncionarioObjeto {
	public static void main(String[] args) {
		
		Ex4FuncionarioClasse funcionario1 = new Ex4FuncionarioClasse("Paola","Desenvolvedora Full Stack",6500.00);
		Ex4FuncionarioClasse funcionario2 = new Ex4FuncionarioClasse("Giovanna","Desenvolvedora Front-end",3200.00);
		
		System.out.println("Nome do funcionário\tSalario\t\tCargo");
		System.out.println(funcionario1.nome+"\t\t\t"+funcionario1.salario+"\t\t"+funcionario1.cargo);
		System.out.println(funcionario2.nome+"\t\t"+funcionario2.salario+"\t\t"+funcionario2.cargo);

	}
	

}
