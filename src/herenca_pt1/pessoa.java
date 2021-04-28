package herenca_pt1;

public class pessoa {

private String nome;
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

private int idade;
private String sexo;
	
public void fazerAniversario() {
	System.out.println("Parabéns você fez aniversário."+ (this.idade+1));
}

@Override
public String toString() {
	return "pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
}



}
