package trabalho;

public class ConsultarNotificacaoComando implements Comando {

	@Override
	public void executar(Parametros parametros) {
		String codigoUsuario = parametros.getCodigoUm();
		Biblioteca repositorio = Biblioteca.getInstancia();
		repositorio.consultarNotificacao(codigoUsuario);


	}

}
