package strategy.ejercicio1;

public class ColectivosSur implements EnvioStrategy {
    private static final double MONTO_FIJO_CABA = 1000.0;
    private static final double MONTO_FIJO_GBA = 1500.0;
    private static final double MONTO_FIJO_INTERIOR = 3000.0;

    @Override
    public double calcularEnvio(Carrito carrito, Destinos destino) {
        double precioEnvio = 0.0;
        if (destino == Destinos.CAPITAL_FEDERAL) {
            precioEnvio = MONTO_FIJO_CABA;
        }
        if (destino == Destinos.GRAN_BUENOS_AIRES) {
            precioEnvio = MONTO_FIJO_GBA;
        }
        if (destino == Destinos.INTERIOR) {
            precioEnvio = MONTO_FIJO_INTERIOR;
        }
        if (carrito.pesoTotal() < 30 && carrito.pesoTotal() >= 5) {
            precioEnvio += 500.0;
        }
        if (carrito.pesoTotal() >= 30) {
            precioEnvio += 2000.0;
        }
        return precioEnvio;
    }
}
