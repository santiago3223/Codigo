
public class Ahorcado {

	public static void main(String[] args) {
		char[] respuesta = {'c','o','d','i','g','o'};
		char[] p = {'c','_','d','_','g','o'};
		char letra;
		int vidas_perdidas = 0;
		while (vidas_perdidas<7 && CompararRespuesta(respuesta, p)== false) {
			letra=Entrada.caracter();
			if (BuscarLetra(respuesta, p, letra)) {
				System.out.println("Encontro una letra!");
			}else {
				vidas_perdidas++;
				System.out.println("No es una letra, intentalo de nuevo!");
			}
			DibujarAhorcado(p, vidas_perdidas);
			System.out.println("\n" + "============================");
		}
		System.out.println("Perdiste compare, largate!");
	}
	
	static boolean BuscarLetra(char[]respuesta_correcta, char[]respuesta_actual, char letra) {
		boolean encontro_letra = false;
		for(int i=0; i<respuesta_correcta.length;i++) {
			if(respuesta_correcta[i]==letra) {
				respuesta_actual[i]=letra;
				encontro_letra = true;				 
			}
		}
		return encontro_letra;
	}
	
	static boolean CompararRespuesta(char[]respuesta, char[]p) {
		for(int i=0; i <respuesta.length;i++) {
			if(respuesta[i]!=p[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	static void DibujarAhorcado(char[]palabra, int vidas_perdidas) {
		for(int i=0; i<palabra.length; i++) 
		{
			System.out.print(palabra[i] + " ");
		}

		System.out.println();
		if(vidas_perdidas>5)
			System.out.println("  o  ");
		else {
			System.out.println();
		}
		if(vidas_perdidas>2) 
		{
			System.out.print(" /");
			if(vidas_perdidas>3) 
			{
				System.out.print("|");
				if(vidas_perdidas>4) 
					System.out.println("\\");
				else {
					System.out.println();
				}
			}else {
				System.out.println();
			}
		}else {
			System.out.println();
		}
		if (vidas_perdidas > 0)
			System.out.print(" /");
		if (vidas_perdidas > 1)
			System.out.println(" \\");

	}
}
