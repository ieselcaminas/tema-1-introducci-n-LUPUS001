package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        String binario;
        int decimal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número binario");
        binario = sc.nextLine();

        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1'){
                int calcular = (int )Math.pow(2, (binario.length() - i - 1));
                decimal += calcular;
            }
        }
        System.out.println(decimal);
    }
}
/*
Para 11001, sería así:
- \(1 \times 2^4\) (16)
- \(1 \times 2^3\) (8)
- \(0 \times 2^2\) (0)
- \(0 \times 2^1\) (0)
- \(1 \times 2^0\) (1)

3. Suma los valores: Ahora suma todos los resultados:
- \(16 + 8 + 0 + 0 + 1 = 25\)*/

//V1
/*for (int i = 0; i < binario.length(); i++) {
            binario.charAt(i);
            int calcular = (int )Math.pow(i, 2);
            decimal += calcular;
            System.out.println(decimal);
        }*/

//V2.1
/*for (int i = binario.length() - 1; i >= 0; i--) {
            System.out.println(binario.charAt(i));
            if (binario.charAt(i) == '1'){
                int calcular = (int )Math.pow(2, i);
                decimal += calcular;
            }
        }
        System.out.println(decimal);*/

//V2.2
/*for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) == '1'){
                int calcular = (int )Math.pow(2, i);
                decimal += calcular;
            }
        }
        System.out.println(decimal);*/

