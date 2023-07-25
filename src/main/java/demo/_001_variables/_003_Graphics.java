package demo._001_variables;

import javax.swing.JOptionPane;

public class _003_Graphics {

    public static void main(String[] args) {
    	String edadStr = JOptionPane.showInputDialog(null, "Type your age: ");
    	int edad = Integer.parseInt(edadStr);
    	JOptionPane.showMessageDialog(null, "Typed age: " + edad);
    }
}
