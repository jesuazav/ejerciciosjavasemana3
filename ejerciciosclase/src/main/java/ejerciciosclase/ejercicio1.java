package ejerciciosclase;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
        
        // Solicitar al usuario los números
        System.out.println("Ingrese el primer número (a): ");
        int a = entrada.nextInt();
        
        System.out.println("Ingrese el segundo número (b): ");
        int b = entrada.nextInt();
        
        // Comparación de números
        if (a > b) {
            System.out.println("El número " + a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println("El número " + b + " es mayor que " + a);
        } else {
            System.out.println("Los números son iguales.");
        }
        
        // Verificar si son diferentes
        if (a != b) {
            System.out.println("Los números son diferentes.");
        }
    }
}
