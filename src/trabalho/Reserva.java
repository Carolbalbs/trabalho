package trabalho;

import java.util.Date;

public class Reserva {
	private Livro livro; 
	private Usuario usuario;
	private Date data;
	
	public Reserva(Livro livro, Usuario usuario) {
		super();
		this.livro = livro;
		this.usuario = usuario;
		this.setData(new Date());
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
}
