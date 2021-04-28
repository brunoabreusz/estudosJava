package video;

public class gafanhoto extends pessoa{

	public gafanhoto(String nome, int idade, String sexo, float experiencia, String login ) {
		super(nome, idade, sexo, experiencia);
		// TODO Auto-generated constructor stub
		this.login = login;
		this.totAssistido = 0;
	}


	private String login;
	private int totAssistido;
	
	
	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public float getTotAssistido() {
		return totAssistido;
	}


	public void setTotAssistido(float f) {
		this.totAssistido = (int) f;
	}


	public void viuMaisUm(int video) {
		System.out.println(video + 1);
	}


	/*public void setTotAssistido(float f) {
		// TODO Auto-generated method stub*/
		
	}

