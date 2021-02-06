package Lista7Exercícios_Collections;

public class EstoqueCollection {
		
	private double preco;
	private String descricao;
	private int quantidade;
	
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
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public EstoqueCollection(double preco, String descricao, int quantidade) {
		super();
		this.preco = preco;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	
	
	
	
}
