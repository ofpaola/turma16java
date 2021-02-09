package Lista5Exercícios_POO;

public class Ex5PatineteObjeto {
	public static void main(String[] args) {
		
		Ex5PatineteClasse patinete = new Ex5PatineteClasse("Elétrico","Branco");
		
		System.out.println("Tipo\t\tCor");
		System.out.println(patinete.tipo+"\t"+patinete.cor);
		
		patinete.velocidadeAtual = 0;
		patinete.velocidadeMaxima = 60;
		
		patinete.liga();
		patinete.acelera(25);
		
		System.out.println("\nE a velocidade atual é: "+patinete.velocidadeAtual);

	}

}
