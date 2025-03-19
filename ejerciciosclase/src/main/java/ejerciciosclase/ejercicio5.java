package ejerciciosclase;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        
        ///////// Verificador de numero /////////////

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero=entrada.nextInt();

        if(numero>0){
            System.out.println("Ese es un numero positivo");
            int par=numero%2;
            if (par==0) {
                System.out.println("Ese numero es par");
            }
            else{
                System.out.println("Ese numero es impar");
            }
        } else if(numero==0){
            System.out.println("Ese numero es cero");
        }
        else{
            System.out.println("Ese es un numero negativo");
            int par=numero%2;
            if (par==0) {
                System.out.println("Ese numero es par");
            }
            else{
                System.out.println("Ese numero es impar");
            }
        
    }
}
}
