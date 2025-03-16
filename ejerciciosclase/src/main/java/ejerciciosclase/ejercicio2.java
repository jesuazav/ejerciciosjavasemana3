package ejerciciosclase;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Ingrese un número para verificar si es par o impar: ");
        int num = entrada.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }
    }
}
