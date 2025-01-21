
import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final float impuesto = 0.19f;

        System.out.println("\t*****Detalles de factura*****");
        System.out.println("Ingrese el nombre de la factura: ");
        String nombreFactura = entrada.nextLine();
        System.out.println("Ingrese el precio del producto 1: ");
        double precioPrimerProducto = entrada.nextDouble();
        System.out.println("Ingrese el precio del producto 2: ");
        double precioSegundoProducto = entrada.nextDouble();

        double montoTotalBruto = precioPrimerProducto + precioSegundoProducto;
        double montoTotalNeto = montoTotalBruto + (montoTotalBruto * impuesto);

        System.out.println("Factura " + nombreFactura + " \nMonto total bruto =  $" + montoTotalBruto + " \nImpuesto = " + (impuesto*100)  + "%\nMonto total neto = $" +montoTotalNeto);

    }

}