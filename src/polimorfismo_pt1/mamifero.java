package polimorfismo_pt1;

public class mamifero extends animal {

	private String corPelo;
	
	@Override
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {		
		System.out.println("Mamando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som mamifero");
		
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}



}
