
public class Funciones_Karem {
	public static void main(String[] args) // Esta es la primera funcion que se ejecuta Main
	{ 
		Sumar("Karem");//Por convencion no pasar mas de 3 argumentos en todo caso usar una clase
		
		int numero= ObtenerNumero();
		System.out.println("Suma:"+ SumarNumeros(5,6));
		System.out.println("concatena: " + ConcatenarPalabras("SERA","FUN"));
		System.out.println(Factorial(5));
		//DibujarCuadrado(2);
		//DibujarFlecha(5);
		
	
		
	}
	//sstatic quiere decir que yo puedo llamar a la funcion sin crear el objeto
	public static void Sumar(String nombre)//Convencion es que siempre empiece en mayusculas las Funciones
	{
		
		System.out.println("Se llama: " + nombre);
	}
	public static int ObtenerNumero()
	{
		return 15;
	}
	
	static int SumarNumeros(int num1, int num2)
	{
		return num1+num2;
	}
	
	static String ConcatenarPalabras(String palabra1, String palabra2)
	{
		return palabra1+palabra2;
	}
	
	static double Factorial(int n) // Convencion que las funciones hagan una sola cosa y que el nombre de la funcion sea Entendible
	{
		int f=1;
		for(int i = 1; i<=n; i++)
		{
			f=f*i;
		}
		return f;
		
		
	}
	
    static void DibujarCuadrado(int num2)
    {
    	for(int i=1; i<=num2; i++)
    	{
    		for (int col=1; col<=num2;col++)
    		{
    				System.out.print("*"+"\t");
    		}
    		System.out.print("\n");
    	}
    }
	
	static void DibujarFlecha(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for (int col=1; col<=i; col++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		for(int i=n-1; i<=n; i--)
		{
			for (int col=1; col<=i; col++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
	
	
	static double Suma(double n1, double n2)
	{
		return n1+n2;
	}
	
	static double Resta(double n1, double n2)
	{
		return n1-n2;
	}
	
	static boolean EsPrimo(int n1)
	{
		
	}
	
	
	
	
}
