package ejerciciosclase;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {

        ///////////////// Verificadpr de Año Bisiesto //////////////////

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un año para verificar si es bisiesto: ");

        int año = entrada.nextInt();
        
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
        
    }
    
}
