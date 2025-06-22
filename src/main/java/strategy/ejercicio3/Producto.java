package strategy.ejercicio3;

public class Producto {
    private TipoProducto tipo;
    private double precio;
    private CalcularPrecioStrategy calcularPrecioStrategy;


    public Producto(TipoProducto tipo, double precio, CalcularPrecioStrategy calcularPrecioStrategy) {
        this.tipo = tipo;
        this.precio = precio;
        this.calcularPrecioStrategy = calcularPrecioStrategy;
    }

    public double precioFinal() {
        return calcularPrecioStrategy.calcularPrecioFinal(this);
    }

    public TipoProducto tipo() {
        return tipo;
    }

    public double precio() {
        return precio;
    }
}
