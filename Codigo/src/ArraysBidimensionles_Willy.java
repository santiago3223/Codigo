import java.util.ArrayList;
import java.util.List;

public class ArraysBidimensionles_Willy {

	private static final String EjercicioMatriz1 = null;

	public static void main(String[] args) {
//		EjercicioMatriz();
//		Ejercicio1();
		EjercicioMatriz1();
	}
	
	public static void EjercicioMatriz() {
		char [][] vocales = new char [3][3]; //reserva espacio en memoria para nuestros elementos
		vocales [0][0] = 'a'; // en la fila por la columna inserta 'a'
		vocales [0][1] = 'e';
		vocales [0][1] = 'i';
		vocales [1][0] = 'o';
		vocales [1][1] = 'u';
		vocales [1][2] = 'A';
		vocales [2][0] = 'E';
		vocales [2][1] = 'I';
		vocales [2][2] = 'O';
		System.out.println(vocales [2][1]);
	}
	
	public static void Ejercicio1( ) {
		int [][] vocales = new int [3][4]; 
		vocales [0][0] = 1; 
		vocales [0][1] = 2;
		vocales [0][2] = 3;
		vocales [0][3] = 4;
		vocales [1][0] = 5;
		vocales [1][1] = 6;
		vocales [1][2] = 7;
		vocales [1][3] = 8;
		vocales [2][0] = 9;
		vocales [2][1] = 10;
		vocales [2][2] = 11;
		vocales [2][3] = 12;
		int filas_total = vocales.length;
		for (int i = 0; i < filas_total; i++)
		{
			int columnas_total = vocales[i].length;
			for (int j = 0; j < columnas_total; j++)
			{
				System.out.print(vocales [i][j] + "| ");	
			}
			System.out.print("\n");	
		}
		
		
		
	}

	public static void EjercicioMatriz1( ) {
		
		char [][] vocales = new char [3][3];
		
		List<String> lista = new ArrayList<String>();
		lista.add("alaska en verano");
		lista.add("camana en invierno");
		
		for (String item : lista) {
			System.out.println(item);
			
		}
		System.out.println(lista.get(0));
		
	}
	
}
