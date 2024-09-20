package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        float nota;
        float media = 0;
        float suma = 0;
        boolean esDiez = false;

        System.out.println("INGRESE SUS NOTAS");
        Scanner sc = new Scanner(System.in);

        do {
            nota = sc.nextInt();
            if (nota != -1){
                suma += nota;
                media++;
                if (nota == 10){
                    esDiez = true;
                }
            }

        } while(nota != -1);
        if (esDiez == true){
            System.out.println("La nota media es " + String.format("%.1f",(suma / media)) + " y había un 10");
        } else {
            System.out.println("La nota media es " + String.format("%.1f",(suma / media)) + " y NO había un 10");
        }
    }
}
