package composite.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemDeTrabajo {
    private String titulo;
    private String descripcion;
    private int horasEstimadas;
    private List<ItemDeTrabajo> subItems;

    public ItemDeTrabajo(String titulo, String descripcion, int horasEstimadas) {
        validarDescripcion(descripcion);
        validarTitulo(titulo);
        validarHorasEstimadas(horasEstimadas);
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.horasEstimadas = horasEstimadas;
        this.subItems = new ArrayList<>();
    }

    public String titulo() {
        return titulo;
    }

    public String descripcion() {
        return descripcion;
    }

    public int horasEstimadas() {
        return horasEstimadas;
    }

    public List<ItemDeTrabajo> subItems() {
        return subItems;
    }

    public void agregarSubItem(ItemDeTrabajo subItem) {
        if (subItems == null) {
            subItems = new java.util.ArrayList<>();
        }
        subItems.add(subItem);
    }

    public void eliminarSubItem(ItemDeTrabajo subItem) {
        if (subItems != null) {
            subItems.remove(subItem);
        }
    }

    public abstract int horasTotales();

    private void validarTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("El título no puede ser nulo o vacío.");
        }
    }

    private void validarDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede ser nula o vacía.");
        }
    }

    private void validarHorasEstimadas(int horasEstimadas) {
        if (horasEstimadas <= 0) {
            throw new IllegalArgumentException("Las horas estimadas deben ser mayores que cero.");
        }
    }


}
