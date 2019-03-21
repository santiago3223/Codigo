package practica_funciones;

import java.util.concurrent.TimeUnit;

public class Escopeta extends Arma{
	Escopeta(){
	modelo ="";
	cantidad_balas = 4;
	t_recarga=4;
	danio = 250;
	alcance = 100;
	velocidad = 700;
	}
	
	
	@Override 
	public String toString() {
		return "Escopeta";
	}
	
	void Recargar() throws InterruptedException {
		TimeUnit.SECONDS.sleep(t_recarga);
		cantidad_balas = 4;
		System.out.println("Arma cargada, puede disparar |--> ");
	}
}
