
public class ADN_main_willy {

	public static void main(String[] args) {
		//http://progra.usm.cl/apunte/ejercicios/2/adn.html
		int [][] base_Datos = {{0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1},
				{0,0,1,0,1,0,1,0,1,0,1,1,0,1,1,1,0,1,1,1},
				{0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,1}};
//		int []test= {0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,1};
//		System.out.println(calcular_Similitud(base_Datos[2], test));
		
		int []sospechoso = CargarDatosSospechoso();
		EncontrarCulpable(base_Datos, sospechoso);
		}
	
	static int[] CargarDatosSospechoso() {
		//Obtener por teclado los 20 digitos
		return new int[20];	
	}
	
	static void EncontrarCulpable (int[][]base_Datos, int[]sospechoso) {
		//Encontrar el registro con mayor similitud con nuestro sospechoso
		int posicion = 0;
		int similitud = 0;
		int similitud_temp;
		for(int i =0; i < base_Datos.length; i++) {
			similitud_temp = calcular_Similitud(base_Datos[i],sospechoso);
			if (similitud_temp > similitud) {
				similitud = similitud_temp;
				posicion=i;
			}
			
		}
		
		System.out.println( );

	
	}
			
	static int calcular_Similitud(int[] s1, int[]s2) {
		int contador = 0;
		for(int i=0;i<20;i++) {
			if(s1[i]==s2[i]) {
				contador++;			
			}
		}
		return contador*10/2;
	}

}	


