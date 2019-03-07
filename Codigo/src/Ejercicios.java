
public class Ejercicios {
	public static void main(String[] args) {
		/*int numero = Entrada.entero();
	
		System.out.println(numero);
		
		if (numero< 10 && numero > 0) {
			System.out.println("Tiene 1 cifra");
		}else if (numero >=10 && numero <100) {
			System.out.println("Tiene 2 cifra");
		}else if (numero >=100 && numero <1000) {
			System.out.println("Tiene 3 cifra");
		}else {
			System.out.println("Tiene 4 cifra");
		}
		*/
		
//		int dado1 = Entrada.entero();
//		int dado2 = Entrada.entero();
//		int dado3 = Entrada.entero();
//		
//		if ( dado1 == 6 && dado2 == 6 && dado3 == 6) {
//			System.out.println("Excelente");
//		}else if((dado1 == 6 && dado2 == 6) ||(dado1 == 6 && dado3 == 6) || (dado2 == 6 && dado3 == 6)){
//			System.out.println("Muy bien");
//		}else if((dado1 == 6 ) ||(dado3 == 6) || (dado2 == 6 )){
//			System.out.println("Regular");
//		}else {
//			System.out.println("Pesimo");
//		}
		
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
			resultado += 31;
		default:
			break;
		}
		System.out.println(resultado);
	}
}
