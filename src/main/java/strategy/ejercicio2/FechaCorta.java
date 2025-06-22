package strategy.ejercicio2;

import java.time.LocalDate;

public class FechaCorta implements FechaStrategy {
    @Override
    public String mostrarFecha(LocalDate fecha) {
        return "Fecha: " + fecha.getDayOfMonth() + "-" + fecha.getMonthValue() + "-" + fecha.getYear();
    }
}
