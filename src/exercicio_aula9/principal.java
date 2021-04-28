package exercicio_aula9;

public class principal {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[2];
		
		p[0] = new Pessoa("bruno", 19, "masc");
		p[1] = new Pessoa("bruna", 29, "femi");
		
		l[0] = new Livro("Aprendendo", "Bruno", 230, p[0]);
		l[0] = new Livro("Aprendendo Java", "Bruno", 530, p[0]);
		

		l[0].abrir();
		System.out.println(l[0].detalhes());
	}

}
