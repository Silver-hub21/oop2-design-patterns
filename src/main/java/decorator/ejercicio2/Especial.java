package decorator.ejercicio2;

public class Especial implements Combo {
    private String descripcion;
    private static final double PRECIO_BASE = 150.0; // Precio base para el combo especial
    private double precio;

    public Especial(String descripcion) {
        this.descripcion = descripcion;
        this.precio = PRECIO_BASE;
    }

    @Override
    public String descripcion() {
        return this.descripcion;
    }

    @Override
    public double precio() {
        return this.precio;
    }
}
