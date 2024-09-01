package trabalho;

import java.util.ArrayList;

public class Livro {
    private String IDLivro;
    private String titulo;
    private String editora;
    private String autores;
    private int edicao;
    private int anoPublicacao;
	private ArrayList<Exemplar> exemplares;
    protected ArrayList<IObservador> observadores;
    private ArrayList<Reserva> reservasAtuais;
    
	public Livro(String idLivro, String titulo, String editora, String autores, int edicao, int anoPublicacao,
			ArrayList<Exemplar> exemplares, ArrayList<IObservador> observadores, ArrayList<Reserva> reservasAtuais) {
		super();
		this.IDLivro = idLivro;
		this.titulo = titulo;
		this.editora = editora;
		this.autores = autores;
		this.edicao = edicao;
		this.anoPublicacao = anoPublicacao;
		this.exemplares = exemplares;
		this.observadores = observadores;
		this.reservasAtuais = reservasAtuais;
	}
	public Livro(String idLivro, String titulo, String editora, String autores, int edicao,
			int anoPublicacao) {
		super();
		this.IDLivro = idLivro;
		this.titulo = titulo;
		this.editora = editora;
		this.autores = autores;
		this.edicao = edicao;
		this.anoPublicacao = anoPublicacao;
	}
	public String getIdLivro() {
		return IDLivro;
	}
	public void setIdLivro(String idLivro) {
		this.IDLivro = idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
     public ArrayList<Exemplar> getExemplares() {
		return exemplares;
	}
	public void setExemplares(ArrayList<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	public ArrayList<IObservador> getObservadores() {
		return observadores;
	}
	public void setObservadores(ArrayList<IObservador> observadores) {
		this.observadores = observadores;
	}
	public ArrayList<Reserva> getReservasAtuais() {
		return reservasAtuais;
	}
	public void setReservasAtuais(ArrayList<Reserva> reservasAtuais) {
		this.reservasAtuais = reservasAtuais;
	}
	public void registraObservador(ArrayList<IObservador> usuario) {
		usuario = getObservadores();	
	}
	
	public void registraObservador(IObservador observador) {
		observadores.add(observador);
		
	}

	public void removerObservador(IObservador observador) {
		observadores.remove(observador);
		
	}
	
	public void notificarObservadores() {
	    for (IObservador observador : observadores) {
	    	observador.atualizarValores();
	    } 
	}

}