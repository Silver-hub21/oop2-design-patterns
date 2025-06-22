package composite.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public abstract class SeguroComponente {
    private String titulo;
    private String descripcion;
    private double costo;
    private int duracion; // Duración en meses
    private List<SeguroComponente> subSeguros;

    public SeguroComponente(String titulo, String descripcion, double costo, int duracion) {
        validarTitulo(titulo);
        validarDescripcion(descripcion);
        validarCosto(costo);
        validarDuracion(duracion);

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.duracion = duracion;
        this.subSeguros = new ArrayList<>();
    }

    public String titulo() {
        return titulo;
    }

    public String descripcion() {
        return descripcion;
    }

    public double costo() {
        return costo;
    }

    public int duracion() {
        return duracion;
    }

    public List<SeguroComponente> subSeguros() {
        return subSeguros;
    }

    public void agregarSubSeguro(SeguroComponente subSeguro) {
        if (subSeguros == null) {
            subSeguros = new ArrayList<>();
        }
        subSeguros.add(subSeguro);
    }

    public void eliminarSubSeguro(SeguroComponente subSeguro) {
        if (subSeguros != null) {
            subSeguros.remove(subSeguro);
        }
    }

    public abstract double costoTotal();


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

    private void validarCosto(double costo) {
        if (costo < 0) {
            throw new IllegalArgumentException("El costo no puede ser negativo.");
        }
    }

    private void validarDuracion(int duracion) {
        if (duracion <= 0) {
            throw new IllegalArgumentException("La duración debe ser mayor a cero.");
        }
    }


}
