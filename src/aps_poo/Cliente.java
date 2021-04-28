package aps_poo;

public class Cliente {



	public int numConta;
	public String nomeCliente;
	public float saldoCliente;
	public int tipo;
	
	public Cliente(int numConta, String nomeCliente, float saldoCliente, int tipo){
		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
		this.saldoCliente = 0;
		this.tipo = tipo;
	}
	


	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public float getSaldoCliente() {
		return saldoCliente;
	}

	public void setSaldoCliente(float saldoCliente) {
		this.saldoCliente = saldoCliente;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public void status() {
		System.out.println("cliente:" +this.nomeCliente+  " numero da conta"  + this.numConta + this.tipo);
		System.out.println("o saldo do cliente é "+this.saldoCliente);
	}

}




