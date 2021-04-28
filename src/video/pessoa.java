package video;

public abstract class pessoa {
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	protected String nome;
	protected int idade;
	protected String sexo;
	protected int experiencia;
	
	public pessoa(String nome, int idade, String sexo, float experiencia) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	
	protected void ganharExp() {
		if(this.experiencia < 0) {
			System.out.println(this.experiencia + 1);
		}
		System.out.println("operação invalida");
		
	}
}
