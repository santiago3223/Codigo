import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Farmacia {
	private static String Nombre;
	private static String Direccion;
	static List<Cliente> Clientes;
	static List<Producto> Productos;
	List<Venta> Ventas;
	
	
	public List<Cliente> getClientes() {
		return Clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		Clientes = clientes;
	}
	public List<Producto> getProductos() {
		return Productos;
	}
	public void setProductos(List<Producto> productos) {
		Productos = productos;
	}
	public List<Venta> getVentas() {
		return Ventas;
	}
	public void setVentas(List<Venta> ventas) {
		Ventas = ventas;
	}


	static public String getNombre() {
		return Nombre;
	}
	static public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	public static void main(String[] args) {
		Productos = new ArrayList<Producto>();
		Clientes = new ArrayList<Cliente>();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("BIENVENIDO A MI FARMACIA");
		System.out.println("Ingrese Nombre de Farmacia: ");
		setNombre(scan.next());
		System.out.println("el Nombre ahora es: "+getNombre());
		
		//contructor de cliente por defecto
		Cliente clienteVenta = new Cliente();
		
		System.out.println("======= INICIO DE VENTA ==========");
		System.out.println("Ingrese Nombre de cliente: ");
		clienteVenta.setNombre(scan.next());
		
		//Agregar a la farmacia un cliente a su lista con ADD
		Clientes.add(clienteVenta);
		
		//Un constructor por parametro
		Producto produc1 = new Producto("00002","Amoxicilina", 500, 0.20);
		//agregamos a la lista de productos de la farmacia.
		Productos.add(produc1);
		
		Producto produc2 = new Producto("00003","Ibuprofeno", 500, 0.80);
		Productos.add(produc2);
		
		Producto produc3 = new Producto("00003","Panadol", 100, 0.90);
		Productos.add(produc3);
		
		int i=0;
		//recorrer la lista 
		for(Producto productoit : Productos) {
			
			//println = salto de linea
			System.out.println("["+i+"] "+productoit.getNombre());
			i++;
			
		}
		System.out.println("Seleccione un producto: ");
		//Pos del producto seleccionado
		int posProducto =scan.nextInt();
		
		//Creamos el Obj Venta
		
		Venta venta1 = new Venta();
		venta1.setFecha( new Date());
		
		
		venta1.getProductoSeleccionado().add(Productos.get(posProducto));
		
		System.out.println("==== Compra Realizada ===");
		System.out.println("El día: "+venta1.getFecha());
		for(Producto productoComprado : venta1.getProductoSeleccionado())
		{
			System.out.println("Producto: "+productoComprado.getNombre() + " - S/."+ productoComprado.getPrecio());
		}
		
		
		
		
		

	}

}
