package demo._001_variables;

public class _005_NumericSystems_Dinamic {

    public static void main(String[] args) {
    	
    	int numeroDecimal = 30;
    	System.out.println("Decimal number = " + numeroDecimal);

    	System.out.println("Binary number of " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

    	System.out.println("Octal number of " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

    	System.out.println("Hexadecimal number of " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
    	
    }
}
