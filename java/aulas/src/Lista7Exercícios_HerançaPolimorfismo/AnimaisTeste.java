package Lista7Exercícios_HerançaPolimorfismo;

public class AnimaisTeste {
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Max",4);
		Cavalo horse = new Cavalo("Troy",7);
		Preguica lazy = new Preguica("Lazy",5);
		
		System.out.println("**CACHORRO**");
		System.out.println("Nome: "+dog.getNome()+" | Idade: "+dog.getIdade());
		dog.emitirSom();
		dog.correr();
		System.out.println("**CAVALO**");
		System.out.println("Nome: "+horse.getNome()+" | Idade: "+horse.getIdade());
		horse.emitirSom();
		horse.correr();
		System.out.println("**PREGUIÇA**");
		System.out.println("Nome: "+lazy.getNome()+" | Idade: "+lazy.getIdade());
		lazy.emitirSom();
		lazy.subirArvore();
		
	}
}
