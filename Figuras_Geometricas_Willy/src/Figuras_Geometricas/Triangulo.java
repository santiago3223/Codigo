package Figuras_Geometricas;

public class Triangulo {
	double tamanio_lado;
	
	public Triangulo (double t) {
		tamanio_lado = t;
	}
	
	double CalcularPerimetro() {
		return tamanio_lado*3;
	}
	
	double CalcularArea() {
	return (((Math.sqrt(3)) * (tamanio_lado*tamanio_lado))/4);
	}
	
	public void Imprimir () {
		System.out.println("Soy un triangulo y mi lado mide: " + tamanio_lado);
		System.out.println("Mi perimetro mide: " + CalcularPerimetro());		
		System.out.println("Mi perimetro mide: " + CalcularArea());
		System.out.println("-----------------------------------------");
	}
	
	
}
