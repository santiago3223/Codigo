
public class Triangulo_Karem2 {

	public static void main(String[] args) {
	
		//Triangulo(7);
		System.out.println(Factorial(1));
		
  }
	
	public static void Triangulo(int n)
	{
		for(int i=1; i<=(n+1)/2;i++)
		{
			Espacios((n+1)/2-i);
			Asteriscos(2*i-1);
			System.out.print('\n');
		}
	}
	public static void Espacios(int n)
	{
		for(int i=1; i<=n;i++)
		{
			System.out.print(' ');
		}
	}
	public static void Asteriscos(int n)
	{
		for(int i=1; i<=n;i++)
		{
			System.out.print('*');
		}
		
	}
	
	public static double Factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return Factorial(n-1) * n;
	}
	

}