package strategy.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;
    private Cliente cliente;

    public Carrito(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
    }


    public List<Producto> getProductos() {
        return productos;
    }

    public double pesoTotal() {
        double pesoTotal = 0;
        for (Producto producto : productos) {
            pesoTotal += producto.peso();
        }
        return pesoTotal;
    }

    public double precioTotal() {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.precio();
        }
        return precioTotal;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
}
