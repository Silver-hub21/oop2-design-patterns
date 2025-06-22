package composite.ejercicio2;

import java.util.List;

public class ProyectoScrum {
    private String nombre;
    private List<ItemDeTrabajo> itemsDeTrabajo;

    public ProyectoScrum(String nombre, List<ItemDeTrabajo> itemsDeTrabajo) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del proyecto no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
        this.itemsDeTrabajo = itemsDeTrabajo;
    }

    public String nombre() {
        return nombre;
    }

    public List<ItemDeTrabajo> ItemsDeTrabajo() {
        return itemsDeTrabajo;
    }

    public int horasTotales() {
        int totalHoras = 0;
        for (ItemDeTrabajo i : itemsDeTrabajo) {
            totalHoras += i.horasTotales();
        }
        return totalHoras;
    }
}
