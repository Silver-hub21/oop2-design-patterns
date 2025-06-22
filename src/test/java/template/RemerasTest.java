package template;

import org.junit.jupiter.api.Test;
import template.ejercicio2.Remera;
import template.ejercicio2.RemeraImportada;
import template.ejercicio2.RemeraNacional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemerasTest {
    @Test
    public void precioRemeraNacional() {
        Remera remeraNacional = new RemeraNacional(1000);
        assertEquals(1365, remeraNacional.calcularPrecioDeVenta(), 0.01);
    }

    @Test
    public void precioRemeraImportada() {
        Remera remeraImportada = new RemeraImportada(1000);
        assertEquals(1330, remeraImportada.calcularPrecioDeVenta(), 0.01);
    }
}
