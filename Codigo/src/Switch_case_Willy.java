
public class Switch_case_Willy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		char nota = Entrada.caracter();

		switch (nota) {  //va la variable que vamos a comparar
		case 'A':
			System.out.println("Excelente");
			break;
		case 'B':
			System.out.println("Bueno");
			break;
		case 'C':
			System.out.println("Regular");
			break;
		case 'D':
			System.out.println("Malo");
			break;
		case 'E':
			System.out.println("Pésimo");
			break;
		case 'F':
			System.out.println("Repite el año");
			break;
		default:
			System.out.println("Nota Invalida");
			break;
		}
*/
		
		int numero = Entrada.entero();
		
		int u = numero % 10;
		int d = numero % 100/10;
		int c = numero % 1000/100;
		int m = numero % 10000/1000;
		int total = 0;
		
		if (numero > 1000 && numero > 9999) {
			total = u*1000 + d*100 + c*10 + m;
			System.out.println(total);
		} else {
			if
		}
		
		if (numero > 100 && numero > 999) {
			total = u*100 + d*10 + c;
			System.out.println(total);
		}

		if (numero > 10 && numero > 99) {
			total = u*10 + d;
			System.out.println(total);
		}
		
		
		
		if (total == numero) {
			System.out.println("si es");
		}else {
			System.out.println("no es");
		}
		
	}

}
