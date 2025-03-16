package ejerciciosclase;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        ///////////////////// Calculadora de IMC //////////////////////////

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos");
        double peso = entrada.nextDouble();
        System.out.println("Ingrese su altura en metros");
        double altura = entrada.nextDouble();
        double imc = ((peso) / (altura * altura));
        if (imc < 18.5) {
            System.out.printf("Su IMC es: %.2f%nIndica:Bajo peso ", imc);

        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Su IMC es: %.2f%nIndica: Peso normal", imc);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("Su IMC es: %.2f%nIndica: Sobrepeso", imc);
        } else if (imc >= 30) {
            System.out.printf("Su IMC es: %.2f%nIndica: Obesidad", imc);
        }
    }
}
