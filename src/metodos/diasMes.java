package metodos;

public class diasMes {
    public static String diaMes(int mes){
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return ("Tiene 31 días");
            case 2:
                return ("Tiene 29 días");
            default:
                return ("Tiene 30 días");
        }
    }

    public static void main(String[] args) {
        int mes = Utilidades.leerEntero("Introduce el número del mes");

        System.out.println(diaMes(mes));
    }
}
