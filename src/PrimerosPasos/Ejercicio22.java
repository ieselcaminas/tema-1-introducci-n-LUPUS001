package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int num;
        int positivos = 0; //le damos valor , porque en el for each no le podamos dar valor a nada, por eso le damos el valor de 0

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 números");

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();

            if (num >= 0){
                positivos++;
            }
        }
        System.out.printf("Hay %d números positivos %n", positivos);

    }
}
