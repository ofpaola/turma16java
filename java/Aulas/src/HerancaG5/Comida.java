package HerancaG5;

public class Comida {
	
	private String nome;
	private String sabor;
	private boolean temperaturaQuente;
	
	public Comida(String nome, String sabor) {
		super();
		this.nome = nome;
		this.sabor = sabor;
	}

	public void quente(){
		this.temperaturaQuente = true;
		System.out.printf("%s está quente.\n\n",this.nome);
	}
	
	public void frio(){	
		this.temperaturaQuente = false;
		System.out.printf("%s esfriou.\n\n",this.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isTemperaturaQuente() {
		return temperaturaQuente;
	}

	public void setTemperaturaQuente(boolean temperaturaQuente) {
		this.temperaturaQuente = temperaturaQuente;
	}	
}
