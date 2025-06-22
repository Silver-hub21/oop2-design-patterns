package strategy.ejercicio1;

public class Ecommerce {
    private Carrito carrito;
    private Cliente cliente;
    private EnvioStrategy envioStrategy;

    public Ecommerce(Carrito carrito, Cliente cliente, EnvioStrategy envioStrategy) {
        this.carrito = carrito;
        this.cliente = cliente;
        this.envioStrategy = envioStrategy;
    }

    public double calcularEnvio() {
        return envioStrategy.calcularEnvio(carrito, cliente.ubicacion());
    }

    public double calcularTotal() {
        return carrito.precioTotal() + calcularEnvio();
    }
}
