package Caneta;

class criandoCaneta {
	public static void main(String[] args){
		Caneta c1 = new Caneta();
		c1.modelo = "BIC";
		c1.cor = "Azul";
		c1.carga = 80;
		c1.destampar();
		c1.status();
	}
}

// Main pode utilizar a visibilidade p�blica e protegida.

/* O Atributo protegido "carga" tem sua execu��o realizada pois se encontra em um metodo principal 
(main) que utiliza a classe caneta. */

// Private s� dentro da classe;
