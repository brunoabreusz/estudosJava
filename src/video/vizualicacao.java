package video;

public class vizualicacao {
	private gafanhoto espectador;
	private video filme;
	
	public gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(gafanhoto espectador) {
		this.espectador = espectador;
	}
	public video getFilme() {
		return filme;
	}
	public void setFilme(video filme) {
		this.filme = filme;
	}
	
	public vizualicacao(gafanhoto espectador, video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}
	

}
