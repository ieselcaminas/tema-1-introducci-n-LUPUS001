package refuerzoI;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int t = sc.nextInt();

        int horas = t / 3600;
        int min = t % 3600 / 60; //el resto es lo que sobra al dividir "t" entre 3600 y al dividir el resultado entre 60 nos darán los minutos
        int seg = t % 60;

     /*   System.out.println(t % 3600);
        System.out.println(min);
        System.out.println(seg);*/

       /* System.out.println("Horas: " + (t / 60) / 60 + " Minutos: " + t / 60 +" Segundos: " + t);
        System.out.println("Segundos: " + t);
        System.out.println("Minutos: " + t / 3600);
        System.out.println("Minutos: " + t % 3600);*/
       /* System.out.println("Horas: " + t % 3600);
        System.out.println("Minutos: " + t % 60);
        System.out.println("Segundos: " + t % 60);*/

        System.out.printf("horas: %d, minutos: %d, segundos: %d", horas, min, seg);



    }
}