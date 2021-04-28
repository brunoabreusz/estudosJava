package aps_poo;


/* 2)  Escreva uma classe chamada �ContaBancaria� que tenha como atributos um vetor do tipo �Cliente� e um contador (int) para identificar quantos clientes foram cadastrados. 
O construtor da classe deve receber como par�metro a quantidade de clientes (int) para instanciar o vetor e inicializar com zero o contador. 
A classe ainda deve ter um m�todo chamado �adicionaClientes� que receba como par�metro um objeto da classe �Cliente� e possa adicionar o novo cliente ao vetor de clientes.

3) Adicione a classe �ContaBancaria� um m�todo chamado �deposito� que deve receber como par�metro o n�mero da conta do cliente (int) e o valor a ser depositado (float). 
A l�gica do m�todo deve realizar a adi��o do valor depositado ao saldo da conta do cliente.
	Obs: Caso o n�mero da conta passado como par�metro n�o exista no vetor, mostre uma mensagem de erro.

4) Adicione a classe �ContaBancaria� um m�todo chamado �saque� que deve receber como par�metro o n�mero da conta do cliente (int) e o valor a ser retirado (float). 
A l�gica do m�todo deve realizar a subtra��o do valor retirado do saldo da conta do cliente.
	Obs: Caso o n�mero da conta passado como par�metro n�o exista no vetor, mostre uma mensagem de erro.

5) Adicione a classe �ContaBancaria� um m�todo chamado �extratoBancario� que deve receber como par�metro o n�mero da conta do cliente (int) e imprimir todos os dados dessa conta.
	Obs: Caso o n�mero da conta passado como par�metro n�o exista no vetor, mostre uma mensagem de erro.*/

public class ContaBancaria{

	Cliente[] vet;
	int contador;
	
	public ContaBancaria(int numeroClientes) {
		vet = new Cliente[numeroClientes];
		contador = 0;
	}
	
	public void adicionaClientes(Cliente obj) {
		if(contador < vet.length) {
			vet[contador] = obj;
			contador++;
		}
	}
	
	
	
	public void deposito(int Conta, float valor) {	
		int i = contador;
		if(vet[i].numConta == Conta) {
			System.out.println("Depositando: "+ (valor + vet[i].saldoCliente));
		}else {
			System.out.println("Conta n�o existe");
		}

	}
	
	public void sacar(int Conta, float valor) {
		int i = contador;
		if(vet[i].numConta == Conta) {
			System.out.println("Sacando: "+ (valor - vet[i].saldoCliente));
		}else {
			System.out.println("Conta n�o existe");
		}
	}
		public void extratoBancario(int Conta){
		
		}


	}


