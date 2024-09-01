package trabalho;


public class VerificadorAluno implements IVerificadorEmprestimo{
	@Override
	public boolean verificarPossibilidadeEmprestimo(Livro livro, Usuario usuario) {
		if (usuario.isDevedor()) {
			Impressoes.usuarioDevedor(usuario, livro);
			return false;
		}
		
		if (usuario.getEmprestimosAtuais().size() == usuario.getLimiteEmprestimo()) {
			Impressoes.limiteEmprestimo(usuario, livro);
			return false;
		}
		
		for (Emprestimo emprestimoAtual : usuario.getEmprestimosAtuais()) {
			if (emprestimoAtual.getExemplar().getLivro().getIdLivro() == livro.getIdLivro()) {
				Impressoes.emprestimoDuplicado(usuario, livro);
				return false;
			} 
		}
		
		boolean exemplarDisponivel = false;
		
		for (Exemplar exemplarAtual : livro.getExemplares()) {
			if (exemplarAtual.isDisponivel()) {
				exemplarDisponivel = true;
				break;
			} else {
				exemplarDisponivel = false;
			}
		}
		
		if (!exemplarDisponivel) {
			Impressoes.exemplaresIndisponiveis(usuario, livro);
			return exemplarDisponivel;
		}
		
		for (Reserva reservaAtual : livro.getReservasAtuais()) {
			if (reservaAtual.getUsuario().getCodID() == usuario.getCodID()) {
				return true;
			}
		}
		
		
		if (livro.getReservasAtuais().size() >= livro.getExemplares().size()) {
			Impressoes.totalmenteReservado(usuario, livro);
			return false;
		}
		
		return true;
		
	}

}
