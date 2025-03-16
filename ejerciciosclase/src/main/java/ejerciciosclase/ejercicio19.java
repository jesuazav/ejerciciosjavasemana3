package ejerciciosclase;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {

       ////////////// Calculadora de Notas Ponderadas /////////////

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la nota de exámenes: ");
        double examenes = entrada.nextDouble();
        
        System.out.println("Ingrese la nota de proyectos: ");
        double proyectos = entrada.nextDouble();
        
        System.out.println("Ingrese la nota de tareas: ");
        double tareas = entrada.nextDouble();
        
        System.out.println("Ingrese la nota de participación: ");
        double participacion = entrada.nextDouble();
        
        double notaFinal = (examenes * 0.4) + (proyectos * 0.3) + (tareas * 0.2) + (participacion * 0.1);
        System.out.printf("La nota final del curso es: %.2f%n", notaFinal);
    }
}
