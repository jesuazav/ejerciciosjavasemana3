package ejerciciosclase;

import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        //////////////////////// Conversor de temperatura//////////////////////////////
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en celcius");
        double tc=entrada.nextDouble();
        System.out.println("Ingrese una temperatura en fahrenheit");
        double tf=entrada.nextDouble();
        
        double fahrenheit=(tc*9/5)+32;
        double celcius=(tf-32)*5/9;
        System.out.printf("Aqui tienes tu conversion equivalente en la escala de Celsius:  °C %.2f%n",celcius);
        System.out.printf("Aqui tienes tu conversion equivalente en la escala de Fahrenheit: °F %.2f%n  ",fahrenheit);
        
    
    }
    
}
