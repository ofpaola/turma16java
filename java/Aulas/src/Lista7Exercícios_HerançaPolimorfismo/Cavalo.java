package Lista7Exerc�cios_Heran�aPolimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("O cavalo est� relinchando!");
	}
	public void correr() {
		System.out.println("O cavalo est� correndo");
	}
}
