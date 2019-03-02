
public class Variables_2ale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuaciï¿½n muestra por pantalla:
El valor de cada variable.
La suma de N + A_z
La diferencia de A - N
El valor numï¿½rico correspondiente al carï¿½cter que contiene la variable C.
Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ï¿½aï¿½, se debe mostrar por pantalla:

Variable N = 5
Variable A = 4.56
Variable C = a
5 + 4.56 = 9.559999999999999
4.56 - 5 = -0.4400000000000004
Valor numï¿½rico del carï¿½cter a = 97
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
		System.out.println("Valor numï¿½rico del carï¿½cter a = " + (int) C);	
		//System.out.println("Valor numï¿½rico del carï¿½cter a = " + (int) cadena);
		
		
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
		 * Cree variables con el tipo de datos correcto para almacenar la siguiente informaciï¿½n:
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
		double precio;
		String nombre_profesor;
		String aula;
		boolean esMayorDeEdad;
		double diametro;
		double peso;
		int edad;
		String dni;
		int puntajeMayor;
		int puntajeJugadores;
		/* Ejercicio 3:
		 * Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. A continuaciï¿½n muestra por pantalla:
			El valor de cada variable.
			La suma  X + Y
			La diferencia  X ï¿½ Y
			El producto  X * Y
			El cociente  X / Y
			El resto  X % Y
			La suma  N + M
			La diferencia  N ï¿½ M
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
		int x=21;
		int y=3;
		double n=21;
		double m=3;
		int suma=x+y;
		int diferencia=x-y;
		int producto=x*y;
		double cociente=(double)x/y;
		int resto=x%y;
		
		double suma1=n+m;
		double diferencia1=n-m;
		double producto1=n*m;
		double cociente1=n/m;
		double resto1=n%m;
		
		double suma12=x+n;
		double cociente12=y/m;
		double resto12=y%m;
		
		int doble=x*2;
		int doble2=y*2;
		double doble3=n*2;
		double doble4=m*2;
		
		double sumag=x+y+n+m;
		double productog=x*y*n*m;
				
		System.out.println("El valor de x = "+x+"\n"+"El valor de y = "+y+"\n"+"El valor de N = "+n+"\n"+"El valor de M = "+m+"\n");
        System.out.println("\n"+"La suma  X + Y="+suma+"\n"+"La diferencia  X - Y="+diferencia+"\n"+"El producto  X * Y="+producto+"\n"+"El cociente  X ÷ Y="+cociente+"\n"+"El resto  X % Y="+resto);
        System.out.println("\n"+"La suma  N + M="+suma1+"\n"+"La diferencia  N - M="+diferencia1+"\n"+"El producto  N * M="+producto1+"\n"+"El cociente  N ÷ M="+cociente1+"\n"+"El resto  N % M="+resto1);
        System.out.println("\n"+"La suma  X + M="+suma12+"\n"+"El cociente  Y ÷ M="+cociente12+"\n"+"El resto  Y % M="+resto12);
        System.out.println("\n"+"El doble de X="+doble+"\n"+"El doble de Y="+doble2+"\n"+"El doble de N="+doble3+"\n"+"El doble de M="+doble4);
        System.out.println("\n"+"X+Y+N+M = "+sumag);
        System.out.println("\n"+"X*Y*N*M = "+productog);
        
        /* Ejercicio 4:
		 * Programa java que declare cuatro variables enteras A, B, C y D y asï¿½gnale un valor a cada una. A continuaciï¿½n realiza las instrucciones necesarias para que:
			B tome el valor de C
			C tome el valor de A
			A tome el valor de D
			D tome el valor de B
		 */
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		b=c;
		c=a;
		a=d;
		d=b;
		System.out.println("\n"+a+b+c+d);
		
        
		/* Ejercicio 5:
		 * Dado el radio R de un circulo, calcular su area. 
		 */
		double radio = Entrada.real();
		System.out.println("Radio="+radio);
		double area=3.14159*Math.pow(radio,2);
		System.out.println("Area es="+area);
	}

}
