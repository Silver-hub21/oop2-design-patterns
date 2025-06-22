package strategy;

import org.junit.jupiter.api.Test;
import strategy.ejercicio1.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvioTest {
    @Test
    public void testEcommerceColectivosSur() {
        // Arrange
        Cliente cliente = new Cliente("Juan", "Perez", Destinos.CAPITAL_FEDERAL); //+1000
        Carrito carrito = new Carrito(cliente);
        carrito.agregarProducto(new Producto("Producto 1", 100, 1));
        carrito.agregarProducto(new Producto("Producto 2", 200, 7)); // +500

        EnvioStrategy envioStrategy = new ColectivosSur();
        Ecommerce ecommerce = new Ecommerce(carrito, cliente, envioStrategy);

        // Act

        // Assert
        assertEquals(1500, ecommerce.calcularEnvio()); // Asumiendo que el costo de envío es fijo
        assertEquals(1800.0, ecommerce.calcularTotal()); // Precio total + envío
    }

    @Test
    public void testEcommerceCorreoArgentino() {
        // Arrange
        Cliente cliente = new Cliente("Ana", "Gomez", Destinos.GRAN_BUENOS_AIRES); //1300
        Carrito carrito = new Carrito(cliente);
        carrito.agregarProducto(new Producto("Producto A", 300, 2));
        carrito.agregarProducto(new Producto("Producto B", 300, 10)); // +600

        EnvioStrategy envioStrategy = new CorreoArgentino();
        Ecommerce ecommerce = new Ecommerce(carrito, cliente, envioStrategy);

        // Act

        // Assert
        assertEquals(1300.0, ecommerce.calcularEnvio()); // Asumiendo que el costo de envío es fijo
        assertEquals(1900.0, ecommerce.calcularTotal()); // Precio total + envío
    }
}
