package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}