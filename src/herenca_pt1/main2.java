package herenca_pt1;

public class main2 {

	public static void main(String[] args) {
		
		pessoa p1 = new pessoa();
		aluno p2 = new aluno();
		professor p3 = new professor();
		funcionario p4 = new funcionario();
		
		p1.setNome("Drip");
		p2.setNome("Sauce");
		p3.setNome("Diamond");
		p4.setNome("Flex On me");
		p2.setIdade(10);
		p2.fazerAniversario();
		p3.setSalario(3000);
		p3.ReceberAum(10);
		
		System.out.println(p1.toString());
	}

}
