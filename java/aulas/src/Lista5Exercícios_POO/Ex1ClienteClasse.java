package Lista5Exercícios_POO;

public class Ex1ClienteClasse {
	String nome;
	int idade;
	String endereco;
	int telefone;
	
	public String nome() {
		return nome;
	}
	public void nome (String nome) {
		this.nome = nome;
	}
		
	public int idade() {
		return idade;
	}
	public void idade (int idade) {
		this.idade = idade;
	}
	
	public String endereco() {
		return endereco;
	}
	public void endereco (String endereco) {
		this.endereco = endereco;
	}
	
	public int telefone() {
		return telefone;
	}
	public void telefone (int telefone) {
		this.telefone = telefone;
	}
	
	public Ex1ClienteClasse (String nome, int idade, String endereco, int telefone) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}

}
