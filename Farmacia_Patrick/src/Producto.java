
public class Producto {
	

	private String codigo;
	private  String nombre;
	private  int stock;
	private double precio;
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	public Producto(String codigo, String nombre, int stock, double precio) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
		
	}

}
