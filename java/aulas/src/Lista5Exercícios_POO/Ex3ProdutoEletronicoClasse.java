package Lista5Exercícios_POO;

public class Ex3ProdutoEletronicoClasse {
		String produto;
		double valor;
		int quantidade;
		
		public String produto() {
			return produto;
		}
		public void produto (String produto) {
			this.produto = produto;
		}
		
		public double valor() {
			return valor;
		}
		public void valor (double valor) {
			this.valor = valor;
		}
		
		public int quantidade() {
			return quantidade;
		}
		public void quantidade (int quantidade) {
			this.quantidade = quantidade;
		}
		
		public Ex3ProdutoEletronicoClasse (double valor, int quantidade, String produto) {
			this.valor = valor;
			this.quantidade = quantidade;
			this.produto = produto;
		}
}
