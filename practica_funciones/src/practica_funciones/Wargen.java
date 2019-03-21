package practica_funciones;

public class Wargen extends Enemigo{
	public Wargen () {
		hp = 450;
	}
	
	@Override //sirve para escribir mi clase, en caso de la momia me retorne wargen
	public String toString() {
		return "Wargen";
	}

}
