package ContaBanco;

public class ContaBanco {
	public int getNumConta() {
		return numConta;
	}



	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getDono() {
		return dono;
	}



	public void setDono(String dono) {
		this.dono = dono;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}



	public boolean getStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// atributos especiais get e set
	
	public ContaBanco(){
	this.setSaldo(0);
	this.setStatus(false);
	}
	


	// metodos
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if(t == "CC") {
			this.setSaldo(50);
		}else if(t == "CP"){
		 this.setSaldo(150);
		}
		
		System.out.println("Conta aberta");
	}
	
	public void fecharConta(boolean s) {
		if(this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		}else if(this.getSaldo() > 0) {
 
		}else{
			this.setStatus(false); // setStatus(false)
			System.out.println("Conta fechada");
		}
	}
	
	public void depositar(float v) {
		if(this.getStatus()) {
			setSaldo(getSaldo() + v);
			System.out.println("Deposito realizado na conta de" + this.getDono());
		} else {
			System.out.println("Impossivel depositar");
		}
	}

	public void sacar(float v) {
		if(getStatus()){ 
			if(this.getSaldo() >= v) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Saque realizado na conta" + this.getDono());
		}else{System.out.println("Sem saldo");
			}
		}else { 
			System.out.println("Impossivel sacar");
		}
	}
	
		public void pagarMensal() {
		int v = 0;
		if(this.getTipo() == "CC"){
			v = 12;
		}else if(this.getTipo() == "CP") {
			v = 20;
		}
		
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga" + this.getDono());
		}
	}

// pagarMensal
	public void status() {
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
}


