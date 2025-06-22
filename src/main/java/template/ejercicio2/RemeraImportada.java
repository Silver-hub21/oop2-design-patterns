package template.ejercicio2;

public class RemeraImportada extends Remera {
    private static final double RECARGO_IMPORTACION = 0.03; // 3% de recargo por importación
    private static final double IMPUESTO_IMPORTACION = 0.05; // impuesto del 5% por importación
    private static final double BONIFICACION_IMPORTACION = 0.00; // No hay bonificación
    private static final double GANANCIA_IMPORTACION = 0.25; // Ganancia del 25% por importación

    public RemeraImportada(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double calcularRecargo(double precioTotal) {
        return precioTotal * RECARGO_IMPORTACION;
    }

    @Override
    protected double calcularImpuesto(double precioTotal) {
        return precioTotal * IMPUESTO_IMPORTACION;
    }

    @Override
    protected double calcularBonificacion(double precioTotal) {
        return precioTotal * BONIFICACION_IMPORTACION;
    }

    @Override
    protected double calcularGanancia(double precioTotal) {
        return precioTotal * GANANCIA_IMPORTACION;
    }
}
