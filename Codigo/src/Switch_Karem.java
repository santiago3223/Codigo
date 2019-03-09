
public class Switch_Karem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char nota = Entrada.caracter();
//		nota = Character.toUpperCase(nota); // funcion que convierte a mayuscula
//		System.out.println(nota);	
//
//		switch (nota) {//va la variable que vamos a comprarar
//		case 'A':
//			System.out.println("Excelente");	
//			break;
//		case 'B':
//			System.out.println("Bueno");	
//			break;
//		case 'C':
//			System.out.println("Regular");	
//			break;
//		case 'D':
//			System.out.println("Malo");	
//			break;
//		case 'E':
//			System.out.println("Pesimo");	
//			break;
//		case 'F':
//			System.out.println("Repite de año");	
//			break;
//		default:
//			System.out.println("Nota invalida");
//			break;
//		}
//	}
//	
		int numero = Entrada.entero();
		int u = numero %10;
		int d = numero %100/10;
		int c = numero %1000/100;
		int m = numero %10000/1000;
		int total = 0;
		if (numero >= 1000) {
			 total = u*1000+d*100+c*10+m;
			 System.out.println(total);
		} else {
			if (numero >= 100) {
				 total = u*100+d*10+c;
				 System.out.println(total);
			}else {
				if (numero >= 10) {
				 total = u*10+d;
				 System.out.println(total);
				}else {
					total = u;
					 System.out.println(total);
				}
			}
		}
		

		
		if(total == numero) {
			System.out.println("si es");
		}else {
			System.out.println("no es");
		}
	}
}
