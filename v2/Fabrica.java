package trabalho;

public class Fabrica {
	public static Emprestimo criarEmprestimo(Exemplar exemplar, Usuario usuario) {
		return new Emprestimo(exemplar, usuario);
	}
	
	public static Reserva criarReserva(Livro livro, Usuario usuario) {
		return new Reserva(livro, usuario);
	}
	
	public static Biblioteca criarBiblioteca() {
		return Biblioteca.getInstancia();
	}
	
	public static Sistema criarEntrada() {
		return new Sistema();
	}
	
	public static Parametros criarParametros() {
		return new Parametros();
	}	
	public static Exemplar criarExemplar(String idLivro, Livro livro){
		return new Exemplar(idLivro, livro);
	}
	public static Livro criarLivro(String idLivro, String titulo, String editora, String autores, int edicao, int anoPublicacao){
		return new Livro(idLivro, titulo, editora, autores, edicao, anoPublicacao);
	}
	
	public static VerificadorAluno criarVerificadorAluno() {
		return new VerificadorAluno();
	}
	
	public static VerificadorEmprestimoProfessor criarVerificadorProfessor() {
		return new VerificadorEmprestimoProfessor();
	}
	public static AlunoGrad criarAlunoGraduacao(String codID, String nome){
		return new AlunoGrad(codID, nome, 3, Fabrica.criarVerificadorAluno());
	}
	
	public static AlunoPosGrad criarAlunoPosGraduacao(String codID, String nome){
		return new AlunoPosGrad(codID, nome, 4, Fabrica.criarVerificadorAluno());
	}
	
	public static Professor criarProfessor(String codID, String nome){
		return new Professor(codID, nome, 7, Fabrica.criarVerificadorProfessor());
	}

}/**/