package MiniEcommercePOO;

public class Cliente {
	
	private String nome;
	private char sexo;
	
	public Cliente(String nome, char sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String tratar()
	{
		String tratar;
		if (sexo == 'M')
		{
			tratar = "Sr.";
		}
		else if(sexo == 'F')
		{
			tratar = "Sra.";
		}
		else
		{
			tratar = "Sre.";
		}
		return tratar;
	}
}
