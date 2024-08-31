package trabalho;

import java.util.ArrayList;
import java.util.List;

public class LivroNotificao extends Livro implements ISubject{



	public LivroNotificao(String idLivro, String titulo, String editora, List<String> autores, int edicao,
			int anoPublicacao, ArrayList<Exemplar> exemplares, ArrayList<IObservador> observadores,
			ArrayList<Reserva> reservasAtuais) {
		super(idLivro, titulo, editora, autores, edicao, anoPublicacao, exemplares, observadores, reservasAtuais);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notificarAlteracao() {
		
		for(IObservador observador: observadores){
			observador.atualizarValores();
		}
	}

	@Override
	public void registrarObserver(IObservador observer) {
		observadores.add(observer);
		
	}

	@Override
	public void removerObserver(IObservador observer) {
		observadores.remove(observer);
		
	} 

}
