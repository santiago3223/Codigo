package MiTiendita;

public class Auto {

	String modelo="";
	String marca="";
	double velocidad;
	String color="";
	int anio;
	double velocidad_maxima;
	boolean nitro=false;
	double kilometraje;
	
	public Auto()
	{
		System.out.println("contruye por defecto");
	}
	
	//Encapsulamiento : Distintos niveles de seguridad a un objeto
	//public --> LLamado por otras clases y por la misma.
	//
	
	public Auto(String mo, String ma, double velocidad)
	{
		modelo=mo;
		marca=ma;
		velocidad_maxima=velocidad;
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
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
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
	
	

	
//	void CargarCaracteristicas(String var_modelo, String var_marca)
//	{
//		modelo=var_modelo;
//		marca=var_marca;
//		System.out.println("El modelo del Auto es: "+modelo);
//		System.out.println("Su marca es: "+marca);
//	}
//	
//	void Mover()
//	{
//		System.out.println("El auto se esta Moviendo a "+ velocidad+" m/s");
//		velocidad=velocidad-10;
//	}
//	
//	void Prender()
//	{
//		System.out.println("El auto se encuentra prendido"); 
//		velocidad=100;
//		System.out.println("La velocidad del auto es: "+velocidad+" m/s");
//	}
//	
//	void Detenerse()
//	{
//		System.out.println("El auto esta deteniendose");
//		velocidad=0;
//		System.out.println("La velocidad del auto es: "+velocidad+" m/s");
//	}

}
