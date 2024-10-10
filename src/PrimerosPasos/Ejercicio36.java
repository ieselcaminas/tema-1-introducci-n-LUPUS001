package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        int decimal;
        int resto;
        String binario = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero (máximo 255)");
        decimal = sc.nextInt();

        System.out.print("El número " + decimal);
        do {
            resto = decimal % 2;
            decimal = decimal / 2;
            binario = resto + binario;
        } while (decimal != 0);

        System.out.println(" pasado a binario es: " + binario);
    }

    /*
- 50 ÷ 2 = 25, residuo 0
- 25 ÷ 2 = 12, residuo 1
- 12 ÷ 2 = 6, residuo 0
- 6 ÷ 2 = 3, residuo 0
- 3 ÷ 2 = 1, residuo 1
- 1 ÷ 2 = 0, residuo 1*/
    //110010
}
