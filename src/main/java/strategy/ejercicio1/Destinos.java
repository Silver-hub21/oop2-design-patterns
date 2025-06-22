package strategy.ejercicio1;

public enum Destinos {
    CAPITAL_FEDERAL("Capital Federal"),
    GRAN_BUENOS_AIRES("Gran Buenos Aires"),
    INTERIOR("Interior");

    private final String descripcion;

    Destinos(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
