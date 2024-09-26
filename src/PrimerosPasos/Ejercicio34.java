package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num1 = sc.nextInt();

        System.out.println("Ingrese un numero: ");
        num2 = sc.nextInt();

        for (int i = 0; i < num2; i++) {
            total += num1;
        }
        System.out.printf("%d x %d = %d ", num1, num2, total);

    }
}
