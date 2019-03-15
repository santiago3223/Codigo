package Cajero;

public class Cuenta {
	double Saldo_Disponible;
	String NroCuenta;
	char moneda;
	
	
	double DebitarCuenta(double MontoRetiro)
	{
		return Saldo_Disponible=Saldo_Disponible-MontoRetiro;
	}
	
	double AbonarCuenta(double MontoAbono)
	{
		return Saldo_Disponible=Saldo_Disponible+MontoAbono;
	}
	
	double ConsultarSaldo()
	{
		return Saldo_Disponible;
	}

}
