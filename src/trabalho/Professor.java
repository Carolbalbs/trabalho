package trabalho;

public class Professor extends Usuario implements IObservador {
	private int notificacoes;
	
	public Professor(String codID,String nome, int tempoDeEmprestimo, IVerificadorEmprestimo verificador) {
		super(nome, codID, tempoDeEmprestimo, verificador);
		this.notificacoes=0;
	}

	public Professor(String codID, String nome, int tempoDeEmprestimo, boolean devedor, int limiteEmprestimo,
			int notificacoes) {
		super(codID, nome, tempoDeEmprestimo, devedor, limiteEmprestimo);
		this.notificacoes = notificacoes;
	}

	public int getNotificacoes() {
		return notificacoes;
	}

	public void setNotificacoes(int notificacoes) {
		this.notificacoes = notificacoes;
	}

	@Override
	public void atualizarValores() {
		notificacoes =+1;
		
	}

}
