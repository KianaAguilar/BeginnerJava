import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        System.out.println("Ingresa el detalle de la factura");
        Scanner scanner = new Scanner(System.in);
        String factura = scanner.nextLine();

        System.out.println("Ingresa los precios de los productos");
        double precio1  = scanner.nextDouble();
        double precio2 = scanner.nextDouble();
        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura " + factura + " tiene un total bruto de " + totalBruto
                + ", con un impuesto de " + impuesto
                + " y el monto despues de impuesto es de " + totalNeto;

        System.out.println(detalle);

    }

        /* La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
        Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
        Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
        Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
        Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
        Por ejemplo, el resultado podría ser algo así:
        La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882*/
}
