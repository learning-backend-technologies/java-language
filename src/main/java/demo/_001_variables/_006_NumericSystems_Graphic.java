package demo._001_variables;

import javax.swing.JOptionPane;

public class _006_NumericSystems_Graphic {

    public static void main(String[] args) {
    	String decimalStr = JOptionPane.showInputDialog(null, "Type a number: ");
    	int typedNumber = 0;
    	try {
    		typedNumber = Integer.parseInt(decimalStr);
    	}catch(NumberFormatException e) {
    		JOptionPane.showMessageDialog(null, "Error decimal integer is required");
    		main(args);
    		System.exit(0);
    	}
    	
    	System.out.println("Typed number: " + typedNumber);
    	
    	String resultadoBinario = "Binary number of " + typedNumber + " = " + Integer.toBinaryString(typedNumber);
    	System.out.println(resultadoBinario);
    	
    	String resultadoOctal = "Octal number of " + typedNumber + " = " + Integer.toOctalString(typedNumber);
    	System.out.println(resultadoOctal);
    	
    	String resultadoHex = "Hexadecimal number of" + typedNumber + " = " + Integer.toHexString(typedNumber);
    	System.out.println(resultadoHex);
    	
    	String mensaje = resultadoBinario;
    	mensaje += "\n" + resultadoOctal;
    	mensaje += "\n" + resultadoHex;
    	
    	JOptionPane.showMessageDialog(null, mensaje);
    }
}
