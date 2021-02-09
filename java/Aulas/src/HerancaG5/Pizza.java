package HerancaG5;

public class Pizza extends Comida {
	
	private int fatias;
	private String recheio;
	private boolean bordaRecheada;
	
	public Pizza(String nome, String sabor, int fatias) {
		super(nome, sabor);
		this.fatias = fatias;
	}
	
	public void retiraFatia(){
		
		if(fatias > 0) {
			System.out.println("Uma fatia da Pizza retirada");
			fatias --;
			System.out.println("Restam "+ fatias +" fatias.\n");
		}
		else
		{
			System.out.println("Acabou a Pizza :(\n");
		}
		
	}
	
	public int getFatias() {
		return fatias;
	}
	
	public void setFatias(int fatias) {
		this.fatias = fatias;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public boolean isBordaRecheada() {
		return bordaRecheada;
	}
	public void setBordaRecheada(boolean bordaRecheada) {
		this.bordaRecheada = bordaRecheada;
	}
}
