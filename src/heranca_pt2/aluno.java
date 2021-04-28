package heranca_pt2;

public class aluno extends pessoa {
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Sua mensalidade está paga.");
	}
}
