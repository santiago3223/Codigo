import Figuras_Geometricas.Cuadrado;
import Figuras_Geometricas.Figura_Padre;
import Figuras_Geometricas.Triangulo;

public class MainFG {

	public static void  main (String[] args) {
		Triangulo t = new Triangulo(5);
		//t.Imprimir();
		
		Cuadrado c = new Cuadrado(5);
		//c.Imprimir();
		
		Figura_Padre[] p = {t, c};
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].CalcularPerimetro);
		}
		
	}
	
	

}
