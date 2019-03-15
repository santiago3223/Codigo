package Clases;

public class ConversorDeUnidades {
	int relacion_km_millas = 10;
	
	public double KilometrosAMillas(double kilometros) {
		return kilometros *relacion_km_millas;
	}
}
