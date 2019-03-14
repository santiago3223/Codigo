package armas;

import java.util.concurrent.TimeUnit;

public class Metralleta {
	String modelo ="";
	int cantidad_balas = 6;
	int t_recarga=3;
	int danio = 100;
	int alcance = 200;
	int velocidad = 1000;
	
	public void Disparar() {
		if(cantidad_balas>0) {
			cantidad_balas --;
		}
	}
	
	void Recargar() throws InterruptedException {
		TimeUnit.SECONDS.sleep(t_recarga);
		cantidad_balas = 6;
	}

}
