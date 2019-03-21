package practica_funciones;

public class Jugador {
	int hpJugador = 1000;
	String alias = "El matador";
	Pistola arma1 = new Pistola();
	Pistola arma2 = new Pistola();
	Enemigo objetivo = null; 
	
	void Apuntar(Enemigo z) {
		if(z.hp<=0) {
			System.out.println("Su enemigo ya está muerto");
		}else {
		if (Math.random()>=0.5) {
			objetivo = z;
		}else {
			objetivo = null;
		}		
		}
	}
	
	void DispararArma(Pistola arma) {
		if(objetivo== null) {
		arma.Disparar();
		}else {
			arma.Disparar(objetivo);
		}
	}
	
	void RecibirDanio(int d) {
		hpJugador= hpJugador - d;
		if (hpJugador<=0) {
			Morir();
		}
	}
	
	void Morir() {
		System.out.println("Ayy me muero, y soy "+ alias);
	}
}
