package metodos;

public class MasGrande {
    public static int valorMasGrande(int numero, int numero2){
        if (numero > numero2) {
            return numero;
        } else {
            return numero2;
        }

    }
    public static void main(String argv[]) {
        int numero = Utilidades.leerEntero("Introduce un número entero:");
        int numero2 = Utilidades.leerEntero("Introduce otro número entero:");

        System.out.println(valorMasGrande(numero, numero2));

    }
}
