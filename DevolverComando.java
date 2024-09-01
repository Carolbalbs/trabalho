package trabalho;

public class DevolverComando implements Comando {

	@Override
	public void executar(Parametros parametros) {
		String codigoUsuario = parametros.getCodigoUm();
		String codigoLivro = parametros.getCodigoDois();
		Biblioteca repositorio = Biblioteca.getInstancia();
		
		repositorio.devolverLivro(codigoUsuario,codigoLivro);

	}

}