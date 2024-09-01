package trabalho;

public class Exemplar {
	private String idLivro;
	private boolean disponivel;
	private Livro livro;
	private Emprestimo emprestimoAtual;
	
	public Exemplar(String idLivro,Livro livro) {
		super();
		this.idLivro = idLivro;
		this.disponivel = true;
		this.emprestimoAtual = null;
		this.livro = livro;
	}

	public String getCodigo() {
		return idLivro;
	}

	public void setCodigo(String codigo) {
		this.idLivro = codigo;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(String idLivro) {
		this.idLivro = idLivro;
	}

	public Emprestimo getEmprestimoAtual() {
		return emprestimoAtual;
	}

	public void setEmprestimoAtual(Emprestimo emprestimoAtual) {
		this.emprestimoAtual = emprestimoAtual;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}
