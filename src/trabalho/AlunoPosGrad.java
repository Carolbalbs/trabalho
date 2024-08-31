package trabalho;

public class AlunoPosGrad extends Usuario{

	public AlunoPosGrad(String codID,String nome, int tempoDeEmprestimo, IVerificadorEmprestimo verificador) {
		super(nome, codID, tempoDeEmprestimo, verificador);
		this.setLimiteEmprestimo(4);
	}

	

}
