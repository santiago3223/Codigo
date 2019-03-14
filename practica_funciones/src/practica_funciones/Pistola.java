package practica_funciones;

import java.util.concurrent.TimeUnit;

public class Pistola {
	String modelo ="";
	int cantidad_balas = 6;
	int t_recarga=3;
	int danio = 100;
	int alcance = 200;
	int velocidad = 1000;
	
	void Disparar() {
		if(cantidad_balas>0) {
			cantidad_balas --;
		}
	}
	
	void Disparar(Zombie z) {
		if(cantidad_balas>0) {
			cantidad_balas --;
		}
		z.RecibirDisparo(danio);
	}
	
	void Recargar() throws InterruptedException {
		TimeUnit.SECONDS.sleep(t_recarga);
		cantidad_balas = 6;
	}
	
}
