package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        double num;
        double media = 0;
        boolean hayUnDiez = false;
        int cantidad = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("**Añada TODAS sus notas para poder extraer la MEDIA**");
        System.out.println("Introduzca -1 para terminar\n");

        //Con esta versión al no poder un condicional -1 le restaria a la media y se sumaria a la cantidad por lo que pasaria de 15 / 3 a 14 / 4
        /*do{
           num = sc.nextDouble();
           media += num;
           cantidad++;
           if (num == 10) {
               hayUnDiez = true;
           }
        }while(num != -1);*/

        do{
            num = sc.nextDouble();
            if (num != -1 ){ //y para no caer en el error mencionado hacemos este if
                media += num;
                cantidad++;
            }
            if (num == 10) {
                hayUnDiez = true;
            }
        }while(num != -1);

        if (cantidad > 0) {
            System.out.printf("La nota media es %.1f%n", media / cantidad);
        } else {
            System.out.println("No se introdujeron notas válidas.");
        }
        if (hayUnDiez){
            System.out.println("Hay un 10");
        }

    }
}
