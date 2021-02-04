package Lista6Exercícios_HerançaEncapsulamento;

public class FornecedorTeste {
	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor("Paola","Rua Uriri","940028922",'F',21);
		
		fornecedor.setValorDivida(100);
		fornecedor.setValorCredito(200);
		
		System.out.println("Nome Fornecedor\tEndereço\tTelefone\tSexo\tIdade");
		System.out.printf(fornecedor.getNome()+"\t\t"
							+fornecedor.getEndereco()
							+"\t"+fornecedor.getTelefone()+"\t"
							+fornecedor.getSexo()
							+"\t"+fornecedor.getIdade());
		System.out.printf("\n\nO valor da dívida do fornecedor é de: "+fornecedor.getValorDivida());
		System.out.printf("\nO valor do crédito é: "+fornecedor.getValorCredito());
		System.out.printf("\nO saldo é de: "+fornecedor.obterSaldo(100, 200));
	}
}
