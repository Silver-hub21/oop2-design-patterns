package composite;

import composite.ejercicio3.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeguroTest {

    @Test
    public void paqueteDeSeguroIndividual() {
        var seguro1 = new Seguro("Seguro de Vida", "Cobertura de vida", 100.0, 12);
        var paquete = new PaqueteSeguro("Paquete de Seguros", "Incluye varios seguros", 6);
        paquete.agregarSubSeguro(seguro1);
        assertEquals(95.0, paquete.costoTotal(), 0.01);
    }

    @Test
    public void paqueteDeSegurosConVariosSeguros() {
        var seguro1 = new Seguro("Seguro de Vida", "Cobertura de vida", 100.0, 12);
        var seguro2 = new Seguro("Seguro de Salud", "Cobertura de salud", 200.0, 12);
        var paquete = new PaqueteSeguro("Paquete de Seguros", "Incluye varios seguros", 6);
        paquete.agregarSubSeguro(seguro1);
        paquete.agregarSubSeguro(seguro2);
        assertEquals(270.0, paquete.costoTotal(), 0.01); // (100 + 200) * 0.95
    }
}
