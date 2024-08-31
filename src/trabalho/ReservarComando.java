package trabalho;

public class ReservarComando implements Comando {

	@Override
	public void executar(Parametros parametros) {
		String codigoUsuario = parametros.getCodigoUm();
		String codigoLivro = parametros.getCodigoDois();
		Biblioteca repositorio = Biblioteca.getInstancia();
		
		repositorio.reservarLivro(codigoUsuario,codigoLivro);
		
	}

}
