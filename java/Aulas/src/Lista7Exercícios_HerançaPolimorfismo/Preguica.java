package Lista7Exerc�cios_Heran�aPolimorfismo;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("A pregui�a est� se espregui�ando!");
	}
	public void subirArvore() {
		System.out.println("A pregui�a est� subindo na �rvore");
	}

}
