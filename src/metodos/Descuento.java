package metodos;

public class Descuento {

    public static double descuentoN (double precio, double precioRebajado){
        double descuento;
        descuento = (precio - precioRebajado) / precio * 100;

        return descuento;
    }
    public static void main(String[] args) {
        double precio = Utilidades.leerEntero("Introduce el precio real");
        double precioRebajado = Utilidades.leerEntero("Introduce el precio rebajado");
        double descuento;

        descuento = descuentoN(precio, precioRebajado);

        System.out.println("El descuento es del " + descuento + "%");
    }
}


