package strategy.ejercicio3;

public class PrecioLibro implements CalcularPrecioStrategy {
    private static final double IMPUESTO = 0.1;
    private static final double DESCUENTO = 0.1;

    @Override
    public double calcularPrecioFinal(Producto producto) {
        boolean envioGratis = producto.precio() > 100;

        double total = producto.precio() * (1 + IMPUESTO) * (1 - DESCUENTO);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}