package metodos;

public class EsTriangulo {
    public static boolean esTriangulo(int palo1, int palo2, int palo3){
        /*Version 1*/
        if ((palo3 > palo1 + palo2)
                || (palo2 > palo1 + palo3)
                || (palo1 > palo2 + palo3)){
            return false;
        }
        else {
            return true;
        }
        /*Version 2*/
        /*if (palo3 > palo1 + palo2){
            return false;
        } else if (palo2 > palo1 + palo3) {
            return false;
        } else if (palo1 > palo2 + palo3) {
            return false;
        } else {
            return true;
        }*/
    }
    public static void main(String[] args) {
        int palo1 = Utilidades.leerEntero("Longitud del primer palito");
        int palo2 = Utilidades.leerEntero("Longitud del segundo palito");
        int palo3 = Utilidades.leerEntero("Longitud del tercer palito");

        if (esTriangulo(palo1, palo2, palo3)){
            System.out.println("Si puedo");
        } else {
            System.out.println("No puedo");
        }

    }
}
