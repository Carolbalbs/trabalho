package trabalho;


public interface ISubject {
	public void notificarAlteracao();
	public void registrarObserver(IObservador observer);
	public void removerObserver(IObservador observer);
}
