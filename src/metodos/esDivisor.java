package metodos;

public class esDivisor {
    public static String totalDivisores(int num){
        String divisores = "";
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                divisores += i + ", ";
            }
        }
        return divisores;
    }
    public static void main(String[] args) {
        int num = Utilidades.leerEntero("Introduce un número y te diré sus divisores");

        System.out.println(totalDivisores(num));
    }
}

