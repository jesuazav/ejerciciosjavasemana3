package ejerciciosclase;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        //////////////////////// Categoria de edad//////////////////
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad=entrada.nextInt();
        if(edad>=0 && edad<=2){
            System.out.println("Su edad es: "+ edad + "años, eso indica que ud es un bebe");
        }else if (edad>=3 && edad<=12) {
            System.out.println("Su edad es: "+ edad + " años, eso indica que ud es un niño");
        }else if (edad>=13 && edad<=19) {
            System.out.println("Su edad es: "+ edad + " años, eso indica que ud es un adolescente");
        }else if (edad>=20 && edad<=64) {
            System.out.println("Su edad es: "+ edad + " años, eso indica que ud es un adulto");
        }else if (edad>=65 ) {
            System.out.println("Su edad es: "+ edad + " años, eso indica que ud es un adulto mayor");

        }

    }
}
