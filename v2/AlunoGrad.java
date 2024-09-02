package trabalho;

public class AlunoGrad extends Usuario{

	public AlunoGrad(String codID,String nome , int tempoDeEmprestimo, IVerificadorEmprestimo verificador) {
		super(nome, codID, tempoDeEmprestimo, verificador);
		this.setLimiteEmprestimo(3);
	}

}
