package Figuras_Geometricas;

public class Figura_Padre {
	double tamanio_lado;

	public abstract double CalcularPerimetro();

	public abstract double CalcularArea();

	public void Imprimir() {
		System.out.println("mi perimetro mide : "+ CalcularPerimetro());
		System.out.println("mi area mide : "+ CalcularArea());
		System.out.println("------------------------------");
	}

}
