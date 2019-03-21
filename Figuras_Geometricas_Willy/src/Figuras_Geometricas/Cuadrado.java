package Figuras_Geometricas;

public class Cuadrado extends Figura_Padre{
	
	public Cuadrado (double t) {
		tamanio_lado = t;
	}
	
	public double CalcularPerimetro() {
		return tamanio_lado*4;
	}
	
	public double CalcularArea() {
		return (tamanio_lado * tamanio_lado);
	}
	
	public void Imprimir () {
		System.out.println("Soy un cuadrado y mi lado mide: " + tamanio_lado);
		System.out.println("-----------------------------------------");
	}
	
	
	
	
//	double CalcularArea (int tamanio_lado) {
//		return (tamanio_lado * tamanio_lado);
//	}
//	
//	double CalcularPerimetro () {
//		return (tamanio_lado * cantidad_lado);
//	}

}
