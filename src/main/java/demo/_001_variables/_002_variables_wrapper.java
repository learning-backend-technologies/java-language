package demo._001_variables;

public class _002_variables_wrapper {

    public static void main(String[] args) {
    	// Declaracion de variables with max value
    	Byte bite = 127;
    	Short shott = 32_767;
    	Integer edad = 2_147_483_647;
    	Long longg = 92_233_720_368_547_758_07l;
        Float precio = 3.402823471038f;
        Double precioMayor = 1.797693134862315710308d;
        Character charr = '\u20E4';
        Boolean mayorEdad = false;
        String cadena = "Hello";
        Empleado empleado = new Empleado("Aldo", 32, 20_000f, "Male", true);
        
        //Impresion 
        String msgBite = "Edad: " + bite.equals(127);
		
        System.out.println(msgBite);
		System.out.println(msgBite);
		System.out.println(msgBite);
		
        System.out.println("Edad: " + shott);
        System.out.println("Edad: " + shott);
        System.out.println("Edad: " + shott);
        
        System.out.println("Edad: " + edad);
        System.out.println("Edad: " + longg);
        System.out.println("Edad: " + precio);
        System.out.println("Edad: " + precioMayor);
        System.out.println("Edad: " + charr);
        System.out.println("Edad: " + mayorEdad);
        System.out.println("Edad: " + cadena);
        
        System.out.print("Aldo: " + msgBite);
        
        System.out.println("Edad: " + empleado.getName());
        System.out.println("Edad: " + empleado.getSex());
        System.out.println("Edad: " + empleado.getSalary());
        
    }
}
