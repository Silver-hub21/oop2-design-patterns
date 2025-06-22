package template.ejercicio1;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {

    @Override
    public double calcularPrecioFinal(double precioProducto, int mesEnPromocion) {
        System.out.println("Calculando precio para jubilado: ");
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            precioProducto += precioProducto * 0.1;
        }
        return precioProducto;
    }
}
