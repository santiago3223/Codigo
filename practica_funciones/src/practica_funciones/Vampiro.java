package practica_funciones;

public class Vampiro extends Enemigo{
	public Vampiro() {
		hp = 500;
	}
	
	public void Morir() {
		System.out.println("Me muero y soy vampiro");
	}
	
	void RecibirDisparo(int danio) {
		hp=hp-danio;
		if (hp<=0) {
			Morir();
		}
	}
	
	@Override //sirve para escribir mi clase, en caso de la momia me retorne vampiro
	public String toString() {
		return "Vampiro";
	}


}
