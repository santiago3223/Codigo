

public class Ejercicios_Willy {

	public static void main(String[] args) {
		
//		Ejercicio 1: Leer un número entero positivo y determinar 
//		si es un número de 1, 2,3 o 4 cifras.
		
//		int numero = Entrada.entero();
//		System.out.println(numero);
//		
//		if (numero < 10 && numero > 0) {
//			System.out.println("Tiene 1 cifra");
//		} else if (numero > 10 && numero < 100) {
//			System.out.println("Tiene 2 cifras");
//		} else if (numero > 100 && numero < 1000) {
//			System.out.println("Tiene 3 cifras");
//		} else {
//			System.out.println("Tiene 4 cifras");
//		}
		
//		Ejercicio 2: En un casino de juegos se desea mostrar los mensajes respectivos 
//		por el puntaje obtenido en el lanzamiento de tres dados de un cliente, de 
//		acuerdo a los siguientes resultados:
//			Si los tres dados son seis, mostrar el mensaje “Excelente”
//			Si dos dados se obtiene seis, mostrar el mensaje “Muy bien”
//			Si un dado se obtienen seis, mostrar el mensaje “Regular”
//			Si ningún dado se obtiene seis, mostrar el mensaje “Pésimo”

//		int dado1 = Entrada.entero();
//		int dado2 = Entrada.entero();
//		int dado3 = Entrada.entero();
//		
//		System.out.println("\n" + "Sus dados fueron:");
//		System.out.println(dado1);
//		System.out.println(dado2);
//		System.out.println(dado3);
//		
//		if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
//		System.out.println("Excelente");
//		} else if (dado1 == 6 && dado2 == 6 || dado1 == 6 && dado3 == 6 || dado2 == 6 && dado3 == 6) {
//			System.out.println("Muy bien");
//		} else if (dado1 == 6 || dado2 == 6 || dado3 == 6) {
//			System.out.println("Regular");
//		} else {
//			System.out.println("Pésimo"); 
//			
//		}
		
//		Ejercicio3: Hacer un programa que solicite al usuario que ingrese una fecha 
//		y calcule el día correspondiente del año. Ejemplo, si se ingresa 
//		la fecha 31 12 1998, el número que se visualizará será 365.
		
		
		int dia = Entrada.entero();
		int mes = Entrada.entero();
		int anio = Entrada.entero();
		
		int resultado = dia;

		switch (mes) {
		case 12:
			resultado+=30;
		case 11:
			resultado+=31;
		case 10:
			resultado+=30;
		case 9:
			resultado+=31;
		case 8:
			resultado+=31;
		case 7:
			resultado+=30;
		case 6:
			resultado+=31;
		case 5:
			resultado+=30;
		case 4:
			resultado+=31;
		case 3:
			if(anio%4 == 0 && anio%100!=0) {
				resultado+=29;
			}else {
				resultado+=28;
			}			
		case 2:
			resultado+=31;
		default:
			break;
			}
		System.out.println(resultado);
	}
}
