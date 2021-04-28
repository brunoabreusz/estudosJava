package polimorfismo_pt2;

public class cachorro extends lobo{

	@Override
	public void emitirSom() {
		System.out.println("au au au");
	}
	
	public void reagir(String frase) {
	if(frase.equals("toma comida") || frase == "Ola") {
		System.out.println("Abanar e latir");
		
	}else{
		System.out.println("Rosnar");
		 }
	}
	
	public void reagir(int hora, int minuto) {
		if(hora<12) {
			System.out.println("Abanar");
		}else if(hora>=18) {
			System.out.println("Ignorar");
		}else {
			System.out.println("Abanar e latir");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono == true) {
			System.out.println("abanar");
		}else if(dono == false){
			System.out.println("latir");
		}
	}
	
}
