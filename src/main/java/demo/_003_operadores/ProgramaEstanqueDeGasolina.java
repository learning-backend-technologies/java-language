package demo._003_operadores;

import java.util.Scanner;

public class ProgramaEstanqueDeGasolina {
    /**
     *
     * Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida
     * actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
     *
     * La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien
     * puede ser del tipo int.
     *
     * Si la capacidad actual es 70 litros: imprimir Estanque lleno
     * Si está entre 60 y menor a 70: imprimir Estanque casi lleno
     * Si está entre 40 y menor a 60: imprimir Estanque  3/4
     * Si está entre 35 y menor a 40: imprimir Medio Estanque
     * Si está entre 20 y menor a 35: imprimir Suficiente
     * Si está entre 1 y menor a 20: imprimir Insuficiente
     *
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese medida actual del estanque (litros): ");
        double medidaActual = scanner.nextDouble();

        String resultado = medidaActual == 70
                ? "Estanque lleno"
                : 60 <= medidaActual && medidaActual < 70
                    ? "Estanque casi lleno"
                    : 40 <= medidaActual && medidaActual < 60
                        ? "Estanque 3/4"
                        : 35 <= medidaActual && medidaActual < 40
                            ? "Medio Estanque"
                            : 20 <= medidaActual && medidaActual < 35
                                ? "Suficiente"
                                : 1 <= medidaActual && medidaActual < 20
                                    ? "Insuficiente"
                                    : "Error, dato no valido";

        System.out.println("resultado = " + resultado);
    }
}
