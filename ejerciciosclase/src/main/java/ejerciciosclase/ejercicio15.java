package ejerciciosclase;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        /////////////// Calculadora de Descuento por Lealtad /////////////7

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los años como cliente: ");
        int añosCliente = entrada.nextInt();
        
        System.out.println("Ingrese el monto de la compra: ");
        double montoCompra = entrada.nextDouble();
        
        double descuento = 0;
        
        if (añosCliente >= 1 && añosCliente <= 2) {
            descuento = 0.05;
        } else if (añosCliente >= 3 && añosCliente <= 5) {
            descuento = 0.10;
        } else if (añosCliente > 5) {
            descuento = 0.15;
        }
        
        if (montoCompra > 500) {
            descuento += 0.05;
        }
        
        double totalPagar = montoCompra * (1 - descuento);
        System.out.printf("El total a pagar es: $ %.2f%n", totalPagar);
    }
    
}
