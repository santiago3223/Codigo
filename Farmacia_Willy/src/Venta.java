import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
	String Codigo;
	Date Fecha;
	List<Producto> ProductoSeleccionado = new ArrayList<Producto>();
	
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public List<Producto> getProductoSeleccionado() {
		return ProductoSeleccionado;
	}
	public void setProductoSeleccionado(List<Producto> productoSeleccionado) {
		ProductoSeleccionado = productoSeleccionado;
	}


}
