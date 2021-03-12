package modelo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Visualizacao {
	private int id;
	private LocalDateTime datahora = LocalDateTime.now();
	private int nota;
	private Usuario usuario;
	private Video video;
	
	public Visualizacao(int id, int nota, Usuario usuario, Video video) {
		this.id = id;
		this.nota = nota;
		this.usuario = usuario;
		this.video = video;
	}

	public int getId() {
		return id;
	}

	public String getdatahora() {
		return this.datahora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
	}

	public String getusuario() {
		return this.usuario.getEmail();
	}

	public String getvideo() {
		return this.video.getlink();
	}

	public int getnota() {
		return this.nota;
	}



	@Override
	public String toString() {
		return "Visualizacao [id=" + id + 
				", datahora=" + datahora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")) +
				", nota=" + nota +
				"\n usuario=" + usuario.getEmail() + ", video=" + video.getNome() + "]";
	}

}
