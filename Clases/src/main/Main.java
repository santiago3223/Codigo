package main;

import Clases.Auto;
import Clases.ConversorDeUnidades;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto.informacion();
		Auto a1 = new Auto();
		System.out.println(a1.getModelo());
		
		Auto a2 = new Auto("VW","Gol",2010,260);
		System.out.println(a2.getModelo());
		a2.ImprimirPropiedades();
		double km = 1000;
		//double millas = ConversorDeUnidades.KilometrosAMillas(km);
		System.out.println(millas);
		
		
	}

}
