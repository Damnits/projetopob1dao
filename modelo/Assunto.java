package modelo;
import java.util.ArrayList;
import java.util.List;

public class Assunto {
	private String palavra;
	private List<Video> videos = new ArrayList<>();
	
	public Assunto(String palavra) {
		this.palavra = palavra;
	}

	
	public String getPalavra() {
		return palavra;
	}

	public void adicionar(Video v) {
		videos.add(v);
	}
	
	@Override
	public String toString() {
		String texto = "Assunto :" + palavra;
		return texto;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
}
