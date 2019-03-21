package practica_funciones;

import java.util.Date;

import armas.Metralleta;

public class Funciones {

	public static void main(String[] argumento) throws InterruptedException {
		EjecutarJuego();
}
	
	static void EjecutarJuego() throws InterruptedException {
		Zombie z1 = new Zombie();
		Vampiro v1 = new Vampiro();
		Wargen w1 = new Wargen();
		
		//Arma a1 = new Arma();
		
		Jugador j1 = new Jugador();
		
		System.out.println("Bienvenido a mata Zombies, Vampiro y Wargen");
		String comando = Entrada.cadena();
		while(!comando.equals("Salir")) {
			if(comando.equals("z")) {
				j1.Apuntar(z1);
				j1.DispararArma(j1.arma1);
			}else if(comando.equals("v")) {
				j1.Apuntar(v1);
				j1.DispararArma(j1.arma1);
			}else if(comando.equals("w")) {
				j1.Apuntar(w1);
				j1.DispararArma(j1.arma1);			
			}else if(comando.equals("R")) {
				j1.arma1.Recargar();
				
			}
			
			comando = Entrada.cadena();
			
			
			
		}
		System.out.println("Buen juego");
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
