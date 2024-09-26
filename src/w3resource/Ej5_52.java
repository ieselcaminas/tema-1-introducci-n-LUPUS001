package w3resource;

import java.util.Scanner;

public class Ej5_52 {
    public static void main(String[] args) {
        int num;
        int num2;
        int num3;
        boolean siono;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
        System.out.println("Finalmente ingrese el tercer numero");
        num3 = sc.nextInt();

        siono = num + num2 == num3;
        System.out.println("Resultado es: " + siono);


        /*if (num + num2 == num3){
            System.out.println("El resultado es: correcto");
        } else {
            System.out.println("El resultado es: incorrecto");
        }*/
    }
}
//https://www.w3resource.com/java-exercises/basic/index.php