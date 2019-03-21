package Figuras_Geometricas;

public class Pentagono {
	double tamanio_lado;
	
	public Pentagono (double t) {
		tamanio_lado = t;
	}
	
	double CalcularPerimetro() {
		return tamanio_lado*5;
	}
	
	double CalcularArea() {
	return (tamanio_lado * tamanio_lado);
	}
	
	public void Imprimir () {
		System.out.println("Soy un pentagono y mi lado mide: " + tamanio_lado);
		System.out.println("Mi perimetro mide: " + CalcularPerimetro());		
		System.out.println("Mi perimetro mide: " + CalcularArea());
		System.out.println("-----------------------------------------");
	}
	
	
	
	
//	int tamanio_lado;
//	
//	double CalcularArea (int tamanio_lado) {
//		return ((5 * (tamanio_lado * tamanio_lado) )/(4*(Math.tan((Math.PI)/5))));
//	}
//	
//	double CalcularPerimetro () {
//		return (tamanio_lado * cantidad_lado);
//	}

}
