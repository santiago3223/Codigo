
public class funciones {
	public static void main(String[] args) {

		DibujarRombo(15);
	}
	
	static void DibujarFlecha(int n) {
		for(int i = 1; i<= n; i++) {
			DibujarFila(i);
		}
		for(int i = n-1; i>=1; i--) {
			DibujarFila(i);
		}
	}
	
	static void DibujarRombo(int n) {
		for(int i = 1; i<= n; i=i+2) {
			dibujarLineaRombo(i, n);
		}
		for(int i = n-2; i>=0; i=i-2) {
			dibujarLineaRombo(i, n);
		}
	}
	
	static void DibujarCuadrado(int n) {
		for(int i = 1; i<=n;i++) {
			DibujarFila(n);
		}
	}
	
	static void DibujarFila(int n ) {
		DibujarAsteriscos(n);
		System.out.println();
	}
	
	static void DibujarAsteriscos (int n ) {
		for(int e = 1; e<=n;e++) {
			System.out.print("* ");
		}
	}
	
	static void DibujarEspaciosEnBlanco(int n) {
		for(int e = 1; e<=n;e++) {
			System.out.print(" ");
		}
	}
	
	static void dibujarLineaRombo(int linea, int n) {
		DibujarEspaciosEnBlanco((n-linea));
		DibujarAsteriscos(linea);
		System.out.println();
	}
	
	
	
	
	static String ObtenerNombreCompleto(String nombre, String apellido) {
		return nombre + " " + apellido;
	}
	
	static double Factorial(int n) {
		double f = 1;
		for (int i = 1; i<=n; i++) {
			f = f*i;
		}
		return f;
	}
	
	static int ObtenerNumero() { // Retorna un entero
		return 15;
	}
	
	static void DecirNombre(String nombre) { // Metodo que no retorna nada
		System.out.println("Hola, soy " + nombre);
	}
	
	static int SumarNumeros(int numero1, int numero2) { //retorna la suma de dos enteros
		int suma = numero1+numero2;
		return suma;
	}
	
	static String ConcatenarPalabras ( String palabra, String palabra2) {
		return palabra + palabra2;
	}
	
	
	
	
}
