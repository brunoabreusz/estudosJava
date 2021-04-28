package heranca_pt2;

public class tecnico extends aluno {
	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	private int registroProfissional;
	
	public void praticar() {
		System.out.println("O tecnico de nome"+ this.nome + "está praticando");
	}
}
