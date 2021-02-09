package HerancaG5;

public class Bolo extends Comida {
	
	private String cobertura;
	private String recheio;
	private int camadas;
	private int numeroPedacos;
	
	public Bolo(String nome, String sabor, int numeroPedacos) {
		
		super(nome, sabor);
		this.numeroPedacos = numeroPedacos;
		
	}
	
	public void retiraPedaco(){
		
		if(numeroPedacos > 0) {
			System.out.println("Retirado um pedaço do bolo");
			numeroPedacos --;
			System.out.println("Restam "+ numeroPedacos +" pedaços.\n");
		}
		else
		{
			System.out.println("Acabou o BOLO :(\n");
		}
		
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public int getCamadas() {
		return camadas;
	}

	public void setCamadas(int camadas) {
		this.camadas = camadas;
	}

	public int getNumeroFatias() {
		return numeroPedacos;
	}

	public void setnumeroPedacos(int numeroPedacos) {
		this.numeroPedacos = numeroPedacos;
	}

}
