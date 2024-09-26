package w3resource;

import java.util.Scanner;

public class Ej2_153 {
    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextDouble();

        if (num1 >= 0.0 && num1 <= 1.0 && num2 >= 0.0 && num2 <= 1.0){
            System.out.println("FALSE");
        }else {
            System.out.println("FALSE");
        }

        //los decimales cuando los escribimos en Scanner se ponen con coma
    }
}
