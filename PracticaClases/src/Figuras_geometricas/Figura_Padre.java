package Figuras_geometricas;

public abstract class Figura_Padre {
	double t_lado;

	public abstract double ObtenerPerimetro();

	public abstract double ObtenerArea();

	public void Imprimir() {
		System.out.println("mi perimetro mide : "+ ObtenerPerimetro());
		System.out.println("mi area mide : "+ ObtenerArea());
		System.out.println("------------------------------");
	}
}
