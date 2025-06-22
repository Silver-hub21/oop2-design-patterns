package strategy.ejercicio2;

import java.time.LocalDate;

public class Persona {
    private LocalDate fechaNacimiento;
    private FechaStrategy estrategiaFecha;

    public Persona(LocalDate fechaNacimiento, FechaStrategy estrategiaFecha) {
        this.fechaNacimiento = fechaNacimiento;
        this.estrategiaFecha = estrategiaFecha;
    }

    public String fechaNacimiento() {
        return estrategiaFecha.mostrarFecha(this.fechaNacimiento);
    }
}
