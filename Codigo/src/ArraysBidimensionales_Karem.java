import java.util.ArrayList;
import java.util.List;

public class ArraysBidimensionales_Karem {

	public static void main(String[] args) {
		
//		int [][] LetrasMayusMinus = new int [2][5]; // reserva espacio en memoria para nuestros elementios
//		LetrasMayusMinus[0][0]='a';
//		System.out.println((char)LetrasMayusMinus[0][0]);
		
		//Ejercicio1();
		//Ejercicio25(1);
		//Ejercicio2(5,2);
		
	List<String> lista=new ArrayList<String>();
	List<Integer> lista2=new ArrayList<Integer>();
	lista2.add(2);
	lista2.add(3);
	
	lista.add("karem");
	lista.add("peralta");
	System.out.println(lista.get(0) + "primer ");
	System.out.println(lista.contains("karem"));
	
//	lista.set(1, "Venegas");
//	for(String elemento:lista)
//	{
//		System.out.println(elemento);
//	}
	
	System.out.println(lista.toString());
	
	for(int elemento : lista2)
	{
		System.out.println(elemento);
	}
		
		
	}
	
//	1. Crear una matriz de 3 filas por 4 columnas 
//	con elementos de tipo int, ingresar sus posiciones y luego imprimirlas. 
	public static void Ejercicio1()
	{
		int [][] ArrayBiDimen=new int [3][4];
		
		
		//Poniendo Valores
		for (int i=0;i<ArrayBiDimen.length; i++) //filas
		{
			for(int j=0;j<ArrayBiDimen[0].length;j++)
			{
				System.out.print("Ingrese numero para posicion ["+i+"],["+j+"]");
				ArrayBiDimen[i][j] = Entrada.entero();
			}
	
		}
		
		//Imprimiento Valores
		
		for (int i=0;i<ArrayBiDimen.length;i++)
		{
			
			for (int j=0;j<ArrayBiDimen[0].length;j++)
			{
				System.out.print("Posicion ["+i+"],["+j+"] = " + ArrayBiDimen[i][j] + " ");
			}

			System.out.println("\n");
		}
	}
	
	public static void Ejercicio25(int fila)
	{
		int [][] ArrayBiDimen=new int [3][4];
		
		
		//Poniendo Valores
		for (int i=0;i<ArrayBiDimen.length; i++) //filas
		{
			for(int j=0;j<ArrayBiDimen[0].length;j++)
			{
				//System.out.print("Ingrese numero para posicion ["+i+"],["+j+"]");
				ArrayBiDimen[i][j] =  (int) (Math.random() * 1000) + 1;
			}
	
		}
		
		//Imprimiendo todos los valores
		
		for(int i=0;i<ArrayBiDimen.length;i++)
		{
			for(int j=0; j<ArrayBiDimen[0].length;j++)
			{
				System.out.print("Posicion ["+i+"],["+j+"] = " + ArrayBiDimen[i][j] + " ");
			}
			
			System.out.println("\n");
		}
		
		System.out.println("Valores de la fila");
		//Imprimiento Valores de dla fila indicada
		
			for (int j=0;j<ArrayBiDimen[0].length;j++)
			{
				System.out.print("Posicion ["+fila+"],["+j+"] = " + ArrayBiDimen[fila][j] + " ");
			}

			System.out.print("\n");
		
	}
	
	public static void Ejercicio2(int fila, int columna)
	{
		int[][] matriz= new int[fila][columna];
 		for (int i=0; i<fila;i++)
		{
			for (int j=0; j<columna; j++)
			{
				matriz[i][j]= (int) (Math.random() * 1000) + 1;
			}
		}
 		
	//Imprimiendo todos los valores
		
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0; j<matriz[fila-1].length;j++)
			{
				System.out.print("Posicion ["+i+"],["+j+"] = " + matriz[i][j] + " ");
			}
			
			System.out.println("");
		}
		
		
	
		
	}
}