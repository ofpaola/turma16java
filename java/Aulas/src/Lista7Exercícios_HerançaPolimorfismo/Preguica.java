package Lista7Exercícios_HerançaPolimorfismo;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("A preguiça está se espreguiçando!");
	}
	public void subirArvore() {
		System.out.println("A preguiça está subindo na árvore");
	}

}
