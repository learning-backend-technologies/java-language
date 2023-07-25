package demo._003_operadores;

import java.util.Scanner;

public class ProgramaOrdenarParDeNumeros {

    /**
     * El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
     *
     * Podría ser utilizando operador ternario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el 1er numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el 2do numero: ");
        int num2 = scanner.nextInt();

        String resultado = num1 >= num2
                ? "\n" + num1 + "\n" + num2
                : "\n" + num2 + "\n" + num1;

        System.out.println("resultado = " + resultado);
    }
}
