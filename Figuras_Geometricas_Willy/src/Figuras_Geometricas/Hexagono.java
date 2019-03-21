package Figuras_Geometricas;

public class Hexagono {
	int cantidad_lado;
	int tamanio_lado;
	
	double CalcularArea (int tamanio_lado) {
		return (((3 * (Math.sqrt(3)) * (tamanio_lado * tamanio_lado))) / 2);
	}
	
	double CalcularPerimetro () {
		return (tamanio_lado * cantidad_lado);
	}

}
