package Personas;

public class Persona {
	String nombre;
	String apellido;
	String dni;
	String telefono;
	String direccion;
	String fecha_nacimiento;
	
	void RegistrarAsistencia() {
		System.out.println("Se registro asistencia de: " + nombre);
	}
	
	public Persona(String nombre, String apellido, String dni, String telefono, String direccion,
			String fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public void Imprimir() {
		System.out.println("Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", fecha_nacimiento=" + fecha_nacimiento + "]"); 
	}


}
