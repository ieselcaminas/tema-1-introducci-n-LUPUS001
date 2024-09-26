package w3resource;

import java.util.Scanner;

public class Ej6_86 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = sc.nextInt();

        do {
            if (num % 2 == 0) {
                num /= 2;
            }else {
                num *= 3;
                num++;
            }
            System.out.println(num);
        } while(num != 1);
        System.out.println(num);
    }
}
//https://www.w3resource.com/java-exercises/basic/index.php