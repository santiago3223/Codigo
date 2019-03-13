
public class Arrays_Practica2_Willy {

	public static void main(String[] args) {
//		Ejercicio 1.- Escriba un programa que permita crear una arreglo de palabras y 
//		que, a continuación, pida dos palabras y sustituya la primera por 
//		la segunda en la lista.
		
		System.out.print("Cuantas palabras ingresará: ");
		int tamano = Entrada.entero();
		String [] Nombres = new String [tamano];
		for (int i = 0; i < tamano; i++)
		{
			System.out.print("Dígame la palabra " + (i + 1) + ": ");
			Nombres [i] = Entrada.cadena();
		}
		String mascota = "";
		for (int i = 0; i < tamano; i++)
		{
			if (i == tamano -1)
			{
				mascota = mascota +"'" + Nombres[i] +"'";
			} else 
			{
				mascota = mascota +"'" + Nombres[i] +"', ";	
			}
		}
		System.out.print("La lista creada es: "+ mascota);
		System.out.print("\n");
		System.out.print("Sustituir la palabra: ");
		String a = Entrada.cadena();
		System.out.print("por la palabra: ");
		String b = Entrada.cadena();
		for (int i = 0; i < tamano; i++)
		{
			if (Nombres[i].equals(a)) //No se coloca = se coloca .equals porque estamos comparando clases
			{
				Nombres[i] = b;
			}
		}
		
		String mascota1 = "";
		for (int i = 0; i < tamano; i++)
		{
			if (i == tamano -1)
			{
				mascota1 = mascota1 +"'" + Nombres[i] +"'";
			} else 
			{
				mascota1 = mascota1 +"'" + Nombres[i] +"', ";	
			}
		}
		
		System.out.print(mascota1);
		

	}

}
