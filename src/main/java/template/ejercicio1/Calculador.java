package template.ejercicio1;

import static java.time.LocalDate.now;

public abstract class Calculador {
    //    private LogTransaction log; lo reemplazo por un sysout
    private int mesEnPromocion;


    public final double calcularPrecio(double precioProducto) {
        double precioTotal = 0.0;
        precioTotal += this.calcularPrecioFinal(precioProducto, this.mesEnPromocion);
        return precioTotal;
    }

    public abstract double calcularPrecioFinal(double precioProducto, int mesEnPromocion);

    public void setMesEnPromocion(int i) {
        this.mesEnPromocion = i;
    }
}

