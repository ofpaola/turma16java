package Entidades;

public class Produtos {
	public static void main(String[] args) {
		
	Produto produto = new Produto(29.90,01,"Camiseta");
	
	System.out.print("VALOR\tPRODUTO\t\tCOD\n");
	System.out.print(produto.valor+"\t"+produto.descricao+"\t"+produto.codigo);
	
	}
}
