package ejerciciosclase;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

         ////////////////////// calculadora simple/////////////////////////

         Scanner entrada = new Scanner(System.in);
           
        System.out.println("Ingrese uno de los siguientes operadores para realizar la operacion: +,-,*,/ ");
        String operator=entrada.nextLine();
        System.out.println("ingrese un numero");
        int num1=entrada.nextInt();
        System.out.println("Ingrese otro numero");
        int num2=entrada.nextInt();
        
        
        switch (operator) {
            case "+":
                int suma=num1+num2;
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case "-":
            int resta=num1-num2;
            System.out.println("El resultado de la resta es: " + resta);
        break;
        case "*":
            int mult=num1*num2;
            System.out.println("El resultado de la multiplicacion es: " + mult);
        break;
        case "/":
            int div=num1/num2;
            System.out.println("El resultado de la division es: " + div);
        break;
            default:
            System.out.println("Esa opcion no es valida");
                break;
        }
    }
    
}
