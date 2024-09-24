package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String [] args){
        int num;

        System.out.println("Escribe un número y te daré su tabla de multiplicar");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num +" x "+ i  + " = " + (num * i));
        }
    }
}