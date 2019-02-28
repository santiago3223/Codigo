public class Variables_Karem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Escribe un programa Java que realice lo siguiente: 
 * declarar una variable N de tipo int, 
 * una variable A de tipo double y una variable C de tipo char 
 * y asigna a cada una un valor. A continuación muestra por pantalla:
El valor de cada variable.
La suma de N + A
La diferencia de A - N
El valor numérico correspondiente al carácter que contiene la variable C.
Si por ejemplo le hemos dado a N el valor 5, 
a A el valor 4.56 y a C el valor ‘a’, se debe mostrar por pantalla:

Variable N = 5
Variable A = 4.56
Variable C = a
5 + 4.56 = 9.559999999999999
4.56 - 5 = -0.4400000000000004
Valor numérico del carácter a = 97
 */
		int N = 12;
		double A = 4.98;
		char C = 'j';
		
		double suma1= N+A;
		double diferencia = N-A;
		int letraEnEntero= C;
		//Integer.parseInt(numCadena);
	     System.out.println(suma1);
	     System.out.println(diferencia);
	     System.out.println(letraEnEntero);
	     
	     /*Escribe un programa Java que realice lo siguiente: 
	      * declarar dos variables X e Y de tipo int, 
	      * dos variables N y M de tipo double y 
	      * asigna a cada una un valor. A continuación muestra por pantalla:
	     El valor de cada variable.
	     
	     La suma  X + Y
	     La diferencia  X – Y
	     El producto  X * Y
	     El cociente  X / Y
	     El resto  X % Y
	     La suma  N + M
	     La diferencia  N – M
	     El producto  N * M
	     El cociente  N / M
	     El resto  N % M
	     La suma X + N
	     El cociente Y / M
	     El resto Y % M
	     El doble de cada variable
	     La suma de todas las variables
	     El producto de todas las variables
	     */
	     
	     int X=1,Y=2; 
	     double N2=4.7,M=6.3, Respuesta;
	     Respuesta = X+Y;
	     System.out.println("La suma  X = "+ X +" + Y="+Y+" =>"+ Respuesta); 
	     Respuesta = X-Y;
	     System.out.println("La diferencia  X – Y: "+ Respuesta); 
	     Respuesta = X*Y;
	     System.out.println("El producto  X * Y: "+ Respuesta); 
	     Respuesta = X/Y;
	     System.out.println("El cociente  X / Y: "+ Respuesta); 
	     Respuesta = N2%M;
	     System.out.println("El resto  N % M: "+ Respuesta); 
	     Respuesta = N2+M;
	     System.out.println("La suma  N + M: "+ Respuesta); 
	     Respuesta = N2-M;
	     System.out.println(" La diferencia  N – M "+ Respuesta); 
	     Respuesta = N2*M;
	     System.out.println(" El producto  N * M "+ Respuesta); 
	     Respuesta = N2/M;
	     System.out.println("  El cociente  N / M "+ Respuesta); 
	     Respuesta = X+N2;
	     System.out.println(" La suma X + N " + Respuesta); 
	     Respuesta = Y/M;
	     System.out.println("  El cociente Y / M "+ Respuesta); 
	     Respuesta = Y%M;
	     System.out.println("  l resto Y % M "+ Respuesta); 
	    	    
	 
	     //condicionales
	     double numero1= 22;
	     
	     double residuo=numero1%2;
	     if	(residuo==0)
	     {
	    	 System.out.println("Es Par");
	     }
	     else
	     {
	    	 System.out.println("Es ImPar");
	     }
	     
	     int edad= 19;
	     string nacionalidad="italiana";
		if(edad>=18 && nacionalidad=="peruana")
		{
			System.out.println("Pasa");
		}else if(nacionalidad == "Sera")
	}

}


