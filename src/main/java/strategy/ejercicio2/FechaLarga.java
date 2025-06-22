package strategy.ejercicio2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;

public class FechaLarga implements FechaStrategy {

    private static final Map<Month, String> meses = Map.ofEntries(
            Map.entry(Month.JANUARY, "Enero"),
            Map.entry(Month.FEBRUARY, "Febrero"),
            Map.entry(Month.MARCH, "Marzo"),
            Map.entry(Month.APRIL, "Abril"),
            Map.entry(Month.MAY, "Mayo"),
            Map.entry(Month.JUNE, "Junio"),
            Map.entry(Month.JULY, "Julio"),
            Map.entry(Month.AUGUST, "Agosto"),
            Map.entry(Month.SEPTEMBER, "Septiembre"),
            Map.entry(Month.OCTOBER, "Octubre"),
            Map.entry(Month.NOVEMBER, "Noviembre"),
            Map.entry(Month.DECEMBER, "Diciembre")
    );

    @Override
    public String mostrarFecha(LocalDate fecha) {
        return "Fecha larga: " + fecha.getDayOfMonth() + " de " +
                diccionario(fecha.getMonth()) + " de " +
                fecha.getYear();
    }

    private String diccionario(Month month) {
        return meses.getOrDefault(month, "Mes desconocido");
    }
}
