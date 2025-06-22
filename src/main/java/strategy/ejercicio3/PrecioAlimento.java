package strategy.ejercicio3;

public class PrecioAlimento implements CalcularPrecioStrategy {
    private static final double IMPUESTO = 0.05;

    @Override
    public double calcularPrecioFinal(Producto producto) {
        double descuento = 0.0;
        boolean envioGratis = producto.precio() > 200;

        if (producto.precio() > 100) {
            descuento = 0.15;
        }

        double total = producto.precio() * (1 + IMPUESTO) * (1 - descuento);
        if (envioGratis) {
            total -= 5; // Descuento de 5 por envío gratis
        }
        return total;
    }
}
