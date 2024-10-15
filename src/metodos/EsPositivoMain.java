package metodos;

public class EsPositivoMain {
    public static boolean EsPositivo(int numero){
        if (numero >= 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int numero = Utilidades.leerEntero("Introduce un número y te diré si es positivo o negativo");

        System.out.println(EsPositivo(numero));
    }
}
