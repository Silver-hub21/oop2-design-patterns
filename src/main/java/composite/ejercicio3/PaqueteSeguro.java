package composite.ejercicio3;

public class PaqueteSeguro extends SeguroComponente {
    private static final double DESCUENTO = 5; // 5% de descuento

    public PaqueteSeguro(String titulo, String descripcion, int duracion) {
        super(titulo, descripcion, 0, duracion);
    }

    @Override
    public double costoTotal() {
        double total = costo();
        for (SeguroComponente subSeguro : subSeguros()) {
            total += subSeguro.costoTotal() * (1 - (DESCUENTO * subSeguros().size()) / 100);
        }
        return total;
    }

}
