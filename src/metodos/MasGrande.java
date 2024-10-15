package metodos;

public class MasGrande {
    public static int valorMasGrande(int numero, int numero2, int numero3){
        if (numero > numero2 && numero > numero3){
            return numero;
        } else if (numero2 > numero3 && numero2 > numero){
            return numero2;
        } else {
            return numero3;
        }
    }

    public static void main(String[] args) {
        int numero = Utilidades.leerEntero("Introduce un número entero");
        int numero2 = Utilidades.leerEntero("Introduce otro número entero");
        int numero3 = Utilidades.leerEntero("Introduce el último entero");

        System.out.println("El valor más grande es " + valorMasGrande(numero, numero2, numero3));
    }
}
