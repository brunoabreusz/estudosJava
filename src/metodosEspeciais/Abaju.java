package metodosEspeciais;

public class Abaju {
	private String modelo;
	private float brilho;
	public String cor;
 boolean ligado;
	
	public Abaju(String m, float b, String c){  // Método construtor
		this.modelo = m;
		this.brilho = b;
		this.setCor("Preto");
		
		this.ligado();
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
public void setModelo(String m) {
		this.modelo = m;
}
	
	public float getBrilho() {
		return this.brilho;
	}
	
public void setBrilho(float b) {
		this.brilho = b;
}
	
public String getCor() {
		return this.cor;
	}
	
public void setCor(String c) {
	this.cor = c;
}
	
public void ligado(){
	this.ligado = true;
}

public void desligado() {
	this.ligado = false;
}

	public void status() {
		System.out.println("Caneta:");
		System.out.println("Modelo:" + this.getModelo());
		System.out.println("Brilho:" + this.getBrilho());
		System.out.println("Cor:" + this.getCor());
		System.out.println("Ligado: " + this.ligado);
	}
}
