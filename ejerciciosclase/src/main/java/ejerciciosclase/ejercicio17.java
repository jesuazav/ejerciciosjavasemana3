package ejerciciosclase;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        double num3 = entrada.nextDouble();
        
        double suma = num1 + num2 + num3;
        double multiplicacion = num1 * num2 * num3;
        double promedio = suma / 3.0;
        
        System.out.printf("Suma: %.2f%n", suma);
        System.out.printf("Multiplicación: %.2f%n", multiplicacion);
        System.out.printf("Promedio: %.2f%n", promedio);
        if (promedio >suma) {
            System.out.println("El promedio es mayor que la suma");
            
        } else System.out.println("El promedio es menor que la suma");
        
    }
}
