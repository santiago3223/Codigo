
public class Switch_Gohan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Ingrese la nota ");
//		
//		char nota = Entrada.caracter();
//		nota = Character.toUpperCase(nota);
//		
//		switch (nota) {
//		case 'A':
//			System.out.println("Ecelente nota");
//			break;
//		case 'B':
//			System.out.println("Buena nota");
//		case 'C':
//			System.out.println("Regular nota");
//			break;
//		case 'D':
//			System.out.println("Maso o menos nota");
//		case 'E':
//			System.out.println("pesimo nota");
//			break;
//		case 'F':
//			System.out.println("Repites nota");
//		default:
//			System.out.println("nota nota incorrecta ingresada");
//			break;
//		}
		
		
//		System.out.println("Ingrese el numero dentro del 0 - 9 ");
//		
//		char numero = Entrada.caracter();
//		numero = Character.toUpperCase(numero);
//		
//		switch (numero) {
//		case '1':
//			System.out.println("Uno");
//			break;
//		case '2':
//			System.out.println("dos");
//		case '3':
//			System.out.println("tres");
//			break;
//		case '4':
//			System.out.println("cuatro");
//		case '5':
//			System.out.println("cinco");
//			break;
//		case '6':
//			System.out.println("seis");
//		case '7':
//			System.out.println("siete");
//		case '8':
//			System.out.println("ocho");
//			break;
//		case '9':
//			System.out.println("nuevo");
//		default:
//			System.out.println("numero incorrecto");
//			break;
//		}
		
		//numero capicua
		System.out.println("ingrese un numero");
		int numero = Entrada.entero();
		int unidades = numero%10;
		int decenas = numero%100/10;
		int centenas = numero%1000/100;
		int millares = numero%10000/1000;
		
		int total;
		
		if (numero >=1000) {
			total = unidades*1000 + decenas*100 +centenas*10 + millares;
			System.out.println("es un numero capicua");
		}else {
			if (numero >=100) {
				total = unidades*1000 + decenas*100 +centenas*10 ;
				System.out.println("es un numero capicua");
			}else {
				if (numero >10) {
					total = unidades*1000 + decenas*100;
					System.out.println("es un numero capicua");
				}else {
					total = unidades;
				}
			}
		}
		
		if (total == numero) {
			System.out.println("es un numero capicua");
		}else {
			System.out.println("no es un numero capicua");
		}
		
	}

}
