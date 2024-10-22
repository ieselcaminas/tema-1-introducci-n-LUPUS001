package metodos;

public class diasMes {
    public static int diaMes(int mes){
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        int mes = Utilidades.leerEntero("Introduce el número del mes");
        int dias;

        dias = diaMes(mes);
        if (dias == -1){
            System.out.println("El mes no existe");
        } else {
            System.out.println("El mes tiene " + dias + " días");
        }
    }

    //Otra opción de hacer el metodo
    /*public static String diaMes(int mes){
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
            case 4:
            case 6:
            case 9:
            case 11:
                return ("Tiene 30 días");
            default:
                return ("El mes no existe");
        }
    }*/
}
