package MiTiendita;

public class Principal {
	
	public static void main(String[] ag)
	{
		Auto a1= new Auto();
//		
//		a1.modelo="Toyota";
//		a1.marca="Corolla";
		System.out.println(a1.getModelo());
//		a1.setModelo("Yaris");
//		a1.setMarca("Toyota");
//		a1.setAnio(2017);
//		a1.setColor("Amarillo");
//		a1.setVelocidad(120.0);
//		a1.setVelocidad_maxima(250.0);
//		a1.setNitro(false);
		Auto a2 = new Auto("se","ddd",250);

		System.out.println(a2.getModelo());
		
		//Un metodo statico es que se puede llamar sin la necesidad de instanciar dobhjeto
		
		//los metodos staticos sirve como libreria
		// Extend _--> Es como el "o" hace esto ó esto otro
		//include --> hace algo mas por dentro (verificar contraseña)
		//a1.CargarCaracteristicas(a1.modelo, a1.marca);
//		a1.Prender();
//		a1.Mover();
//		a1.Detenerse();
//		a1.Prender();
//		a1.Mover();
//		a1.Mover();
//		a1.Mover();
//		a1.Mover();
//		a1.Detenerse();
		
	}

}
