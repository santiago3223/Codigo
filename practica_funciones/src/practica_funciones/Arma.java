package practica_funciones;

public class Arma {
	String modelo ="";
	int cantidad_balas;
	int t_recarga;
	int danio;
	int alcance;
	int velocidad;
	
	void Disparar() {
		if(cantidad_balas>0) {
			cantidad_balas--;
			System.out.println("Fallo disparo"); //
		}else {
			System.out.println("No quedan balas, necesitas recargar");
		}
		
	}
	
	void Disparar(Enemigo e) {
		if(cantidad_balas>0) {
			cantidad_balas--;
			System.out.println("Disparo impacto en " + e); //
			e.RecibirDisparo(danio); //
			
		}else {
			System.out.println("No quedan balas, necesitas recargar");
		}

	}
	

}
