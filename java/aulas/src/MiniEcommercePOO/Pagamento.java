package MiniEcommercePOO;

public class Pagamento {
	
	private double totalGeral;
	private double totalComImposto;

	public double getTotalGeral() {
		return totalGeral;
	}
	public void setTotalGeral(double totalGeral) {
		this.totalGeral = totalGeral;
	}
	
	
	public void totalComImposto() {
		totalComImposto = totalGeral+(totalGeral*0.09);
	}
	
	public void pagarAVista(double pagarAVista) {
		pagarAVista = totalComImposto*0.9;
	}
	
	public void pagarCartao1Vez(double pagarCartao1Vez) {
		pagarCartao1Vez = totalComImposto;
	}
	
	public void pagarCartao2Vezes(double pagarCartao2Vezes) {
		pagarCartao2Vezes = totalComImposto*1.10;
	}
	
	public void pagarCartao3Vezes(double pagarCartao3Vezes) {
		pagarCartao3Vezes = totalComImposto*1.15;
	}
}
