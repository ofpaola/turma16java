package Entidades;

public class Pessoa {

	public char sexo;
	public String nome;
	public int anoNascimento;
	
	public int idade() {
		return 2021 - anoNascimento;
	}
	
	public String statusIdade() {
		int idade;
		idade = 2021- anoNascimento;
		String mensagem="a";
		if(idade<18) {
			mensagem = "você é menor de 18 anos";
		}
		else if(idade>=18) {
			mensagem = "você é maior de idade";
		}
		return mensagem;
	}
	
	public String tratamento () {
		
		if(this.sexo == 'm' && this.sexo == 'M') {
			return "Sr.";
		}
		if(this.sexo == 'f' && this.sexo == 'F') {
			return "Sra.";
		}
		if(this.sexo == 'o' && this.sexo == 'O') {
			return "Sre.";
		}
		return "Você";
	}

	
	}
