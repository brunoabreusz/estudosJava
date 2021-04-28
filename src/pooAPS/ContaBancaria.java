package pooAPS;

public class ContaBancaria {
	private Cliente[] clientes;
    private int contador;
    
    public ContaBancaria(int numClientes) {
    	this.clientes = new Cliente[numClientes];
    	this.contador = 0;
    }
    
    public void adicionaClientes(Cliente cliente) {
    	clientes[contador] = new Cliente(
			cliente.getNumero(),
			cliente.getNome(),
			cliente.getSaldo(),
			cliente.getTipo()
		);
    	this.contador++;
    }
    
    public void depositar(int numConta, float valor) {
    	for(int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNumero() == numConta) {
				clientes[i].setSaldo(clientes[i].getSaldo() + valor);
				
				return;
			} else {
				System.out.println("Conta inexistente.");
			}
	   	}
    }
    
    public void sacar(int numConta, float valor) {
    	for(int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNumero() == numConta) {
				if (valor <= clientes[i].getSaldo()) {
					clientes[i].setSaldo(clientes[i].getSaldo() - valor);
					
					return;
				} else {
					System.out.println("Saldo insuficente.");
				}
			} else {
				System.out.println("Conta inexistente.");
			}
	   	}
    }
    
    public void extratoBancario(int numConta) {
		for(int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNumero() == numConta) {
				System.out.println(
					"Nome: " + this.clientes[i].getNome() + " " + 
					"Numero: " + this.clientes[i].getNumero() + " " + 
					"Saldo: " + this.clientes[i].getSaldo() +  " " + 
					"Tipo: " +  this.clientes[i].getTipoHumanizado(this.clientes[i].getTipo())
				);
			}
	   	}
    }

	public int getContador() {
		return contador;
	}
}