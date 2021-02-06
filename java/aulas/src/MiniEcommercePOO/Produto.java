package MiniEcommercePOO;

public class Produto {

	private int codigo;
	private int qtdEstoque;
	private double preco;
	private String descricao;

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
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
	
	
	public Produto(int codigo, int qtdEstoque, double preco, String descricao) {
		super();
		this.codigo = codigo;
		this.qtdEstoque = qtdEstoque;
		this.preco = preco;
		this.descricao = descricao;
	}
}
