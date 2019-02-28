
public class variables_yenavi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribe un programa Java que realice lo siguiente: 
		 * declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo 
		 * char y asigna a cada una un valor. A continuación muestra por pantalla:
		El valor de cada variable.*/
		int P=5;
		double A=4.56;
		char C='a';
		System.out.println("Entero:"+P);
		System.out.println("Double:"+A);
		System.out.println("Char:"+C);
		
		/*La suma de N + A
		La diferencia de A - N
		El valor numérico correspondiente al carácter que contiene la variable C.
		Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, 
		se debe mostrar por pantalla:*/
		
		System.out.println("La suma de N + A= "+ (P+A));
		System.out.println("La diferencia de A - N= "+ (A-P));
		System.out.println("El valor numérico de C"+ (int) C);
		
		/*Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de 
		 * tipo int, dos variables N y M de tipo double y asigna a cada una un valor. 
		 * A continuación muestra por pantalla:
		El valor de cada variable.*/
		
		int x=8;
		int y=5;
		int n=12;
		int m=25;

		System.out.println(x+"+"+y+"="+(x+y));
		System.out.println(x+"-"+y+"="+(x-y));
		System.out.println(x+"/"+y+"="+(x/y));
		System.out.println(x+"%"+y+"="+(x%y));
		System.out.println(n+"+"+m+"="+(n+m));
		System.out.println(n+"-"+m+"="+(n-m));
		System.out.println(n+"x"+m+"="+(n*m));
		System.out.println(n+"/"+m+"="+(n/m));
		System.out.println(n+"%"+m+"="+(n%m));
		System.out.println(x+"+"+n+"="+(x+n));
		System.out.println(y+"/"+m+"="+(y/m));
		System.out.println(y+"%"+m+"="+(y%m));
		System.out.println("El doble de "+x+ " es= "+(x*2));
		System.out.println("El doble de "+y+ " es= "+(y*2));
		System.out.println("El doble de "+n+ " es= "+(n*2));
		System.out.println("El doble de "+m+ " es= "+(m*2));
		System.out.println("El doble de "+m+ " es= "+(m*2));
		System.out.println(x+"+"+y+"+"+n+"+"+m+ " = "+(x+y+n+m));
		System.out.println(x+"x"+y+"x"+n+"x"+m+ " = "+(x*y*n*m));
	}

}
