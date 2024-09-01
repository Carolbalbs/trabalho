package trabalho;

public class ConsultarUsuarioComando implements Comando {

	@Override
	public void executar(Parametros parametros) {
		String codigoUsuario = parametros.getCodigoUm();
		Biblioteca repositorio = Biblioteca.getInstancia();
		repositorio.consultarUsuarioApto(codigoUsuario);

	}

}
