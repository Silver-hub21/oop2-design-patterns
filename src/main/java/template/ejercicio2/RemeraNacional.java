package template.ejercicio2;

public class RemeraNacional extends Remera {
    private static final double RECARGO_NACIONAL = 0.015; // 1.5% de recargo nacional
    private static final double IMPUESTO_NACIONAL = 0.00; // No hay impuesto adicional
    private static final double BONIFICACION_NACIONAL = 0.2; // 20% de bonificación nacional
    private static final double GANANCIA_NACIONAL = 0.15; // 15% de ganancia nacional

    public RemeraNacional(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double calcularRecargo(double precioTotal) {
        return precioTotal * RECARGO_NACIONAL;
    }

    @Override
    protected double calcularImpuesto(double precioTotal) {
        return precioTotal * IMPUESTO_NACIONAL;
    }

    @Override
    protected double calcularBonificacion(double precioTotal) {
        return precioTotal * BONIFICACION_NACIONAL;
    }

    @Override
    protected double calcularGanancia(double precioTotal) {
        return precioTotal * GANANCIA_NACIONAL;
    }
}
