package PrimerosPasos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Random aleatorio = new Random(System.currentTimeMillis());
        // Producir nuevo int aleatorio entre 0 y 99
        int secreto = aleatorio.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Dame un número entre 1 y 100");

        do {
            num = sc.nextInt();
            if (num == -1){
                System.out.println("Se rinde");
                break;
            }
            else if (secreto == num){
                System.out.println("Has ganado");
                System.out.println("\n\n");
                System.out.println("CONGRATULATIONS");
                break;
            } else if (secreto < num){
                System.out.println("El número secreto es más pequeño");
                System.out.println("INTRODUCE OTRO NÚMERO");
            } else {
                System.out.println("El número secreto es más grande");
                System.out.println("INTRODUCE OTRO NÚMERO");
            }
        } while (true); //poniendo while true hace que el código siga ejecutándose hasta que haya un break

        //while (num != secreto);

    }
}
