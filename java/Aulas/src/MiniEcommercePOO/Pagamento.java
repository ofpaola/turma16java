package MiniEcommercePOO;

public class Pagamento {
	
	private double totalGeral;
	private double totalComImposto;
	private char opcaoPagamento;
	
	public double getTotalGeral() {
		return totalGeral;
	}
	public void setTotalGeral(double subTotal) {
		this.totalGeral = subTotal;
	}
	public double valorImposto()
	{
		return totalGeral*0.09;
	}
	
	public char getOpcaoPagamento() {
		return opcaoPagamento;
	}
	public void setOpcaoPagamento(char opcaoPagamento) {
		this.opcaoPagamento = opcaoPagamento;
	}
	public double totalComImposto() {
		
		return totalComImposto = totalGeral+(totalGeral*0.09);
	}
	
	public double pagarAVista() {
		
		return  totalComImposto*0.9;
	}
	
	public double pagarCartao1Vez() {
		return   totalComImposto;
	}
	
	public double pagarCartao2Vezes() {
		
		return  totalComImposto*1.10;
	}
	
	public double pagarCartao3Vezes() {
		return totalComImposto*1.15;
	}
}
