package demo._001_variables;

public class _008_ConversionDeTipos_CadenasToPrimi {

	public static void main(String[] args) {
		String numeroStr = "50";
		
		int numeroInt = Integer .parseInt(numeroStr);
		System.out.println("numeroInt = " +numeroInt);
		
		String realStr = "98765.43e-3";
		double realDouble = Double .parseDouble(realStr);
		System.out.println("realDouble = " + realDouble);
		
		String logicoStr = "true";
		boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
		System.out.println("logicoboolean =" + logicoBoolean);
	}
}
