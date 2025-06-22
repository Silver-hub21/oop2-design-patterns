package strategy.ejercicio1;

public class Cliente {
    private String nombre;
    private String apellido;
    private Carrito carrito;
    private Destinos ubicacion;

    public Cliente(String nombre, String apellido, Destinos ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ubicacion = ubicacion;
    }

    public Destinos ubicacion() {
        return this.ubicacion;
    }
}
