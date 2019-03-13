
public class Funciones_Willy {

	public static void main(String[] args) {
//		DecirNombre("Willy");
//		int numero_obtenido = ObtenerNumero();
//		System.out.println(numero_obtenido);
//		System.out.println(SumarNumeros(5,6));
//		DibujarFlecha(10);
//		DibujarCuadrado(10);
//		DibujarRectangulo(3,6);
//		System.out.println(encontrar_menor(4, 2, 1)); //Ejercicio 1
		System.out.println(cuenta_vocales("AEIO"));
		
			
	}
	
		// Ejercicio 1. Escribir una funcion en java que encuentre 
		//el menor entre tres números.
		public static int encontrar_menor (int a, int b, int c)
		{
			int menor;
			if (a < b)
			{
				menor = a;
			} else {
				menor = b;
			}
			if (menor > c) 
			{
				menor = c;				
			}
			return menor;
		}
		
		// Ejercicio 4. Escribir una funcion en java que cuente 
		// las vocales en un string
		public static int cuenta_vocales (String palabra) {
			int contador = 0;
			for (int i = 0; i < palabra.length(); i++)
			{
				if (	palabra.charAt(i) == 'a' || //Devuelve el carácter situado en la posición 'index' pasada por parámetro. 
						palabra.charAt(i) == 'e' ||
						palabra.charAt(i) == 'i' ||
						palabra.charAt(i) == 'o' ||
						palabra.charAt(i) == 'u')
				{
					contador = contador + 1;
				} else System.out.println(palabra.charAt(i) + " No es vocal minuscula");
			}
			
			return contador;
			
			
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
