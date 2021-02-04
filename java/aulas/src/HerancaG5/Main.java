package HerancaG5;

public class Main {
	public static void main(String[] args) {

		Bolo bolo1 = new Bolo("Bolo de Chocolate","Doce",2);
		Pizza pizza1 = new Pizza("Pizza Franfo c/ Catupiry","Salgada",3);
		
		System.out.println( bolo1.getNome() );
		bolo1.frio();
		bolo1.setNome("Bolo de Morango");
		bolo1.frio();
		
		bolo1.retiraPedaco();
		bolo1.retiraPedaco();
		bolo1.retiraPedaco();
		
		System.out.println( bolo1.getNome());
		bolo1.quente();
		bolo1.setNome("Pizza Portuguesa");
		bolo1.quente();
		
		pizza1.retiraFatia();
		pizza1.retiraFatia();
		pizza1.retiraFatia();
		pizza1.retiraFatia();
	
	}
}
