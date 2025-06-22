package template.ejercicio1;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {

    private int mesEnPromocion;

    @Override
    public double calcularPrecioFinal(double precioProducto, int mesEnPromocion) {
        System.out.println("Calculando precio para no jubilado: ");
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioProducto += precioProducto * 0.15;
        } else {
            precioProducto += precioProducto * 0.21;
        }
        return precioProducto;
    }
}
