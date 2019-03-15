package Main;
import Clases.Auto;

public class Carrito_Principal {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		System.out.println(a1.GetModelo());
		a1.SetModelo("Yaris");
		System.out.println();
		
		Auto a2 = new Auto();
		Auto a3 = new Auto();
		a1.Encender();
		a2.Encender();
		a3.Encender();
		System.out.println(a1.Gas());
		System.out.println(a2.Gas());
		System.out.println(a3.Gas());
		
	}

}
