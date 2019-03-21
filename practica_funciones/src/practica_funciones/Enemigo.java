package practica_funciones;

public class Enemigo {
	int hp;
	
	void morir() {
		System.out.println("Ayy me muiro horroooor");
	}
	
	
	 void RecibirDisparo(int danio) {
		 if(hp>0) {
			 System.out.println("Oh no! me dieron");
			 			 
			 hp = hp - danio;
			 System.out.println("mi vida bajo a "+hp);
			 if (hp<=0) {
				 morir();
			 }			 
		 }		 
	 }
}
