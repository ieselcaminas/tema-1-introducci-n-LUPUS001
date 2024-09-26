package w3resource;

import java.util.Scanner;

public class Ej3_33 {
    public static void main(String[] args) {
        int num;
        int digito;
        int suma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = sc.nextInt();

        do{
            digito = num % 10;
            suma += digito;
            num = num / 10;

        }while (num > 0);/*V1*/  //while (num > 10);/*V1*/
        System.out.println(suma);/*V1*/
        //System.out.println(suma + num);/*V2*/
    }
}
//https://www.w3resource.com/java-exercises/basic/index.php