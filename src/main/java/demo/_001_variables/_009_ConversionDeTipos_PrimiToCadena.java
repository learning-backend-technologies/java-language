package demo._001_variables;

public class _009_ConversionDeTipos_PrimiToCadena {

	public static void main(String[] args) {
		
		int otroNumeroInt = 100;		
		System.out.println("otroNumeroInt = " + otroNumeroInt);
		
		String otroNumeroStr = Integer.toString(otroNumeroInt);
		System.out.println("otroNumeroStr = " + otroNumeroStr);
		
		otroNumeroStr = String.valueOf(otroNumeroInt+10);
		System.out.println("otroNumeroStr = " + otroNumeroStr);
		
		double otroRealDouble = 1.23456e2;
		String otroRealStr = Double.toString(otroRealDouble);
		System.out.println("otroRealStr = " + otroRealStr);
		
		otroRealStr = String.valueOf(1.23456e2f);
		System.out.println("otroRealStr = " + otroRealStr);
	}
}
