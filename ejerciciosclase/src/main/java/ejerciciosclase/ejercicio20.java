package ejerciciosclase;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {

        ///////////// Validador de Triángulo //////////////

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triángulo: ");
        double lado1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo lado del triángulo: ");
        double lado2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer lado del triángulo: ");
        double lado3 = entrada.nextDouble();
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Las longitudes ingresadas no forman un triángulo.");
        }
    }
    
}
