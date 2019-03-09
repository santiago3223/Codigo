
public class Funciones_Willy {

	public static void main(String[] args) {
//		DecirNombre("Willy");
//		int numero_obtenido = ObtenerNumero();
//		System.out.println(numero_obtenido);
//		System.out.println(SumarNumeros(5,6));
//		DibujarFlecha(10);
//		DibujarCuadrado(10);
		DibujarRectangulo(3,6);
	}

		static void DibujarRectangulo(int alto, int ancho) {
			for(int i = 1; i <= alto; i++) {
				DibujarFila(ancho);
			}		
		}
	
	
	
	
	
	
		static void DibujarCuadrado(int n) {
			for(int i = 1; i <= n; i++) {
				DibujarFila(n);
			}		
		}
	
		static void DibujarFlecha (int n) {			
			for (int i = 1; i <= n; i++) {
				DibujarFila(i);
			}	
				for (int i = n-1; i >= 1; i--) {
					DibujarFila(i);					
				}			
		}
		
		static void DibujarFila(int n) {
			for (int e = 1; e <= n; e++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	
		

	
	
	static int ObtenerNumero() { //retorna entero
		return 15;
	}
	
	static void DecirNombre(String nombre) { //método que no retorna nada
		System.out.println("Hola, soy " + nombre);
	}
	
	static int SumarNumeros(int numero1, int numero2) { //retorna la suma de dos enteros
		int suma = numero1 + numero2;
		return suma;
	}
	
	static String ConcatenarPalabras (String palabra, String palabra2) {
		return palabra + palabra2;
	}

}
