package TestePOO;

public class Pessoa {
	
	private String primeiroNome;
	private String nomeDoMeio;
	private String ultimoNome;
	
	public Pessoa(String primeiroNome, String nomeDoMeio, String ultimoNome) {
		super();
		this.primeiroNome = primeiroNome;
		this.nomeDoMeio = nomeDoMeio;
		this.ultimoNome = ultimoNome;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome +" "+ nomeDoMeio +" "+ ultimoNome; 
		return nomeCompleto;
	}
}
