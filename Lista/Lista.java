package Lista;

public class Lista {
	public Nodo inicio;
	public Nodo fin;

	public void AgregarNodoInicio(String s ) {
		if (inicio == null) {
			Nodo nuevo = new Nodo(null, null, s);
			inicio = nuevo;
			fin = nuevo;
		}else {
			Nodo nuevo = new Nodo(null, inicio, s);
			inicio.setAnterior(nuevo);
			inicio = nuevo;
		}
	}

	public void AgregarNodoFin(String s ) {
		if (fin == null) {
			Nodo nuevo = new Nodo(null, null, s);
			inicio = nuevo;
			fin = nuevo;
		}else {
			Nodo nuevo = new Nodo(fin, null, s);
			fin.setSiguiente(nuevo);
			fin = nuevo;
		}
	}

	public void AgregarNodo(String s , int posicion ) {

	}

	public void EliminarNodoInicio() {

		if(inicio== fin) {
			inicio= null;
			fin = null;
		}else {
			Nodo segundo= inicio.getSiguiente();
			segundo.setAnterior(null);
			inicio = segundo;
		}


	}

	public void EliminarNodoFin() {

	}

	public void EliminarNodo(int posicion ) {

	}

	public void Imprimir() {
		Nodo tmp = inicio;
		while(tmp != null) {
			System.out.println(tmp.getValor());
			tmp = tmp.getSiguiente();
		}
	}

}
