package strategy.ejercicio3;

public class PrecioMedicina implements CalcularPrecioStrategy {
    private static final double IMPUESTO = 0.0;

    @Override
    public double calcularPrecioFinal(Producto producto) {
        boolean envioGratis = producto.precio() > 100;
        double descuentos = 0.0;
        if (producto.precio() > 50) {
            descuentos = 0.1;
        }
        double total = producto.precio() * (1 + IMPUESTO) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}