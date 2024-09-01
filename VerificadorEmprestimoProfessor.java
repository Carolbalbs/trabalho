package trabalho;

public class VerificadorEmprestimoProfessor implements IVerificadorEmprestimo {
	@Override
	public boolean verificarPossibilidadeEmprestimo(Livro livro, Usuario usuario) {
		if (usuario.isDevedor()) {
			Impressoes.usuarioDevedor(usuario, livro);
			return false;
		}
		
		boolean exemplarDisponivel = false;
		
		for (Exemplar exemplarAtual : livro.getExemplares()) {
			if (exemplarAtual.isDisponivel()) {
				exemplarDisponivel = true;
				return exemplarDisponivel;
			} else {
				exemplarDisponivel = false;
			}
		}
		
		Impressoes.exemplaresIndisponiveis(usuario, livro);
		return exemplarDisponivel;

	}

}