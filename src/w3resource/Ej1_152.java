package w3resource;

import java.util.Scanner;

public class Ej1_152 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();

        System.out.println("Ingrese el tercer numero");
        num3 = sc.nextInt();

        System.out.println("Ingrese el quarto numero");
        num4 = sc.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
        //if (num1 - num2 == 0 && num2 - num3 == 0 && num3 - num4 == 0 ) {
            System.out.println("EQUAL, los 4 números son iguales");
        } else{
            System.out.println("NOT EQUALS, no son iguales");
        }

    }
}
//https://www.w3resource.com/java-exercises/basic/index1.php