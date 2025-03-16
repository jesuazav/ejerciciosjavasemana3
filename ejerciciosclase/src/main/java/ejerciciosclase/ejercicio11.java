package ejerciciosclase;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        /////////////////////// Dia de la semana//////////////////////////////////

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 7 para saber a que dia de la semana corresponde: ");
        int dia = entrada.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Ese dia es lunes");

                break;
            case 2:
                System.out.println("Ese dia es martes");
                break;
            case 3:
                System.out.println("Ese dia es miercoles");
                break;
            case 4:
                System.out.println("Ese dia es jueves");
                break;
            case 5:
                System.out.println("Ese dia es viernes");
                break;
            case 6:
                System.out.println("Ese dia es sabado");
                break;
            case 7:
                System.out.println("Ese dia es domingo");
                break;

            default:
                System.out.println("Esa opcion no es valida");
                break;
        }
    }

}
