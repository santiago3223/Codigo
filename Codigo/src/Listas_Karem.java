
public class Listas_Karem {

	public static void main(String[] args) 
	{
//		System.out.println("Ingrese numero palabras:");
//		int tamano=Entrada.entero();
//		String [] Nombres= new String[tamano];
//		
//		for(int i=0; i<tamano; i++)
//		{
//			System.out.println("Digame la palabra "+(i+1)+":");
//			Nombres[i]=Entrada.cadena();
//		}
//		
//		for(int j=0; j<tamano; j++)
//		{
//			System.out.println(Nombres[j]);
//		}
//		
		System.out.println("jo");
		System.out.println(EncontrarMenor(23,22,12));
		System.out.println("sdfadsf");
		System.out.println(ContarVocales("karem"));
		System.out.println(Promedio(11,14,12));
	}
	
	public static double EncontrarMenor(double a,double b, double c)
	{
		double menor=0;
		if(a<b)
		{
			menor=a;
		
		}
		else
		{
			menor=b;
		}
		
		if(menor<c)
		{
			menor=menor;
		}
		else
		{
			menor=c;
		}
		return menor;
	}

  public static int ContarVocales(String palabra)
  {
	  int contador=0;
	  
	  for(int i=0; i<palabra.length();i++)
	  {
		  if(   palabra.charAt(i)=='a'||
				palabra.charAt(i)=='e'||
				palabra.charAt(i)=='i'||
				palabra.charAt(i)=='o'||
				palabra.charAt(i)=='u'
			)
		  {
			  contador=contador+1;
		  }
	  }
	  return contador;
  }
  
  public static double Promedio(int a , int b, int c)
  {
	  return (a+b+c)/3;
  }
  
  public static String ExtraerCentral(String palabra)
  {
	  if(palabra.length() % 2 == 0)
  }
}
