package ejerciciosclase;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        ///////////////// Calculadora de Tiempo /////////////

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos: ");
        int minutosTotales = entrada.nextInt();

        // Conversión a horas y minutos
        int horas = minutosTotales / 60;
        int minutosRestantes = minutosTotales % 60;

        System.out.println("Horas y minutos:");
        System.out.println(horas + " horas y " + minutosRestantes + " minutos");

        // Conversión a días, horas y minutos
        int dias = minutosTotales / (24 * 60);
        int horasRestantes = (minutosTotales % (24 * 60)) / 60;
        minutosRestantes = minutosTotales % 60;

        System.out.println("Días, horas y minutos:");
        System.out.println(dias + " días, " + horasRestantes + " horas y " + minutosRestantes + " minutos");

    }

}
