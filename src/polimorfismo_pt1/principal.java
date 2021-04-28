package polimorfismo_pt1;

public class principal {

	public static void main(String[] args) {
		mamifero m = new mamifero();
		m.setCorPelo("Preto");
		m.alimentar();
		m.emitirSom();
		m.locomover();
		
		peixe p = new peixe();
		p.alimentar();
		p.emitirSom();
		p.locomover();
	}

}
