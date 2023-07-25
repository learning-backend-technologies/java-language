package demo._002_tipostring_cadenas;

public class _005_EjemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null;
        
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);
//        System.out.println(curso.toUpperCase());//NullPointerException

        if(esNulo) {
            curso = "    " +
                    "" +
                    "   ";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("isEmpty = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("isBlank = " + esBlanco);

        if(esBlanco == false) { // Igual a !esBlanco
            System.out.println(curso.toUpperCase());
            //System.out.println("Bienvenido al curso " + curso);// No marca null error vs concat
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
