package metodos;

public class ValorNotaMain {
    public static String convertirEnLetra(int nota) {
        String letra = "";
        if ((nota < 0) || (nota > 10)) {
            letra = ("Nota inválida");
        } else if (nota < 3) {
            letra = ("Muy deficiente");
        } else if (nota < 5) {
            letra = ("Insuficiente");
        } else if (nota < 6) {
            letra = ("Suficiente");
        } else if (nota < 7) {
            letra = ("bien");
        } else if (nota < 9) {
            letra = ("Notable");
        } else {
            letra = ("Sobresaliente");
        }
        return letra;
    }
    public static void main(String[] args) {
        int nota = Utilidades.leerEntero("Dame tu nota");

        /*String letra = convertirEnLetra(nota);
        System.out.println(letra);*/
        System.out.println("Tu nota es " + convertirEnLetra(nota));
    }
}
