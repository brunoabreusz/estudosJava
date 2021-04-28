package prova_poo;

public class questão_prova {

	public static void metodoUm() {
		int v1 = 20;
		
		//metodoDois(v1 + 5);
		
		int v2 = v1 + 3;
		System.out.println(v2);
	}
	
	public void metodoDois(int v1) {
		v1 = v1 + 10;
	}
	
	
	public static void main(String[] args) {
		metodoUm();
	}

}
