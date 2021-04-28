package polimorfismo_pt2;

public class mamifero extends animal {
	protected String corPelo;

	@Override
	public void emitirSom() {
		System.out.println("Som de mamiféro");
		
	}
	
}
