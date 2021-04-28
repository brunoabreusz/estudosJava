package polimorfismo_pt1;

public class ave extends animal {

	private String corPena;
	
	@Override
	public void locomover() {
		System.out.println("flying");
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("food");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("pruuu pruu");
	}

	public void fazerNinho() {
		System.out.println("Fazendo ninho");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}
