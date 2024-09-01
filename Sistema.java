package trabalho;

import java.util.HashMap;

public class Sistema {
	private HashMap<String, Comando> comandos = new HashMap<String, Comando>();
	public Sistema() {
		initComandos();
	}
	private void initComandos() {
		comandos.put("emp", new EmprestarComando());
		comandos.put("dev", new DevolverComando());
		comandos.put("liv", new ConsultarLivroComando());
		comandos.put("res", new ReservarComando());
		comandos.put("obs", new RegistrarObservadorComando());
		comandos.put("usu", new ConsultarUsuarioComando());
		comandos.put("ntf", new ConsultarNotificacaoComando());
		comandos.put("sai", new FimProgramaComando());

	}
	
	public void executarComando(String strComando, Parametros entrada) {
		Comando comando = comandos.get(strComando);
		comando.executar(entrada);
	}
}
