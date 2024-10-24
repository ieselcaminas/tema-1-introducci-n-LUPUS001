package metodos;

public class letraNota {
    public static String notaTexto(double nota){
        if (nota >= 0 && nota < 3){
            return "Muy deficiente";
        } else if (nota >= 3 && nota < 5){
            return "Insuficiente";
        } else if (nota >= 5 && nota < 6){
            return "Suficiente";
        } else if (nota >= 6 && nota < 7){
            return "Bien";
        } else if (nota >= 7 && nota < 9){
            return "Notable";
        } else if (nota >= 9 && nota <= 10){
            return "Sobresaliente";
        } else{
            return "Has introducido una nota equivocada";
        }
    }

    public static void main(String[] args) {
        double nota = Utilidades.leerDoble("Introduce la nota de tu examen");

        System.out.println(notaTexto(nota));
    }
}
