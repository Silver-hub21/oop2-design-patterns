package decorator.ejercicio2;

public class Familiar implements Combo {
    private String descripcion;
    private static final double PRECIO_BASE = 100.0; // Precio base para el combo familiar
    private double precio;


    public Familiar(String descripcion) {
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
