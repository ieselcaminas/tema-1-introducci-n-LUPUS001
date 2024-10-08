package refuerzoI;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        double metros;
        double velocidad;
        double km;
        double segundos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la distancia entre los radares");
        metros = sc.nextDouble();
        System.out.println("Escriba la velocidad máxima");
        km = sc.nextDouble();
        System.out.println("Escriba el tiempo de intervalo");
        segundos = sc.nextDouble();

        metros = metros / 1000;
        segundos = segundos / 3600;
        velocidad = metros / segundos;

        if (velocidad > km ){
            System.out.println("MULTA");
        } else {
            System.out.println("OK");
        }
    }
}
//https://aceptaelreto.com/problem/statement.php?id=112&cat=5

/*9165 metros
110 kilometro por hora
300 segundos*/