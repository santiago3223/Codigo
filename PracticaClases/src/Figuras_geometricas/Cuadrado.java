package Figuras_geometricas;

public class Cuadrado extends Figura_Padre{
	
	public Cuadrado(double t) {
		t_lado = t;
	}

	public double ObtenerPerimetro() {
		return t_lado*4;
	}

	public double ObtenerArea() {
		return t_lado*t_lado;
	}

	public void Imprimir() {
		System.out.println("Soy un cuadrado y mi lado mide: "+ t_lado);
		super.Imprimir();
	}
}
