
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
		
		System.out.println("Ingrese pwd:");
		String pwd = Entrada.cadena();
		System.out.println(pwd);
		
		while(!pwd.equals("tecsup")) {
			System.out.println("Ingrese pwd:");
			pwd = Entrada.cadena();
		}
		System.out.println("Bienvenido");
		
	}
}
