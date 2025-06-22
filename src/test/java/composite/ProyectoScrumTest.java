package composite;

import composite.ejercicio2.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProyectoScrumTest {
    @Test
    public void proyectoSinSpikes() {

        ItemDeTrabajo historia1 = new HistoriaDeUsuario("Historia 1", "Descripción de la historia 1", 5);
        historia1.agregarSubItem(new Tarea("Subhistoria 1.1", "Descripción de la subhistoria 1.1", 3));
        historia1.agregarSubItem(new Tarea("Subhistoria 1.2", "Descripción de la subhistoria 1.2", 2));
        historia1.agregarSubItem(new Tarea("Subhistoria 1.3", "Descripción de la subhistoria 1.3", 4));

        ItemDeTrabajo historia2 = new HistoriaDeUsuario("Historia 2", "Descripción de la historia 2", 8);
        historia2.agregarSubItem(new Tarea("Subhistoria 2.1", "Descripción de la subhistoria 2.1", 5));
        historia2.agregarSubItem(new Tarea("Subhistoria 2.2", "Descripción de la subhistoria 2.2", 3));

        var proyecto = new ProyectoScrum("Proyecto sin Spikes", List.of(historia1, historia2));


        assertEquals(30, proyecto.horasTotales());
    }

    @Test
    public void proyectoConSpikes() {

        ItemDeTrabajo historia1 = new HistoriaDeUsuario("Historia 1", "Descripción de la historia 1", 5);
        historia1.agregarSubItem(new Tarea("Subhistoria 1.1", "Descripción de la subhistoria 1.1", 3));
        historia1.agregarSubItem(new Tarea("Subhistoria 1.2", "Descripción de la subhistoria 1.2", 2));
        historia1.agregarSubItem(new Tarea("Subhistoria 1.3", "Descripción de la subhistoria 1.3", 4));

        ItemDeTrabajo historia2 = new HistoriaDeUsuario("Historia 2", "Descripción de la historia 2", 8);
        historia2.agregarSubItem(new Tarea("Subhistoria 2.1", "Descripción de la subhistoria 2.1", 5));
        historia2.agregarSubItem(new Tarea("Subhistoria 2.2", "Descripción de la subhistoria 2.2", 3));
        historia2.agregarSubItem(new TareaSpike("Spike", "Investigación técnica necesaria", 10));

        var proyecto = new ProyectoScrum("Proyecto con Spikes", List.of(historia1, historia2));

        assertEquals(40, proyecto.horasTotales());
    }

}
