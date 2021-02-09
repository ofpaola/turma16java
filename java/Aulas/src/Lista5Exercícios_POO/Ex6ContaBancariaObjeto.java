package Lista5Exercícios_POO;

public class Ex6ContaBancariaObjeto {
	public static void main(String[] args) {
		
		Ex6ContaBancariaClasse conta = new Ex6ContaBancariaClasse("Paola Alencar",0202,01010101010,2000,20000);
		
		System.out.println("Titular\t\tCPF\t\tNúmero da Conta\tSaldo\tLimite");
		System.out.println(conta.titular+"\t"
						+conta.cpf+"\t"
						+conta.numeroConta+"\t\t"
						+conta.saldo+"\t"
						+conta.limite);
		
	}

}
