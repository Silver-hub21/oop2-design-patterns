package decorator.ejercicio2;

public class Basico implements Combo {
    private String descripcion;
    private static final double PRECIO_BASE = 50.0; // Precio base para el combo básico
    private double precio;

    public Basico(String descripcion) {
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
