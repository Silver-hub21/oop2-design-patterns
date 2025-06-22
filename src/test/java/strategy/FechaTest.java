package strategy;

import org.junit.jupiter.api.Test;
import strategy.ejercicio2.FechaCorta;
import strategy.ejercicio2.FechaLarga;
import strategy.ejercicio2.FechaStrategy;
import strategy.ejercicio2.Persona;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FechaTest {
    @Test
    public void fechaLargaTest() {
        FechaStrategy fecha = new FechaLarga();
        Persona p = new Persona(LocalDate.of(2002, 7, 19), fecha);
        assertEquals("Fecha larga: 19 de Julio de 2002", p.fechaNacimiento());
    }

    @Test
    public void fechaCortaTest() {
        FechaStrategy fecha = new FechaCorta();
        Persona p = new Persona(LocalDate.of(2003, 10, 30), fecha);
        assertEquals("Fecha: 30-10-2003", p.fechaNacimiento());
    }
}
