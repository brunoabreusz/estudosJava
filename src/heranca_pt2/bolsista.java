package heranca_pt2;

public class bolsista extends  aluno {
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Pagamento ok");
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("Sua mensalidade está renovada.");
	}

}
