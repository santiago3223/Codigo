package Cajero;

public class Cliente {
	String Nombre ="";
	String Apellido ="";
	String DNI ="";
	Cuenta cuenta = new Cuenta();
	Banco banco = new Banco();
	
	Cliente (String nom, String Ape, String DocN, String Ncuenta, String Nbanco, double sal, char moneda){
		Nombre = nom;
		Apellido =Ape;
		DNI = DocN;
		cuenta.NroCuenta =Ncuenta;
		banco.nombre =Nbanco;
		cuenta.Saldo_Disponible = sal;
		cuenta.moneda=moneda;
	}
	
	void SacarSaldo() {
		double a =cuenta.ConsultarSaldo();
		System.out.println(Nombre + ":"+"El Saldo en la cuenta es: " +a);
	}
	
	void Depositar(double a) {
		cuenta.AbonarCuenta(a);
		System.out.println("Ud deposito:" +a);
	}
	
	void Retirar (double a) {
		if (cuenta.ConsultarSaldo()>a) 
		{
			cuenta.DebitarCuenta(a);
			System.out.println("Ud retiro"+a);
		}
		else 
		{
			System.out.println("No tiene saldo suficiente");
		}
	}
	
	

}
