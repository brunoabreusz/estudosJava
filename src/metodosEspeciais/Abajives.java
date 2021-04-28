package metodosEspeciais;


class Abajves {
	public static void main(String[] args) {
		Abaju a1 = new Abaju("Speed Run", 8, "White");
		a1.status();
		//a1.setModelo("FR Detoneitor");
		//a1.modelo = "FR Detoneitor"; // publico <-
		
		//a1.setBrilho(60);
		//a1.brilho = 1; não vai funcionar pq está privado. <-
		
		//a1.setCor("Branca");
	
		//System.out.println("Tenho um Abajives de modelo (" + a1.getModelo() + ") com cor (" + a1.getCor() + ") com brilho (" + a1.getBrilho()+")");
		
		Abaju a2 = new Abaju("Destruct", 8 , "Black");
		a2.status();
	}
	
	
	
}
