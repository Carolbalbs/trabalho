package trabalho;

public class RegistrarObservadorComando implements Comando {

	@Override
	public void executar(Parametros parametros) {
		String codigoUsuario = parametros.getCodigoUm();
		String codigoLivro = parametros.getCodigoDois();
		Biblioteca repositorio = Biblioteca.getInstancia();
		
		repositorio.registrarObservador(codigoUsuario,codigoLivro);
		

	}

}
