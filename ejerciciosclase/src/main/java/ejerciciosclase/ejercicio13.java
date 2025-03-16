package ejerciciosclase;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

        ///////////// Calculadora de Préstamo ////////////////

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto del préstamo: ");
        double L = entrada.nextDouble();
        
        System.out.println("Ingrese la tasa de interés anual (en porcentaje): ");
        double tasaAnual = entrada.nextDouble();
        double c = (tasaAnual / 100)/12; // Convertir a tasa mensual
        
        System.out.println("Ingrese el número de años del préstamo: ");
        int años = entrada.nextInt();
        int n = años * 12; // Número total de pagos

        double P = L*(c*Math.pow(1+c, n))/((Math.pow(1+c, n))-1);
        System.out.printf("El pago mensual es: $ %.2f%n", P);
       
    }
}
