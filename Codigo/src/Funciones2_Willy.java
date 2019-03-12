
public class Funciones2_Willy {

	public static void main(String[] args) {
	//System.out.println(suma(2,3));
	//	suma(2,3);
		
		
		System.out.println(Factorial2 (3));
		
	}
	
	
//	static double resta(double n1, double n2) {
//		return n1 - n2;
//	}	
//		
//	static void suma(double n1, double n2) {
//		//return n1 + n2;
//		System.out.println(n1 + n2);		
//	}
//	
//	static double resta(double n1, double n2) {
//		return n1 - n2;
//	}
//	
//	static double multiplicacion(double n1, double n2) {
//		return n1 * n2;
//	}
//	
//	static double division(double n1, double n2) {
//		return n1 / n2;
//	}

		static double Factorial2(int n) {
			double f = 1;
			for (int i = 1; i <= n; i++) {
				f = f * i;
			}
			return f;
		}
		
		static double Factorial(int n) {
			if(n == 1) {
				return 1;

			}
			return Factorial(n-1)*1;
		}
	
	
	
	
	
	
}
