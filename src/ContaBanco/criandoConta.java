package ContaBanco;

public class criandoConta {
	public static void main(String[] args) { // <<<<<<<<<<<<<<<<<<<<<

	ContaBanco p1 = new ContaBanco();
	p1.setNumConta(111);
	p1.setDono("bruno");
	p1.abrirConta("CP");
	
	
	p1.status();

	
	ContaBanco p2 = new ContaBanco();
	p2.setNumConta(222);
	p2.setDono("bruna");
	p2.abrirConta("CC");
	p2.depositar(1);

	p2.sacar(500);
	p2.status();
	}
}
/*System.out.println("Conta:" + this.getNumConta());
System.out.println("Tipo:" + this.getTipo());
System.out.println("Dono:" + this.getDono());
System.out.println("Saldo:" + this.getSaldo());
System.out.println("Status:" + this.getStatus());
*/
