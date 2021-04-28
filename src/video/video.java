package video;

public class video implements acoesVideo {

	private String titulo;
	private int avaliacao;
	private int likes;
	private boolean reproduzindo;
	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}
	private int views;
	
	
	public video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.likes = 0;
		this.reproduzindo = false;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public boolean getReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	@Override
	public void play() {
		this.reproduzindo = true;
	}
	
	@Override
	public void pause() {
		this.reproduzindo = false;
		
	}
	@Override
	public void like() {
		this.likes++;
		
	}

	@Override
	public String toString() {
		return "video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", likes=" + likes + ", reproduzindo="
				+ reproduzindo + ", views=" + views + "]";
	}
	


	
	
}
