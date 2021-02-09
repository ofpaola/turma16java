package Entidades;

public class Produto {
	
	double valor;
	int codigo;
	String descricao;
	
	public Produto (String descricao) 
	{
		this.descricao = descricao;
	}

	public Produto (int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Produto (double valor, int codigo, String descricao) {
		this.valor = valor;
		this.codigo = codigo;
		this.descricao = descricao;
	}
		
}
