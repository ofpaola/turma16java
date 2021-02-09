package Lista6Exercícios_HerançaEncapsulamento;

public class VendedorTeste {
	public static void main(String[] args) {
		
		Vendedor vend = new Vendedor("Paola", "Rua Opaco", "940028922", 'F', 21, 1000, 10, 1700);
		
		System.out.printf("Seja Bem-Vinda vendedora %s. O seu salário é no valor de R$%.2f.", vend.getNome(),vend.getSalario());
		System.out.printf("\nO valor das suas vendas foram de R$%.2f e a sua comissão foi de %d%%.",vend.getValorVendas(),vend.getComissao());
		System.out.printf("\nE o seu salário final ficou no valor de R$%.2f",vend.salarioFinal());
	}

}
