package Lista6Exerc�cios_Heran�aEncapsulamento;

public class OperarioTeste {
	public static void main(String[] args) {
		
		Operario op = new Operario("Paola", "Rua Opaco", "940028922", 'F', 21, 800, 10, 1500);
		
		System.out.printf("Seja Bem-Vinda Oper�ria %s. O seu sal�rio � no valor de R$%.2f.", op.getNome(),op.getSalario());
		System.out.printf("\nO valor da sua produ��o foi de R$%.2f e a sua comiss�o foi de %d%%.",op.getValorProducao(),op.getComissao());
		System.out.printf("\nE o seu sal�rio final ficou no valor de R$%.2f",op.salarioFinal());
		
		
	}
}
