package practica_funciones;

public class Zombie extends Enemigo {
	public Zombie () {
		hp = 300;
	}
	
	@Override //sirve para escribir mi clase, en caso de la momia me retorne zombie
	public String toString() {
		return "Zombie";
	}

	

}
