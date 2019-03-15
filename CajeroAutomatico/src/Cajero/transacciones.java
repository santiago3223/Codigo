package Cajero;

import java.util.*;

public class transacciones {

	public static void main(String[] args) {
		
		List<String> lista_cliente = new ArrayList<String>();
		
		lista_cliente.add("Facundo");
		lista_cliente.add("Roberto");
		lista_cliente.add("Pedro");
		
		System.out.println(lista_cliente);
		Scanner lee = new Scanner(System.in);
		System.out.println("Indique cliente:");
		int pos_cliente= lee.nextInt();
		System.out.println(lista_cliente.get(pos_cliente));
		
		
		
		Cliente Facundo = new Cliente(lista_cliente.get(pos_cliente),"Mascota","65364356","65321531732","Masinga",300,'S');
		
		boolean o =true;
		while(o){
		System.out.println("- - - - - - - - - - - - - - - - - - - ");
		System.out.println("CAJERO AUTOMATICO BANCO MASINGA");
		System.out.println("- - - - - - - - - - - - - - - - - - - ");
		System.out.println("1. Consultar Saldo");
		System.out.println("2. Depositar");
		System.out.println("3. Retirar");
		System.out.println("0. Terminar");
		System.out.println("- - - - - - - - - - - - - - - - - - - ");
		System.out.println("Teclea el numero de la opcion que desee: ");
		
		int bancoMasinga= lee.nextInt();
		
		
		switch (bancoMasinga) {
		case 1:
			Facundo.SacarSaldo();
			break;
		case 2:
			System.out.println("Ingrese monto a depositar: ");
			Facundo.Depositar(lee.nextDouble());
			break;
		case 3:
			System.out.println("Ingrese monto a retirar: ");
			Facundo.Retirar(lee.nextDouble());
			break;
		case 0:
			System.out.println("Chau");
			o=false;
			break;
			
		}
		}

	}

}
