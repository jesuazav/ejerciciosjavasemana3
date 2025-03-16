package ejerciciosclase;

import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        ////////////////////////Ejercicio 6 conversor de temperatura//////////////////////////////
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en celcius");
        double tc=entrada.nextDouble();
        System.out.println("Ingrese una temperatura en fahrenheit");
        double tf=entrada.nextDouble();
        
        double fahrenheit=(tc*9/5)+32;
        double celcius=(tf-32)*5/9;
        System.out.println("Aqui tienes tu conversion equivalente en la escala de Celsius: " + celcius+"°C");
        System.out.println("Aqui tienes tu conversion equivalente en la escala de Fahrenheit: " + fahrenheit+"°F");
    }
    
}
