package trabalho;

public class ConsultarLivroComando implements Comando {

	@Override
	public void executar(Parametros parametros) {
		
		String codigoLivro = parametros.getCodigoUm();
		Biblioteca repositorio = Biblioteca.getInstancia();
		Livro livro = repositorio.buscarLivroPorCodigo(codigoLivro); 
		Impressoes.consultaLivro(livro);
	}

}
