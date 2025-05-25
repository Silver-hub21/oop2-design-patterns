import composite.ejercicio1.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {

    @Test
    public void testSalarioTotal() {
        var empleado = new EmpleadoRegular("Juan", "Pérez", 1000);
        var lider = new LiderProyecto("Lucas", "Hernandez", 2000, new ArrayList<>());
        var mandoMedio = new MandoMedio("Pedro", "Gonzalez", 3000, new ArrayList<>());
        var gerente = new Gerente("Luis", "Martinez", 5000, new ArrayList<>());
        var director = new Director("Juan", "Pérez", 10000, new ArrayList<>());

        lider.addSubEmpleado(empleado);
        mandoMedio.addSubEmpleado(lider);
        gerente.addSubEmpleado(mandoMedio);
        director.addSubEmpleado(gerente);

        assertEquals(21000, director.calcularSalarioTotal());
    }

    @Test
    public void testEmpleadoSinSubordinados() {
        var empleado = new EmpleadoRegular("Maria", "Suarez", 1500);
        assertEquals(1500, empleado.calcularSalarioTotal());
    }

}
