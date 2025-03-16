package ejerciciosclase;
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ////////////// Ejercicio 9 calificacion de una nota/////////////////
        /// 
        
        System.out.println("Ingrese una nota numerica del 1 al 100:");
        int nota=entrada.nextInt();
        if (nota>=90 && nota<=100) {
            System.out.println("Su calificacion corresponde a la letra A");
            
        } else if (nota>=80 && nota <=89) {
            System.out.println("Su calificacion corresponde a la letra B");
        } else if (nota>=70 && nota <=79) {
            System.out.println("Su calificacion corresponde a la letra C");
        }
        else if (nota>=60 && nota <=69) {
            System.out.println("Su calificacion corresponde a la letra D");
            
        }
        else if (nota>=0 && nota <=59) {
            System.out.println("Su calificacion corresponde a la letra F");
        }

        
    }
}
