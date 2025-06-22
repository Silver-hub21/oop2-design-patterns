package decorator.ejercicio3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Concurso {
    private int id_concurso;
    private LocalDateTime fecha_inicio;
    private LocalDateTime fecha_cierre;
    private ArrayList<Inscripcion> inscripciones;
    private RegistrarInscripcion registro;
    private static int contadorConcurso = 0;

    public Concurso(LocalDateTime fecha_inicio, LocalDateTime fecha_cierre, ArrayList<Inscripcion> inscripciones, RegistrarInscripcion registro) {
        this.id_concurso = ++contadorConcurso;
        this.fecha_inicio = fecha_inicio;
        this.fecha_cierre = fecha_cierre;
        this.inscripciones = inscripciones;
        this.registro = registro;
    }

    public boolean estaInscripto(Participante participante) {
        return inscripciones.stream()
                .anyMatch(inscripcion -> inscripcion.esElParticipante(participante));
    }


    public void inscribir(Inscripcion nuevaInscripcion) throws RuntimeException {
        if (nuevaInscripcion.estaEnFecha(fecha_inicio, fecha_cierre)) {
            inscripciones.add(nuevaInscripcion);
            nuevaInscripcion.esMismaFecha(fecha_inicio);

            String datos = nuevaInscripcion.datosDeInscripcion() + id_concurso;
            registro.registrar(datos);

        } else {
            throw new RuntimeException("El plazo de inscripción ya finalizó.");
        }
    }
}
