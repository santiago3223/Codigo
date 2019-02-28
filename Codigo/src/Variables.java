public class Variables {

public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
El valor de cada variable.
La suma de N + A_z
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
		int N = 5;
		double A = 4.56;
		char C = 'a';
		String cadena  = "asd";
		System.out.println("Variable N = " + N);
		System.out.println("Variable A = " + A);
		System.out.println("Variable C = " + (int)C);
		System.out.println("5 + 4.56 = " + (N+A));
		System.out.println("4.56 - 5 = " + (A-N));
		System.out.println("Valor numérico del carácter a = " + (int) C);	
		//System.out.println("Valor numérico del carácter a = " + (int) cadena);
		
		char c1 ='a';
		int e1 = c1;
		boolean b1 = false;
		String cadena1 = String.valueOf(e1);
		double d1 = e1;
		System.out.println(cadena1);
		
		int[] arreglo_enteros = {1,2,3,4,5};
		int[] arreglo_enteros2 = new int[5];
		
		
		System.out.println(arreglo_enteros[0]);
		System.out.println(arreglo_enteros2[0]);		
		
		char[] arreglo_caracteres = {'a','e','i','o','u'};
		String cadena_arreglo = String.valueOf(arreglo_caracteres);
		System.out.println(cadena_arreglo);
		
}

}