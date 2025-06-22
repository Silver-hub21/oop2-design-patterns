package proxy.ejercicio2;

public enum Permiso {
    BASICO("Basico"),
    ADMINISTRADOR("Administrador"),
    INTERMEDIO("Intermedio");

    private final String descripcion;

    Permiso(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}