package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num1 = sc.nextInt();

        System.out.println("Ingrese un numero: ");
        num2 = sc.nextInt();

        //si ponemos num1=10 y num2=3 nos dará su resto el cuál será 1
        do {
            num1 -= num2;
        } while(num1 >= num2);

        System.out.println(num1);
        //ya que num1(10) - num2(3) = 7 - num2(3) = 4 - num2(3) = 1 (resto)
    }
}
