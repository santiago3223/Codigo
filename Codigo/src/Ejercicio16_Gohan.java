
public class Ejercicio16_Gohan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Bienvenido al juego del asterisco:");
		
		int altura = Entrada.entero();
		char []asterisco= {};
		int pos = 0;
		
		while(altura != 1) {
			asterisco[pos] = '*';
			pos++;
			altura = altura -1;
		}
	}

}
