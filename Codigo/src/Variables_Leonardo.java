
public class Variables_Leonardo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
El valor de cada variable.
La suma de N + A
La diferencia de A - N
El valor numérico correspondiente al carácter que contiene la variable C.
Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe mostrar por pantalla:

Variable N = 5
Variable A = 4.56
Variable C = a
5 + 4.56 = 9.559999999999999
4.56 - 5 = -0.4400000000000004
Valor numérico del carácter a = 97
 */
		int N3 = 5;
		double A = 4.56;
		char C = 'a';
		int D = (int)(C);
		System.out.println("Variable N = "+ N3);
		System.out.println("Variable A = "+ A);
		System.out.println("Variable C = "+ C);
		System.out.println("N + A ="+ (N3+A));
		System.out.println("N - A ="+ (N3-A));
		System.out.println("valor numerico de C ="+ D);	
		
		/*Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, 
		dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por pantalla:
		El valor de cada variable.
		La suma  X + Y
		La diferencia  X – Y
		El producto  X * Y
		El cociente  X / Y
		El resto  X % Y
		La suma  N + M
		La diferencia  N – M
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
		int X=2;
		int Y=4;
		double N=6.5;
		double M=9.3;
		System.out.println("La suma  X + Y "+ (X+Y));
		System.out.println("La diferencia  X – Y "+ (X-Y));
		System.out.println("El producto  X * Y "+ (X*Y));
		System.out.println("El cociente  X / Y "+ (X/Y));
		System.out.println("El resto  X % Y "+ (X%Y));
		System.out.println("La suma  N + M "+ (N+M));
		System.out.println("La diferencia  N – M "+ (N-M));
		System.out.println("El producto  N * M "+ (N*M));
		System.out.println("El cociente  N / M "+ (N/M));
		System.out.println("El resto  N % M "+ (N%M));
		System.out.println("La suma  X + N "+ (X+N));
		System.out.println("El cociente  Y / M  "+ (Y/M));
		System.out.println("El resto  Y % M "+ (Y%M));
		System.out.println("El doble de X "+ (2*X));
		System.out.println("El doble de Y "+ (2*Y));
		System.out.println("El doble de M "+ (2*M));
		System.out.println("El doble de N "+ (2*N));
		System.out.println("La suma de todas las variables "+ (X+Y+N+M));
		System.out.println("El producto de todas las variables "+ (X*Y*N*M));
	}

}
