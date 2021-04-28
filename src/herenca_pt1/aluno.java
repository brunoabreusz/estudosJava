package herenca_pt1;

public class aluno extends pessoa {

	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	private int matr;
	private String curso;
	
		public void cancelarMatr() {
			System.out.println("Sua matrícula" +this.matr+ " está sendo cancelada!");
		}
}
