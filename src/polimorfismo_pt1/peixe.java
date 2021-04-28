package polimorfismo_pt1;

public class peixe extends animal{
	private String corEscama;
	
	public void soltarBolha() {
		System.out.println("Soltando bolha");
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("food substance");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("fish not sound");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
