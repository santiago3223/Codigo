public class Variables {

public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuaci�n muestra por pantalla:
El valor de cada variable.
La suma de N + A_z
La diferencia de A - N
El valor num�rico correspondiente al car�cter que contiene la variable C.
Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor �a�, se debe mostrar por pantalla:

Variable N = 5
Variable A = 4.56
Variable C = a
5 + 4.56 = 9.559999999999999
4.56 - 5 = -0.4400000000000004
Valor num�rico del car�cter a = 97
 */
		
		int N = 5;
		double A = 4.56;
		char C = 'a';
		String cadena  = "asd";
		System.out.println("Variable N = " + N);
		System.out.println("Variable A = " + A);
		System.out.println("Variable C = " + (int)C);
		System.out.println("5 + 4.56 = " + (N+A));
		System.out.println("4.56 - 5 = " + (A-N));
		System.out.println("Valor num�rico del car�cter a = " + (int) C);	
		//System.out.println("Valor num�rico del car�cter a = " + (int) cadena);
		
		
		//Pasar de un dato a otro  "Castear"
		char c1 ='a'; 
		int e1 = c1; // char a int
		boolean b1 = false;
		String cadena1 = String.valueOf(e1); //bool a string
		double d1 = e1; // int a double 
		System.out.println(cadena1);
		
		
		// arreglos: Conjuntos de datos
		int[] arreglo_enteros = {1,2,3,4,5}; // crea un arreglo con numeros del 1 al 5
		int[] arreglo_enteros2 = new int[5]; // crea un arreglo vacio, con 0 en todas las posciciones
		
		
		System.out.println(arreglo_enteros[0]);
		System.out.println(arreglo_enteros2[0]);		
		
		
		char[] arreglo_caracteres = {'a','e','i','o','u'}; //arreglo de caracteres
		String cadena_arreglo = String.valueOf(arreglo_caracteres); // se puede convertir un arreglo de caracteres a un String 
		System.out.println(cadena_arreglo);
		
		/* Ejercicio 2: 
		 * Cree variables con el tipo de datos correcto para almacenar la siguiente informaci�n:
		 * precio
		 * nombre_profesor
		 * aula
		 * esMayorDeEdad
		 * diametro
		 * peso
		 * edad
		 * dni
		 * puntajeMayor
		 * puntajeJugadores
		 */
		//int precio;
		double precio;
		String nombre_profesor;
		String aula = "A311";
		int esMayorDeEdad = 0; // 0 significa que es menor de edad; 1 significa que es mayor de edad
		boolean MayorDeEdad = false;
		double diametro_metros;
		double peso_en_kilos = 30;
		double edad_anios = 1.5;
		String dni;
		int puntajeMayor;
		double puntajeJugadores;
		
		
		/* Ejercicio 3:
		 * Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. A continuaci�n muestra por pantalla:
			El valor de cada variable.
			La suma  X + Y
			La diferencia  X � Y
			El producto  X * Y
			El cociente  X / Y
			El resto  X % Y
			La suma  N + M
			La diferencia  N � M
			El producto  N * M
			El cociente  N / M
			El resto  N % M
			La suma X + N
			El cociente Y / M
			El resto Y % M
			El doble de cada variable
			La suma de todas las variables
			El producto de todas las variables
		 */
		
		int X = 5;
		int Y = 10;
		double NN = 15;
		double M = 13;
		
		System.out.println("X: " + X);
		System.out.println("Y: " + Y);
		System.out.println("NN: " + NN);
		System.out.println("M: " + M);
		
		System.out.println((double)X/Y);
		
		/* Ejercicio 4:
		 * Programa java que declare cuatro variables enteras A, B, C y D y as�gnale un valor a cada una. A continuaci�n realiza las instrucciones necesarias para que:
			B tome el valor de C
			C tome el valor de A
			A tome el valor de D
			D tome el valor de B
		 */
		
		/* Ejercicio 5:
		 * Dado el radio R de un circulo, calcular su area. 
		 */
		double radio = Entrada.real();
		System.out.println(radio);
		
		
}

}