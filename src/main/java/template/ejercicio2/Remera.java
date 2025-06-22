package template.ejercicio2;

public abstract class Remera {
    private double precioUnitario;

    public Remera(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public final double calcularPrecioDeVenta() {
        double precioTotal = precioUnitario + calcularRecargo(precioUnitario) + calcularImpuesto(precioUnitario) +
                calcularBonificacion(precioUnitario) + calcularGanancia(precioUnitario);
        return precioTotal;
    }

    protected abstract double calcularRecargo(double precioTotal);

    protected abstract double calcularImpuesto(double precioTotal);

    protected abstract double calcularBonificacion(double precioTotal);

    protected abstract double calcularGanancia(double precioTotal);


}
