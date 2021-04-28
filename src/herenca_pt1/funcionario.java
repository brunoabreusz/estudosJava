package herenca_pt1;

public class funcionario extends pessoa {

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho(String novoSetor) {
		System.out.println(this.getNome() + "está deixando o "+ this.setor + "para seu novo setor" + novoSetor);
	}

}
