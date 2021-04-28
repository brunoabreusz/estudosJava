package pooAPS;

public class Cliente {

	private int numero;
	private String nome;
	private float saldo;
	private int tipo;
	
	public Cliente(int numero, String nome, float saldo, int tipo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.tipo = tipo;
	}
	
	public Cliente() {
		super();
		this.numero = 0;
		this.nome = "";
		this.saldo = 0;
		this.tipo = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(byte tipo) {
		this.tipo = tipo;
	}
	
	public String getTipoHumanizado(int contaTipo) {
		if (contaTipo == 1) {
			return "Especial";
		}
		
		return "Comum";
	}
}
