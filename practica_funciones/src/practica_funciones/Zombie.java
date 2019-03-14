package practica_funciones;

public class Zombie {
	int hp = 300;
	
	void Morir() {
		System.out.println("Ayyyy me muero");
	}
	
	void RecibirDisparo(int danio) {
		hp = hp - danio;
		if(hp <= 0) {
			Morir();
		}	
	}
}
