package Lista6Exerc�cios_Heran�aEncapsulamento;

public class FornecedorTeste {
	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor("Paola","Rua Uriri","940028922",'F',21);
		
		fornecedor.setValorDivida(100);
		fornecedor.setValorCredito(200);
		
		System.out.println("Nome Fornecedor\tEndere�o\tTelefone\tSexo\tIdade");
		System.out.printf(fornecedor.getNome()+"\t\t"
							+fornecedor.getEndereco()
							+"\t"+fornecedor.getTelefone()+"\t"
							+fornecedor.getSexo()
							+"\t"+fornecedor.getIdade());
		System.out.printf("\n\nO valor da d�vida do fornecedor � de: "+fornecedor.getValorDivida());
		System.out.printf("\nO valor do cr�dito �: "+fornecedor.getValorCredito());
		System.out.printf("\nO saldo � de: "+fornecedor.obterSaldo(100, 200));
	}
}
