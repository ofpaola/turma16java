package TestePOO;

public class PessoaNome {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("João","Henrique","Oliveira");
		System.out.println(pessoa1.getNomeCompleto());
		
		Pessoa pessoa2 = new Pessoa("Paola","Alencar","Lisboa");
		System.out.println(pessoa2.getNomeCompleto());
		
		Pessoa pessoa3 = new Pessoa("Maria","Jose","Souza");
		System.out.println(pessoa3.getNomeCompleto());
		
		Pessoa pessoa4 = new Pessoa("Pedro","Henrique","Custódio");
		System.out.println(pessoa4.getNomeCompleto());
		
	}

}
