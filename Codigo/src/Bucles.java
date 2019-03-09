
public class Bucles {
	public static void main(String[] args) {
		// Ejemplo 1 
//		int numero = 3;
//
//		while(numero >= 0) {//booleana
//			System.out.println(numero);
//			numero = numero-1;
//		}
		
		//System.out.println(numero);
//		System.out.println("---------------");
//		numero = 3;
//		do {
//			System.out.println(numero);
//			numero = numero-1;
//		}while(numero >= 0);
//		System.out.println(numero);
		
//		System.out.println("Ingrese usr:");
//		String usr = Entrada.cadena();
//		
//		
//		System.out.println("Ingrese pwd:");
//		String pwd = Entrada.cadena();
//		while(!(usr.equals("usuario") && pwd.equals("tecsup"))) {
//		//while(!usr.equals("usuario") || !pwd.equals("tecsup")) {
//			System.out.println("Ingrese usr:");
//			usr = Entrada.cadena();
//			System.out.println("Ingrese pwd:");
//			pwd = Entrada.cadena();
//		}
//		System.out.println("Bienvenido");
//		
		
//		int[] numeros = {10,20,30,40,50,60,70,80,90,100,110};
//		int indice = 0;
//		System.out.print("[");
//		while(indice < numeros.length) {
//			System.out.print(numeros[indice] + " ");
//			indice = indice + 1;
//		}
//		System.out.println("]");
		
		
//		int[] numeros = {10,20,30,40,50,60,70,80,90,100,110};
//		
//		for (int i = 0; i<numeros.length ; i = i + 1) {
//			System.out.println(numeros[i]);
//		}
		// c++ ====> c = c+1;
//		for(char c ='a'; c <= 'z'; c++) {
//			System.out.println(c);
//		}
		
		int num = Entrada.entero();
		int resultado = 1;
		for(int i = 1 ; i <= num; i=i+1) {
			resultado = resultado * i;
			System.out.println(i);
		}
		System.out.println("Resultado: " + resultado);
		
		
	}
}
