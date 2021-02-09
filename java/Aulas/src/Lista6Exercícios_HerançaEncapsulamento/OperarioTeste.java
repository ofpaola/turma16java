package Lista6Exercícios_HerançaEncapsulamento;

public class OperarioTeste {
	public static void main(String[] args) {
		
		Operario op = new Operario("Paola", "Rua Opaco", "940028922", 'F', 21, 800, 10, 1500);
		
		System.out.printf("Seja Bem-Vinda Operária %s. O seu salário é no valor de R$%.2f.", op.getNome(),op.getSalario());
		System.out.printf("\nO valor da sua produção foi de R$%.2f e a sua comissão foi de %d%%.",op.getValorProducao(),op.getComissao());
		System.out.printf("\nE o seu salário final ficou no valor de R$%.2f",op.salarioFinal());
		
		
	}
}
