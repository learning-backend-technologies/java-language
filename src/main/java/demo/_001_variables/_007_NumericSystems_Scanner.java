package demo._001_variables;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class _007_NumericSystems_Scanner {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Type a number: ");
//    	String decimalStr = scanner.nextLine(); 
    	int typedNumber = 0;
    	try {
//    		typedNumber = Integer.parseInt(decimalStr);
    		typedNumber = scanner.nextInt();
    	}catch(
//    			NumberFormatException e
    			InputMismatchException e
    			) {
    		System.out.println("Error decimal integer is required");
    		main(args);
    		System.exit(0);
    	}
    	
    	System.out.println("Typed number: " + typedNumber);
    	
    	String resultadoBinario = "Binary number of " + typedNumber + " = " + Integer.toBinaryString(typedNumber);
    	
    	String resultadoOctal = "Octal number of " + typedNumber + " = " + Integer.toOctalString(typedNumber);
    	
    	String resultadoHex = "Hexadecimal number of " + typedNumber + " = " + Integer.toHexString(typedNumber);

    	String mensaje = resultadoBinario;
    	mensaje += "\n" + resultadoOctal;
    	mensaje += "\n" + resultadoHex;
    	
    	System.out.println(mensaje);
    }
}
