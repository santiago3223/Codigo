package Clases;

public class Auto {
	double kilometraje = 100;
	String modelo = "";
	String marca = "";
	int anio ;
	double velocidad_actual;
	double velocidad_maxima;
	boolean nitro = false;
	
	public static void informacion() {
		System.out.println("Esta clase guarda la informacion de los autos");
	}
	
	public Auto() {
		System.out.println("Constructor Por defecto");
	}
	
	public Auto(String ma, String mo, int a, double v_m) {
		System.out.println("Constructor con parametros");
		velocidad_actual = 0;
		marca = ma;
		modelo = mo;
		anio = a;
		velocidad_maxima = v_m;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
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
	
	public boolean isNitro() {
		return nitro;
	}
	public void setNitro(boolean nitro) {
		this.nitro = nitro;
	}

	public double getVelocidad_maxima() {
		return velocidad_maxima;
	}

	public void setVelocidad_maxima(double velocidad_maxima) {
		this.velocidad_maxima = velocidad_maxima;
	}
	

	public void ImprimirPropiedades() {
		System.out.println( "Auto [modelo=" + modelo + ", marca=" + marca + ", anio=" + anio + ", velocidad_actual="
				+ velocidad_actual + ", velocidad_maxima=" + velocidad_maxima + ", nitro=" + nitro + "]"
		);
	}
	
	
}
