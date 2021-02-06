package Lista5Exercícios_POO;

public class Ex3ProdutoEletronicoClasse {
		String produto;
		double valor;
		int quantidade;
		
		public String getProduto() {
			return produto;
		}
		public void setProduto(String produto) {
			this.produto = produto;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}


		public Ex3ProdutoEletronicoClasse (double valor, int quantidade, String produto) {
			this.valor = valor;
			this.quantidade = quantidade;
			this.produto = produto;
		}
}
