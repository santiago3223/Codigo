package Clases;

public class Auto {
	String modelo = "";
	String marca = "";
	int anio;
	double velocidad_actual;
	double velocidad_maxima;
	boolean nitro = false;
	
	public void SetModelo (String modelo) {
		this.modelo = modelo;			//este objeto quiere decir this
	}
	
	public String GetModelo() {
		return modelo;			//este objeto quiere decir this
	}

		
}
