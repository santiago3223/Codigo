
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char nota = Entrada.caracter();
		nota = Character.toUpperCase(nota); // funcion que convierte a mayuscula
		System.out.println(nota);	
		
		switch (nota) {//va la variable que vamos a comprarar
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
			System.out.println("Pesimo");	
			break;
		case 'F':
			System.out.println("Repite de año");	
			break;
		default:
			System.out.println("Nota invalida");
			break;
		}
		
	}

}
