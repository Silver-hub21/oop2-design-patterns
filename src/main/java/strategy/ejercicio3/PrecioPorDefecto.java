package strategy.ejercicio3;

public class PrecioPorDefecto implements CalcularPrecioStrategy {
    private static final double IMPUESTO = 0.15;

    @Override
    public double calcularPrecioFinal(Producto producto) {
        boolean envioGratis = producto.precio() > 200;
        double descuento = 0.0;
        if (producto.precio() > 50) {
            descuento = 0.05;
        }
        double total = producto.precio() * (1 + IMPUESTO) * (1 - descuento);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}