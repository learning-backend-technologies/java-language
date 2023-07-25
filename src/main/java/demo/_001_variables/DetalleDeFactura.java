package demo._001_variables;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el nombre de la factura" );
        String factura = scanner.nextLine();

        System.out.println("ingrese el primer precio ");
        double precioProducto1 = scanner.nextDouble();

        System.out.println("ingrese el segundo precio");
        double precioProducto2 = scanner.nextDouble();

        double totalBruto = precioProducto1 + precioProducto2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String resultado = "La factura "+factura+" tiene un total bruto de "+totalBruto+", con un impuesto de "+impuesto+" y el monto después de impuesto es de "+totalNeto;
        System.out.println(resultado);

    }
}
