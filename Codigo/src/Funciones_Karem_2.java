
public class Funciones_Karem_2 {

	public static void main(String[] args) {
        
//		System.out.println("Anchura del rectángulo:");
//		int anchura = Entrada.entero();
//		
//		System.out.println("Altura del rectángulo:");
//		int altura = Entrada.entero();
//		
//		System.out.println("Caracter:");
//		char caracter = Entrada.caracter();
//		
//		CrearRectangulo(anchura,altura,caracter);	
		
		System.out.println("Anchura de la flecha:");
		int anchura2 = Entrada.entero();
		
		System.out.println("Caracter:");
		char caracter2 = Entrada.caracter();
		CrearFlecha(anchura2,caracter2);
		
		int[] numeros= {1,2,3,4,5,6,7,8,9,10};
		
		
		
	}
	
	public void ImprimiendoNumeros(int[] numeros)
	{
		for(int i=0; i<numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
	}
	
	
	public static void CrearRectangulo(int ancho, int altura, char caracter)
	{
		for(int i=0; i<altura; i++)
		{
			for(int j=1; j<ancho; j++)
			{
				System.out.print(caracter + " ");
			}
			System.out.println(caracter);//primero imprime el caracter y luego salto de linea
		
		}
	}
	
	public static void CrearFlecha(int anchura,char caracter)
	{
		for(int i=0; i<anchura; i++)
		{
			
			for(int j=0; j<(i+1); j++)
			{
				System.out.print(caracter + " ");
			}
			System.out.println("");
		}
		
		for(int i=0; i<anchura-1; i++)
		{
			for(int j=1; j<(anchura-i); j++)
			{
					System.out.print(caracter + " ");
			}
			System.out.println("");
		}
	}
	
	public static void CrearTriangulo(int ancho,char caracter)
	{
		for()
		{
			
		}
	}
	
}
