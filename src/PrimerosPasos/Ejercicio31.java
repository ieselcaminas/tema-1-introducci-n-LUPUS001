package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        //10 % i == 0, es divisor
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        sc.close();

        for (int i = 1; i < num; i++) { //si se divide entre 0 casca, no tira
            if (num % i == 0){
                System.out.println(num + " es divisible por " + i);
            }
        }

    }
}
