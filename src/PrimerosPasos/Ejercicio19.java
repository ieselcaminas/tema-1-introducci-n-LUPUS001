package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        double horas;
        double precioHora;
        double impuestos = 0;
        double salarioBruto;
        Scanner sc = new Scanner(System.in);

        //las horas trabajadas
        System.out.println("¿Cuantas horas ha trabajado?");
        horas = sc.nextDouble();

        //lo que pagan por hora trabajada (Ej: 35€ por hora)
        System.out.println("¿Y a cuánto pagan la hora?");
        precioHora = sc.nextDouble();

        sc.close();

        //para calcular el plus de dinero por horas extras/el pago bruto.
        if (horas <= 35){
            salarioBruto = precioHora * horas;
            //es necesario crear este if, para poder calcular el plus de dinero que ganamos en las horas extras
        } else {
            salarioBruto = 35 * precioHora + (horas - 35) * precioHora * 1.5;
            //35 * precioHora | Con esto aseguramos obtener el valor de las primeras 35 horas sin el incremento/el plus del 50% (1.5) [para los siguientes ejemplos digamos que son 10€ por hora]
            //horas - 35 | con esto calculamos las horas extras, si hubieramos trabajado 40 horas:(Ej: horas - 35 = 40 - 35 = 5 horas extras)
        }   //(horas - 35) * precioHora * 1.5 | aqui es donde a las 5 horas extras, les pagamos el incremento del 50% (1.5)
        //EJ: 5 * 10 * 1.5 = 75€ | 5(horas extra) * 10(euros por hora) * 1.5 (incremento del 50%) = 75€
        //Finalmente podemos sumar a las primeras 35 horas (35 * 10 = 350) el incremento de las horas extra (75€) por lo que será (350 + 75 = 425€)

        //calcular los impuestos
        if (salarioBruto <= 500){
            impuestos = 0; //aqui no pagamos nada de impuestos
        } else if (salarioBruto <= 900) {
            impuestos = (salarioBruto - 500) * 0.25; //le restamos 500 para solo pagar los impuestos en los 400 euros restantes
        } else {
            impuestos = 400 * 0.25 + (salarioBruto - 900) * 0.45;
            //tenemos que volver a calcular los impuestos de los 400€ anteriores (ya que el else no comparte operación con el else-if)
            // y a esto le sumamos los impuestos del 45% que quedarán al restar los primeros 900€, los cuales ya hemos calculado y multiplicarlo por 0.45 para sacar el 45%
        }

        //double salarioNeto = salarioBruto - impuestos;

        System.out.println("Pago Bruto: " + salarioBruto);
        System.out.println("Salario neto: " + (salarioBruto - impuestos));
        System.out.println("Impuestos: " + impuestos);


    }
}
