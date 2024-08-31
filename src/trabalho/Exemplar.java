package trabalho;

public class Exemplar {
	private int idLivro;
	private boolean disponivel;
	private Livro livro;
	private Emprestimo emprestimoAtual;
	
	public Exemplar(int idLivro,Livro livro) {
		super();
		this.idLivro = idLivro;
		this.disponivel = true;
		this.emprestimoAtual = null;
		this.livro = livro;
	}

	public int getCodigo() {
		return idLivro;
	}

	public void setCodigo(int codigo) {
		this.idLivro = codigo;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
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
