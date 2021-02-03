package Lista5Exercícios_POO;

public class Ex3ProdutoEletronicoObjeto {
	public static void main(String[] args) {
		
		Ex3ProdutoEletronicoClasse produto1 = new Ex3ProdutoEletronicoClasse(149.90,50,"Carregador Portátil");
		Ex3ProdutoEletronicoClasse produto2 = new Ex3ProdutoEletronicoClasse(169.90,10,"Caixa de som");
		Ex3ProdutoEletronicoClasse produto3 = new Ex3ProdutoEletronicoClasse(399.99,20,"Mesa Digitalizadora");
		Ex3ProdutoEletronicoClasse produto4 = new Ex3ProdutoEletronicoClasse(796.90,35,"Tablet 10 polegadas");
		
		System.out.println("Produto\t\t\tQuantidade\t\tValor");
		System.out.println(produto1.produto+"\t"+produto1.quantidade+"\t\t\t"+produto1.valor);
		System.out.println(produto2.produto+"\t"+produto2.quantidade+"\t\t\t"+produto2.valor);
		System.out.println(produto3.produto+"\t"+produto3.quantidade+"\t\t\t"+produto3.valor);
		System.out.println(produto4.produto+"\t"+produto4.quantidade+"\t\t\t"+produto4.valor);
		
	}

}
