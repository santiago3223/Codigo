
public class Funciones2 {
	public static void main(String[] args) {
//		long inicio = System.nanoTime();
//		System.out.println(EsPrimo(104729));
//		long fin = System.nanoTime();
//		System.out.println((fin -inicio)/1000);
		//System.out.println(fibonacci(10));
		System.out.println("Ingrese nombre jugador 1");
		String player1 = Entrada.cadena();
		System.out.println("Ingrese nombre jugador 2");
		String player2 = Entrada.cadena();
		System.out.println("Ingrese ficha jugador 1");
		char ficha1 = Entrada.caracter();
		System.out.println("Ingrese ficha jugador 2");
		char ficha2 = Entrada.caracter();
		
		String juego = "_________";
		ImprimirJuego(juego);
		int turno = 1;
		int posicion = -1;
		char ficha = '_';
	
		while (GanoJuego(juego) == false || turno == 10) {
			if (turno % 2 == 0) {
				System.out.println(player2);
				posicion = Entrada.entero();
				ficha = ficha2;
			}else {
				System.out.println(player1);
				posicion = Entrada.entero();
				ficha = ficha1;
			}
			juego = juego.substring(0,posicion) + ficha + juego.substring(posicion+1);
			turno ++;
			ImprimirJuego(juego);
		}
		if (turno <10) {
			if(turno %2 == 0) {
				System.out.println("Gano " +player1);
			}else {
				System.out.println("Gano " +player2);
			}
		}
		System.out.println("Termino el juego");
		
		

	}	
	
	static boolean GanoJuego(String juego) {
		//horizontales
		if(CombinacionGanadora(juego.charAt(0), juego.charAt(1), juego.charAt(2)))return true;
		if(CombinacionGanadora(juego.charAt(3), juego.charAt(4) ,juego.charAt(5)))return true;
		if(CombinacionGanadora(juego.charAt(6), juego.charAt(7) ,juego.charAt(8)))return true;
		//verticales
		if(CombinacionGanadora(juego.charAt(0), juego.charAt(3) ,juego.charAt(6)))return true;
		if(CombinacionGanadora(juego.charAt(1), juego.charAt(4) ,juego.charAt(7)))return true;
		if(CombinacionGanadora(juego.charAt(2), juego.charAt(5) ,juego.charAt(8)))return true;
		//Cruzado
		if(CombinacionGanadora(juego.charAt(0), juego.charAt(4) ,juego.charAt(8)))return true;
		if(CombinacionGanadora(juego.charAt(2), juego.charAt(4) ,juego.charAt(6)))return true;
		
		return false;
	}
	
	static boolean CombinacionGanadora(char c1, char c2, char c3) {
		if (c1=='_') return false;
		if (c2=='_') return false;
		if (c3=='_') return false;
		return CompararCaracteres(c1,c2,c3);
	}
	
	static boolean CompararCaracteres(char c1, char c2, char c3) {
		if(c1 == c2 && c1 ==c3) {
			return true;
		}else {
			return false;
		}
	}
	
	
	static void ImprimirJuego(String juego) {
		for(int i = 0; i< 9; i++) {
			if((i+1)%3==0) {
				System.out.print("|" +juego.charAt(i)+"|");
				System.out.println();
			}else {
				System.out.print("|" +juego.charAt(i));
			}
		}
		
	}
	
	
	
	static int fibonacci(int numero) {
		int n1 = 0;
		int n2 = 1;
		int total = 0;
		if (numero==1) return 0;
		else if (numero==2) return 1;
		else {
			for(int i = 2; i<= numero; i++) {
				total = n1+n2;
				n1 = n2;
				n2 = total;
			}
			return total;
		}
	}
	
	static boolean EsPrimo(int numero) {
		for(int i = 2; i*i < numero; i++) {
			if(numero%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static double suma (double n1 , double n2) {
		return n1+n2;
	}
	
	static double resta (double n1 , double n2) {
		return n1-n2;
	}
	
	static double division (double n1 , double n2) {
		return n1/n2;
	}
	
	static double multiplicar (double n1 , double n2) {
		return n1*n2;
	}
}
