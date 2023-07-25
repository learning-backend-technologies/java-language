package demo._003_operadores;

import javax.swing.*;

public class ProgramaNombreMasLargo {

    /**
     * Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
     *
     * Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando
     * la clase JOptionPane y método showInputDialog().
     *
     * Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
     * (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
     *
     * Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero
     * accedemos al nombre de la persona.
     *
     * Restricción no usar loops en el desarrollo de la tarea.
     *
     * Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
     */
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese nombre y 1er apellido ");
        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese nombre y 1er apellido ");
        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese nombre y 1er apellido ");

        int nombre1Length = nombre1.split(" ")[0].length();
        int nombre2Length = nombre2.split(" ")[0].length();
        int nombre3Length = nombre3.split(" ")[0].length();

        String nombreMasLargo = "";

        /*if (nombre1Length > nombre2Length)
            if (nombre1Length > nombre3Length)
                nombreMasLargo = nombre1;
            else
                nombreMasLargo = nombre3;
        else
        if (nombre2Length > nombre3Length)
                nombreMasLargo = nombre2;
            else
                nombreMasLargo = nombre3;
*/
/*
        String nombreMasLargo =
                nombre1Length > nombre2Length
                        ? nombre1Length > nombre3Length
                            ? nombre1
                            : nombre3
                        : nombre2Length > nombre3Length
                            ? nombre2
                            : nombre3;
*/

        String max = nombre1Length > nombre2Length
                        ? nombre1
                        : nombre2;

        nombreMasLargo = nombre3Length > max.length()
                ? nombre3
                : max;

        String resultado = nombreMasLargo + " tiene el nombre mas largo.";
        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
