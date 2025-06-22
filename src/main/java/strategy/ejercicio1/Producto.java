package strategy.ejercicio1;

public class Producto {
    private String nombre;
    private double precio;
    private double peso;

    public Producto(String nombre, double precio, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
    }


    public double peso() {
        return this.peso;
    }

    public double precio() {
        return this.precio;
    }
}
