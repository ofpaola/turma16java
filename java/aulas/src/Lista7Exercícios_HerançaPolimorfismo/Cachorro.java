package Lista7Exerc�cios_Heran�aPolimorfismo;

public class Cachorro extends Animal {
	
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("O cachorro est� latindo!");
	}
	public void correr() {
		System.out.println("O cachorro est� correndo!");
	}
}
