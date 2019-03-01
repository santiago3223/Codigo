
public class Condicionales {

	public static void main(String[] args) {
		int ingreso = 1001;
		float monto_minimo_para_renta = 1000;
		// Sintaxis if ('condicion que genere true o false'){}
		// if (1>2)
		// if ("hola" == "adios")
		// if (variable1 > variable2)
		if (ingreso >= monto_minimo_para_renta) { // si mi ingreso es mayor o igual que el monto minimo para pagar impuestos
			// si es verdadero entra aqui
			System.out.println("Pagar renta"); 
		}else {
			// si es falso entra aqui
			System.out.println("Recibe bono");
		}

		//Ejemplo, saber si un numero es par
		int numero = 12354851;
		if (numero%2==0) { // si el residuo de dividir numero entre 2 es cero, es par, sino impar
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}

		System.out.println(21%5);// el operador % nos permite ayar el residui de la division
		System.out.println(17%10);//

		// Ejercicio 2; solos los mayores de edad de nacionalidad peruana pueden visitar nuestro "museo"
		int edad = 16;
		String nacionalidad = "italiana";
		// forma 1 Leo
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

		// Forma 2
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

		/* Ejercicio 3
		 * Pedir dos numeros y decir si son iguales o no
		 */

		/* Ejercicio 4 
		 * Dados los coeficientes de una ecuacion de segundo grado muestre sus soluciones reales o indique si no existen 
		 * 
		 */

		double a,b,c; // coeficientes ax^2+bx+c=0
		double x1,x2,d; // soluciones y determinante
		System.out.println("Introduzca primer coeficiente (a):");
		a=Entrada.entero();
		System.out.println("Introduzca segundo coeficiente: (b):");
		b=Entrada.entero();
		System.out.println("Introduzca tercer coeficiente: (c):");
		c=Entrada.entero();
		// calculamos el determinante
		// Preguntamos si el determinante es menor que cero, no existen soluciones reales
		// Si es mayor o igual que cero, imprimimos las respuestas
		

	}

}
