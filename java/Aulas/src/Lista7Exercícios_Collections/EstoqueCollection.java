package Lista7Exercícios_Collections;

public class EstoqueCollection {
		
	private double preco;
	private String descricao;
	private int estoque;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public EstoqueCollection(double preco, String descricao, int estoque) {
		super();
		this.preco = preco;
		this.descricao = descricao;
		this.estoque = estoque;
	}
	
	
	
	
}
