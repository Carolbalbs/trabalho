package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private static Biblioteca instancia;	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Livro> livros = new ArrayList<Livro>();
	
	private Biblioteca() {};
	
	public static Biblioteca getInstancia() {
		if (instancia == null)
			instancia = new Biblioteca();
		return instancia;
	}
	
	
	public Usuario buscarUsuarioPorCodigo(String codigoUsuario){
		for (Usuario usuarioAtual : this.usuarios) {
			if (usuarioAtual.getCodID().equals(codigoUsuario)) {
				return usuarioAtual;
			}
		}
		return null;
	}
	public Livro buscarLivroPorCodigo(String codigoLivro) {
		for (Livro livroAtual : this.livros) {
			if (livroAtual.getIdLivro().equals(codigoLivro)) {
				return livroAtual;
			}
		}
		return null;
	}
	public void consultarNotificacao(String codigoUsuario){
		Usuario usuario = this.buscarUsuarioPorCodigo(codigoUsuario);
		
		if (usuario == null) {
			Impressoes.usuarioNaoEncontrado();
			return;
		}
		
		Impressoes.consultaNotificacoes(usuario);
	}
	
	public void consultarUsuarioApto(String codigoUsuario) {
		Usuario usuario = this.buscarUsuarioPorCodigo(codigoUsuario);
		
		if (usuario == null) {
			Impressoes.usuarioNaoEncontrado();
			return;
		}
		
		Impressoes.consultaUsuario(usuario);
	}	
	public void consultarLivro(String codigoLivro) {
		Livro livro = this.buscarLivroPorCodigo(codigoLivro);
		
		if (livro == null) {
			Impressoes.livroNaoEncontrado();
			return;
		}
		
		Impressoes.consultaLivro(livro);
	
	}
	public void emprestarLivro(String codigoLivro, String codigoUsuario) {
		
        Usuario usuario = this.buscarUsuarioPorCodigo(codigoUsuario);
        Livro livro =  this.buscarLivroPorCodigo(codigoLivro);
        
		if (usuario == null) {
            Impressoes.usuarioNaoEncontrado();
            return;
        }

        if (livro == null) {
            Impressoes.livroNaoEncontrado();
            return;
        }
        IVerificadorEmprestimo verificador = usuario.getVerificador();
        if (verificador.verificarPossibilidadeEmprestimo(livro, usuario)) {
        	
			for (Exemplar exemplarAtual : livro.getExemplares()) {
				if (exemplarAtual.isDisponivel()) {
					exemplarAtual.setDisponivel(false);
					Emprestimo emprestimo = Fabrica.criarEmprestimo(exemplarAtual, usuario);
					exemplarAtual.setEmprestimoAtual(emprestimo);
					usuario.getEmprestimosAtuais().add(emprestimo);
				
					for (Reserva reservaAtual : livro.getReservasAtuais()) {
						if (reservaAtual.getUsuario().getCodID().equals(usuario.getCodID())) {
							livro.getReservasAtuais().remove(reservaAtual);
							break;
						}
					}
					
					for (Reserva reservaAtual : usuario.getReservaAtuais()) {
						if (reservaAtual.getLivro().getIdLivro().equals(codigoLivro)) {
							usuario.getReservaPassados().add(reservaAtual);
							usuario.getReservaAtuais().remove(reservaAtual);
							break;
						}
					}
					
					Impressoes.sucessoEmprestimo(usuario, livro);
					break;
				}
			}
		}
				

	}
	public void devolverLivro(String codigoUsuario, String codigoLivro) {
		Usuario usuario = this.buscarUsuarioPorCodigo(codigoUsuario);
        Livro livro =  this.buscarLivroPorCodigo(codigoLivro);
        
		if (usuario == null) {
            Impressoes.usuarioNaoEncontrado();
            return;
        }

        if (livro == null) {
            Impressoes.livroNaoEncontrado();
            return;
        }

		for (Emprestimo emprestimoAtual : usuario.getEmprestimosAtuais()) {
			if (emprestimoAtual.getExemplar().getLivro().getIdLivro().equals(codigoLivro)) {
				for (Exemplar exemplarAtual : livro.getExemplares()) {
					if (exemplarAtual.getCodigo().equals(emprestimoAtual.getExemplar().getCodigo())) {
						exemplarAtual.setDisponivel(true);
						exemplarAtual.setEmprestimoAtual(null);
						break;
					}
				}
				
				usuario.getEmprestimosPassados().add(emprestimoAtual);
				usuario.getEmprestimosAtuais().remove(emprestimoAtual);
				Impressoes.sucessoDevolucao(usuario, livro);
				return;
			}
		}
		
		Impressoes.naoPossuilivroEmprestimo(usuario, livro);
	}
	public void reservarLivro( String codigoUsuario, String codigoLivro) {
		Usuario usuario = this.buscarUsuarioPorCodigo(codigoUsuario);
        Livro livro =  this.buscarLivroPorCodigo(codigoLivro);
        
		if (usuario == null) {
            Impressoes.usuarioNaoEncontrado();
            return;
        }

        if (livro == null) {
            Impressoes.livroNaoEncontrado();
            return;
        }
		if (usuario.getReservaAtuais().size() <= 2) {
			Reserva reserva = Fabrica.criarReserva(livro, usuario);
			livro.getReservasAtuais().add(reserva);
			usuario.getReservaAtuais().add(reserva);
			
			if (livro.getReservasAtuais().size() >= 2) {
				livro.notificarObservadores();
			}
			
			Impressoes.sucessoReserva(usuario, livro);
		} else {
			Impressoes.limiteReserva(usuario, livro);
		}
	}
	public void registrarObservador(String codigoUsuario,String codigoLivro) {
		Usuario usuario = this.buscarUsuarioPorCodigo(codigoUsuario);
        Livro livro =  this.buscarLivroPorCodigo(codigoLivro);
          
		if (usuario == null) {
            Impressoes.usuarioNaoEncontrado();
            return;
        }

        if (livro == null) {
            Impressoes.livroNaoEncontrado();
            return;
        }
        livro.registraObservador((IObservador) usuario);  
		Impressoes.sucessoRegistroObservador(usuario, livro);
		return;
	}
    public boolean isDisponivel() {
        for (Exemplar exemplar : exemplar) {    
            if (exemplar.isDisponivel()) {
                return true;
            }
        }
        return false;
    }

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

}
