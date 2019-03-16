package Figuras_geometricas;

public class Triangulo extends Figura_Padre{
	
	public Triangulo(double t) {
		t_lado = t;
	}
	
	public double ObtenerPerimetro() {
		return t_lado*3;
	}
	
	public double ObtenerArea() {
		double altura = Math.sqrt(t_lado*t_lado - t_lado/2 * t_lado/2);
		return t_lado*altura/2;
	}
	
	public void Imprimir() {
		System.out.println("Soy un triangulo y mi lado mide: "+ t_lado);
		super.Imprimir();
	}
	
}
