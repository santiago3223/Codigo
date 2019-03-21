package practica_funciones;

import java.util.concurrent.TimeUnit;

public class Pistola extends Arma{
	Pistola(){
	modelo ="";
	cantidad_balas = 6;
	t_recarga=2;
	danio = 100;
	alcance = 200;
	velocidad = 1000;
	}
	
	
	@Override
	public String toString() {
		return "Pistola";
	}
	
	void Recargar() throws InterruptedException {
		TimeUnit.SECONDS.sleep(t_recarga);
		cantidad_balas = 6;
		System.out.println("Arma cargada, puede disparar |--> ");
	}
	
}
