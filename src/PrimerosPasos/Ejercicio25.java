package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        long factorial = 1;
        int num ;

        System.out.println("Dame un número y calculare su factorial");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) { //importante darle a "i" el valor de 1, porque sino no nos dará ningún resultado
            factorial = factorial * i;
        }

        System.out.printf("El factorial de %d es %d",num,factorial);
    }
}
