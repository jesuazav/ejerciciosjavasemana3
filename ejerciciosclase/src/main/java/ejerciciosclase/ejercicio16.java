package ejerciciosclase;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {

       ////////////// Operador Ternario ////////////

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        String validacionEdad = edad >= 18 ? "mayor de edad" : "menor de edad";
        System.out.println("El usuario es: " + validacionEdad);
        
        
        String resultado = numero > 0 ? "positivo" : (numero < 0 ? "negativo" : "cero");
        System.out.println("El número es " + resultado);
    }
    
}
