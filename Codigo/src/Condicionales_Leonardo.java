
public class Condicionales_Leonardo {

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
		
		String nombre = "santiago";
		if (nombre ==  "santiago") {
			System.out.println("Ingresa");
		}else {
			System.out.println("Se retira");
		}
		
		int par_impar = 11;
		if (par_impar %2 ==  0) {
			System.out.println("El numero es Par");
		}else {
			System.out.println("El numero es Impar");
		}
	}

}
