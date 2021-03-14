package modelo;
import java.util.ArrayList;
import java.util.List;

public class Video {
	private String link;
	private String nome;
	private double media;
	private List<Assunto> assuntos = new ArrayList<>();
	private List<Visualizacao> visualizacoes = new ArrayList<>();

	public List<Visualizacao> getVisualizacoes() {
		return visualizacoes;
	}

	public Video(String link, String nome) {
		this.link = link;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void adicionar(Assunto a) {
		assuntos.add(a);
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public void adicionar(Visualizacao vis) {
		visualizacoes.clear();
		visualizacoes.add(vis);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getlink() {
		return link;
	}
	public List<Assunto> getAssuntos() {
		return assuntos;
	}

	@Override
	public String toString() {
		String texto = "Video [" + (link != null ? "link=" + link + ", " : "") + (nome != null ? "nome=" + nome + ", " : "")
				+ "media=";
		
		texto+=", assuntos=";
		for(Assunto a : assuntos) {
			texto += a;
		}
		texto+="\n visualizacoes=";
		for(Visualizacao vis : visualizacoes) {
			texto += vis;
		}
		return texto;
	}



}
