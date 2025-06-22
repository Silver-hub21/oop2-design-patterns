package composite.ejercicio3;

public class Seguro extends SeguroComponente {

    public Seguro(String titulo, String descripcion, double costo, int duracion) {
        super(titulo, descripcion, costo, duracion);
    }

    @Override
    public double costoTotal() {
        return costo();
    }
}
