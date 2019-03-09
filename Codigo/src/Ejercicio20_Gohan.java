
public class Ejercicio20_Gohan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int tamano = Entrada.entero();
		int [] numeros= {4,2,6,2,7};
		int [] copianumeros= {4,2,6,2,7};
		int mayor =0;
		for (int i = 0; i < numeros.length; i++) {
			mayor = numeros[i];
			if(numeros[i] > numeros[i+1]) {
				mayor = numeros[i];
				numeros[i] = numeros[i+1];
				numeros[i+1] = mayor;
			}else {
				mayor = numeros[i+1];
			}
			
		}
		
		System.out.println(mayor);
 	}

}
