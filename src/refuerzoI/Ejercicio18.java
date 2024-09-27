package refuerzoI;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        n = sc.nextInt();
        if (n % 2 == 0) {
            for (int i = 0; i < 5; i++) {
                n += 2;
                System.out.println(n);
            }
        } else {
            n ++;
            System.out.println(n);
            for (int i = 0; i < 4; i++) {
                n += 2;
                System.out.println(n);
            }
        }
    }
}
