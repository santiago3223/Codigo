package Lista;

public class Nodo {
	Nodo anterior;
	Nodo siguiente;
	String valor;
	
	public Nodo (Nodo anterior, Nodo siguiente, String valor) {
		this.anterior = anterior;
		this.siguiente = siguiente;
		this.valor = valor;
	}
	
	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	
}
