package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	 
	 private String nome;
	 private String codID;
	 private boolean devedor;
	 private int tempoDeEmprestimo;
	 private int limiteEmprestimo;
	 private IVerificadorEmprestimo verificador;
	 private List<Emprestimo> emprestimosAtuais;
	 private List<Emprestimo>emprestimosPassados;
	 private List<Reserva> reservaAtuais;
	 private List<Reserva>reservaPassados;
	
	 
	 
	public Usuario(String codID,String nome , int tempoDeEmprestimo, boolean devedor, int limiteEmprestimo) {
		super();
		this.codID = codID;
		this.nome = nome;
		this.tempoDeEmprestimo = tempoDeEmprestimo;
		this.devedor = devedor;
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public Usuario(String nome, String codID, int tempoDeEmprestimo, IVerificadorEmprestimo verificador) {
		super();
		this.nome = nome;
		this.codID = codID;
		this.setDevedor(false);
		this.tempoDeEmprestimo = tempoDeEmprestimo;
		this.limiteEmprestimo = 0;
		this.verificador = verificador;
		this.emprestimosAtuais = new ArrayList<Emprestimo>();
		this.emprestimosPassados =  new ArrayList<Emprestimo>();
		this.reservaAtuais = new ArrayList<Reserva>();
		this.reservaPassados = new ArrayList<Reserva>();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodID() {
		return codID;
	}
	public void setCodID(String codID) {
		this.codID = codID;
	}
	public int getTempoDeEmprestimo() {
		return tempoDeEmprestimo;
	}
	public void setTempoDeEmprestimo(int tempoDeEmprestimo) {
		this.tempoDeEmprestimo = tempoDeEmprestimo;
	}
	public boolean isDevedor() {
		return devedor;
	}
	public void setDevedor(boolean devedor) {
		this.devedor = devedor;
	}
	public int getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	public void setLimiteEmprestimo(int limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}


	 public IVerificadorEmprestimo getVerificador() {
		return verificador;
	}
	public void setVerificador(IVerificadorEmprestimo verificador) {
		this.verificador = verificador;
	}
	public List<Emprestimo> getEmprestimosAtuais() {
		return emprestimosAtuais;
	}
	public void setEmprestimosAtuais(List<Emprestimo> emprestimosAtuais) {
		this.emprestimosAtuais = emprestimosAtuais;
	}
	public List<Emprestimo> getEmprestimosPassados() {
		return emprestimosPassados;
	}
	public void setEmprestimosPassados(List<Emprestimo> emprestimosPassados) {
		this.emprestimosPassados = emprestimosPassados;
	}
	public List<Reserva> getReservaAtuais() {
		return reservaAtuais;
	}
	public void setReservaAtuais(List<Reserva> reservaAtuais) {
		this.reservaAtuais = reservaAtuais;
	}
	public List<Reserva> getReservaPassados() {
		return reservaPassados;
	}
	public void setReservaPassados(List<Reserva> reservaPassados) {
		this.reservaPassados = reservaPassados;
	}
	
	 
	  
	}
