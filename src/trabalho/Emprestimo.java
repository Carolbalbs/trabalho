package trabalho;

import java.util.Date;

public class Emprestimo {
	private Exemplar exemplar;
	private Usuario usuario;
	private Date data;
	
	public Emprestimo(Exemplar exemplar, Usuario usuario) {
		super();
		this.exemplar = exemplar;
		this.usuario = usuario;
		this.setData(new Date());
	}
	public Exemplar getExemplar() {
		return exemplar;
	}

	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
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
