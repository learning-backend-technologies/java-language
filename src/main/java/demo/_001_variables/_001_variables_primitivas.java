package demo._001_variables;

public class _001_variables_primitivas {

    public static void main(String[] args) {
    	// Declaracion de variables with max value
    	byte bite = 127;
    	short shott = 32_767;
    	int edad = 2_147_483_647;
    	long longg = 92_233_720_368_547_758_07l;
        float precio = 3.402823471038f;
        double precioMayor = 1.797693134862315710308d;
        char charr = '\u58f0';
        boolean mayorEdad = false;
        
        //Impresion 
        System.out.println("Edad: " + bite);
        System.out.println("Edad: " + shott);
        System.out.println("Edad: " + edad);
        System.out.println("Edad: " + longg);
        System.out.println("Edad: " + precio);
        System.out.println("Edad: " + precioMayor);
        System.out.println("Edad: " + charr);
        System.out.println("Edad: " + mayorEdad);
    }
}
