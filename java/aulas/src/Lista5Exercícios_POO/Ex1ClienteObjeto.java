package Lista5Exercícios_POO;

public class Ex1ClienteObjeto {
	public static void main(String[] args) {

	Ex1ClienteClasse cliente1 = new Ex1ClienteClasse("Paola",21,"Rua Santo Rei", 40028922);
	Ex1ClienteClasse cliente2 = new Ex1ClienteClasse("João",50,"Rua Azevedo", 89224002);
	
	System.out.print("Nome do cliente\tIdade\tEndereço\t\tTelefone\n");
	System.out.println(cliente1.nome+" \t\t"+cliente1.idade+"\t"+cliente1.endereco+"\t\t"+cliente1.telefone);
	System.out.println(cliente2.nome+" \t\t"+cliente2.idade+"\t"+cliente2.endereco+"\t\t"+cliente2.telefone);
}
}