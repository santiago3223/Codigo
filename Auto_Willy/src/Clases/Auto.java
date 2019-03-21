package Clases;

public class Auto {
	String modelo = "";
	String marca = "";
	int anio;
	double velocidad_actual;
	double velocidad_maxima;
	boolean nitro = false;
	
	public String getModelo() {
		return modelo;			
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;			//"this" quiere decir, este objeto  
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getVelocidad_actual() {
		return velocidad_actual;
	}

	public void setVelocidad_actual(double velocidad_actual) {
		this.velocidad_actual = velocidad_actual;
	}

	public double getVelocidad_maxima() {
		return velocidad_maxima;
	}

	public void setVelocidad_maxima(double velocidad_maxima) {
		this.velocidad_maxima = velocidad_maxima;
	}

	public boolean isNitro() {
		return nitro;
	}

	public void setNitro(boolean nitro) {
		this.nitro = nitro;
	}
	


		
}
