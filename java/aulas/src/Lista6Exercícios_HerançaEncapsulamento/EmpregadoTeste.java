package Lista6Exercícios_HerançaEncapsulamento;

import java.util.Scanner;

public class EmpregadoTeste {

	public static void main(String[] args) {
	
		    Scanner leia = new Scanner(System.in);
		    Empregado empregado = new Empregado("Paola","Rua Uriri","940028922",'F',21);

		    System.out.println("Nome empregado\tEndereço\tTelefone\tSexo\tIdade");
			System.out.printf(empregado.getNome()+"\t\t"
								+empregado.getEndereco()
								+"\t"+empregado.getTelefone()+"\t"
								+empregado.getSexo()
								+"\t"+empregado.getIdade());
		    
		    System.out.print("\n\nInsira o salário base: ");
		    empregado.setSalarioBase(leia.nextDouble());
		
		    System.out.print("Insira código do setor: ");
		    empregado.setCodigoSetor(leia.nextInt());
		    
		    System.out.print("Insira o percentual de aumento (%): ");
		    empregado.setImposto(leia.nextDouble());
		    
		    empregado.calcularSalario();
		    System.out.println("\nNovo Salario: "+empregado.getSalarioBase());
	}

}
