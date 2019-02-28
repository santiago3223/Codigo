
public class Condicionales {

	public static void main(String[] args) {
		int ingreso = 1001;
		float monto_minimo_para_renta = 1000;
		// if (1>2)
		// if ("hola" == "adios")
		// if (variable1 > variable2)
		if (ingreso >= monto_minimo_para_renta) {
			System.out.println("Pagar renta");
		}else {
			System.out.println("Recibe bono");
		}

		int numero = 12354851;
		if (numero%2==0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}

		System.out.println(21%5);
		System.out.println(17%10);

		int edad = 16;
		String nacionalidad = "italiana";

		
		
		if (edad >= 18 && nacionalidad == "peruana") {
			System.out.println("puede visitar");
		}else {
			if (edad < 18) {
				if (nacionalidad != "peruana") {
					System.out.println("no puede visitar, nacionalidad");
				}
				System.out.println("no puede visitar, menor de edad");
			}else {
				System.out.println("no puede visitar, nacionalidad");
			}	
		}
		
		
		if (edad >= 18) {
			if (nacionalidad == "peruana") {
				System.out.println("puede visitar");
			}else {
				System.out.println("no puede visitar, nacionalidad");
			}
		}else {
			System.out.println("no puede visitar, menor de edad");
			if (nacionalidad != "peruana") {
				System.out.println("no puede visitar, nacionalidad");
			}
		}
		
	}

}
