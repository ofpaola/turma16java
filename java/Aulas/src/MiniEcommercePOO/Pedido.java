package MiniEcommercePOO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {
	
	Date dataHoraAtual = new Date();
	String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
	String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
	
	private List <Produto> carrinho = new ArrayList<>();
	private double subTotal ;
	
	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
	public int encontrarIndice(String codProduto) {
		int indice = -1;
		int n = carrinho.size();
		for (int i = 0; i < n; ++i) { //verifica se existe produto no estoque com o código codProduto
			if (codProduto.equals( carrinho.get(i).getCodigo()) ) {
				indice = i;
				break;
			}
		}
		return indice;
	}
	
	public int qtdProdutosIndice(int indice) {
		return carrinho.get(indice).getQuantidade();
	}
	
	
	public void imprimirCarrinho() {
		System.out.print("\n**CARRINHO**:\n\n|\tCOD\t|\tPreço\t|   Quantidade No Seu Carrinho\n");
		for (Produto p : carrinho) {
			System.out.print("|\t" + p.getCodigo() + "\t|\t" + p.getPrecoUnitario() + "\t|\t" + p.getQuantidade() +"\n");
		}
		
	}
	
	//adiciona produtos sem informar índice do estoque
	public boolean adicionarProdutos(String codProduto, int qtdProduto, Estoque estoque) {
		
		if (qtdProduto < 0) return false;
		int iEstoque = estoque.encontrarIndice(codProduto);
		if (iEstoque < 0) return false; //se não encontrou, retorna falso
		boolean removeDoEstoque = estoque.removerProdutosIndice(iEstoque, qtdProduto);
		if (removeDoEstoque == false) return false;
		
		Produto prodEstoque = estoque.retornarProduto(iEstoque);
		int iCarrinho = encontrarIndice(codProduto);
		if (iCarrinho < 0) { //se o índice do carrinho for menor que 0, o produto ainda não está no carrrinho
			Produto prodCarrinho = new Produto(codProduto, prodEstoque.getNome(), qtdProduto, prodEstoque.getPrecoUnitario());
			carrinho.add(prodCarrinho);
			//carrinho.add( new Produto(codProduto, prodEstoque.getNome(), qtdProduto, prodEstoque.getPrecoUnitario()) );
		}
		else { //senão, só atualiza a quantidade do produto no carrinho
			Produto prodCarrinho = carrinho.get(iCarrinho);
			prodCarrinho.setQuantidade( prodCarrinho.getQuantidade() + qtdProduto );
		}
		
		return true;
	}
	
	//remove produtos sem informar índice do produto no carrinho
	public boolean removerProdutos(String codProduto, int qtdProduto, Estoque estoque) {
		
		if (qtdProduto < 0) return false;
		int iCarrinho = encontrarIndice(codProduto);
		Produto prodCarrinho = carrinho.get(iCarrinho);
		if ( qtdProduto > prodCarrinho.getQuantidade() ) return false;
		
		if ( qtdProduto == prodCarrinho.getQuantidade() ) { //se a quantidade a ser removida é igual à quantidade no carrinho
			carrinho.remove(iCarrinho); //remove o próprio elemento de posição iCarrinho
		}
		else { //se a quantidade a ser removida é igual menor que a quantidade no carrinho
			prodCarrinho.setQuantidade( prodCarrinho.getQuantidade() - qtdProduto ); //apenas subtrai a quantidade qtdProduto
		}
		
		int iEstoque = estoque.encontrarIndice(codProduto);
		if (iEstoque < 0) return false; //se não encontrou, retorna falso
		boolean adicionaAoEstoque = estoque.adicionarProdutosIndice(iEstoque, qtdProduto);
		if (adicionaAoEstoque == false) return false;
		
		return true;
	
	}
	
	public void zerarCarrinho(Estoque estoque) {
		int n = carrinho.size();
		for(int i = 0; i < n; i++) {
			Produto p = carrinho.get(i);
			int qtd = p.getQuantidade();
			String codigo = p.getCodigo();
			removerProdutos(codigo, qtd, estoque);
		}
	}
	
	public double subTotal()
	{
		for( Produto calculando : carrinho) {
			
			double mult = calculando.getQuantidade()*calculando.getPrecoUnitario();

			this.subTotal += mult;
		}
		return subTotal;
			
	}
	public void notaFiscal()
	{
		System.out.println("\t\tPAGUFE PetShop\n"
	            +"\t\t NOTA FISCAL\n"
	            +"\tEndereço, 0000 - Bairro\n"
	            +"\tSão Paulo - SP - CEP 00000-000\n"
	            +"CNPJ: XX.XXX.XXX/XXXX-XX\n"
	            +"----------------------------------------------------\n"
	            +data+"\t\t\t\t"+hora+"\n"
	            +"qntd\t preço\t produto \n");
				for (Produto p : carrinho) 
				{
					System.out.print(p.getQuantidade() +"\t"+ p.getPrecoUnitario()+"\t"+p.getNome()+"\n");
				}
	           System.out.println("----------------------------------------------------\n"
	   	            +"total: \t " );
	}

}
