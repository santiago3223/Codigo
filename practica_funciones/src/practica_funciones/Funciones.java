package practica_funciones;

import java.util.Date;

import armas.Metralleta;

public class Funciones {

	public static void main(String[] argumento) throws InterruptedException {
		Zombie z1 = new Zombie();
		Zombie z2 = new Zombie();
		Zombie z3 = new Zombie();
		Jugador j1 = new Jugador();
		j1.Apuntar(z1);
		j1.DispararArma(j1.arma1);
		j1.Apuntar(z1);
		j1.DispararArma(j1.arma2);
		System.out.println(z1.hp);
}

	
	
	static void CambiarPalabra(String s) {
		s = "facu";
	}
	
	static void CambiarNumero (int n) {//al ingresar a la funcion se crea una copia de nuestro entero
		n = 30; //solo se cambia el valor de n dentro de la funcion, pero fuera de esta, sigue con su valor original
		System.out.println(n);
	}
	
	static void ImprimirHoraActual() {
		Date date = new Date();
		System.out.println(date);
	}
	
	static void ImprimirNumeros(int[] numeros) {
		for(int i = 0; i<numeros.length;i++ ) {
			System.out.println(numeros[i]);
		}
	}
	
	static int[]  ImprimirNumeros2(int[] numeros) {
		for(int i = 0; i<numeros.length;i++ ) {
			numeros[i] = numeros.length - numeros[i];
		}
		return numeros;
	}
	
	
	
	
	
	
}
