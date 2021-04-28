package herenca_pt1;

public class professor extends pessoa {

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	private String especialidade;
	private float salario;
	
	public void ReceberAum(float aum) {
		System.out.println("O aumento será de :" + (aum + this.salario));		
	}

}
