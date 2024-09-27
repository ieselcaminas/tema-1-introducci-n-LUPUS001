package refuerzoI;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        int hojas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las hojas");
        hojas = sc.nextInt();
        if (hojas < 3){
            System.out.println("IMPOSIBLE");
        }
        else{
            System.out.println(hojas / 4);
        }
    }
}
//https://aceptaelreto.com/problem/statement.php?id=241&cat=5