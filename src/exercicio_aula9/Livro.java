package exercicio_aula9;


public class Livro implements Publicacao{

	public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPag = totalPag;
		this.leitor = leitor;
		this.aberto = false;
		this.pagAtual = 0;
	}
	

	

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotalPag() {
		return totalPag;
	}
	public void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totalPag=" + totalPag + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor + leitor.getIdade() + leitor.getNome() + leitor.getSexo();
	}
	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	

	public void abrir() {
	this.aberto = true;
	
	}


	public void fechar() {
		this.aberto = false;
		
	}


	public void folhear(int p) {
		if(p > this.totalPag) {
			this.pagAtual = 0;
		}else {
		this.pagAtual = p;
		}
	}




	public void avancarPag() {
		this.pagAtual++;
	}





	public void voltarPag() {
		this.pagAtual--;
		
	}
	


	
}
