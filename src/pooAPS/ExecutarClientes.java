package pooAPS;

public class ExecutarClientes {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(123456, "Capenga", 10000, 2);
		Cliente c2 = new Cliente(654754, "Sem criatividade", 15, 1);
		ContaBancaria arrayContas = new ContaBancaria(2);
		
		arrayContas.adicionaClientes(c1);
		arrayContas.adicionaClientes(c2);
		
		arrayContas.depositar(123456, 10);
		arrayContas.sacar(123456, 10010);
		
		arrayContas.depositar(654754, 50);
		
		arrayContas.extratoBancario(123456);
		arrayContas.extratoBancario(654754);
	}

}
