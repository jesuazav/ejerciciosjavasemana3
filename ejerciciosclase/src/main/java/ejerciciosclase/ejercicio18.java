package ejerciciosclase;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {

        //////////// Verificador de Múltiplos ///////////

        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un número para verificar múltiplos: ");
        int numMultiplo = entrada.nextInt();

        
        boolean multiplo2 = numMultiplo % 2 == 0;
        boolean multiplo3 = numMultiplo % 3 == 0;
        boolean multiplo5 = numMultiplo % 5 == 0;
        
        System.out.println("El número " + numMultiplo );
        if (multiplo2) System.out.println("Es múltiplo de: - 2");
        if (multiplo3) System.out.println("Es múltiplo de: - 3");
        if (multiplo5) System.out.println("Es múltiplo de: - 5");
        if (!multiplo2 && !multiplo3 && !multiplo5) System.out.println("No es múltiplo de 2, de 3 ni de 5.");
       
    }
    
}
