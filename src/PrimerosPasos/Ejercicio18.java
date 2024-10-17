package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int segundos;
        int minutos;
        int horas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Añada las horas");
        horas = sc.nextInt();
        System.out.println("Ahora los minutos");
        minutos = sc.nextInt();
        System.out.println("Finalmente los segundos");
        segundos = sc.nextInt();
        sc.close();

        segundos++;

        if (segundos >= 60){
            minutos++;
            segundos = 0;
            if (minutos >= 60){
                horas++;
                minutos = 0;
                if (horas >= 24){
                    horas = 0;
                }
            }
        }
        System.out.printf("%02d:%02d:%02d",horas,minutos,segundos);
    }
}
