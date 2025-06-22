package strategy.ejercicio1;

public class CorreoArgentino implements EnvioStrategy {
    private static final double MONTO_FIJO_CABA = 500.0;
    private static final double RESTO_DEL_PAIS = 800.0;
    private static final double DISTANCIA_CABA_GBA = 100.0;
    private static final double DISTANCIA_CABA_INTERIOR = 500.0;

    @Override
    public double calcularEnvio(Carrito carrito, Destinos destino) {
        double precioEnvio = 0.0;
        if (destino == Destinos.CAPITAL_FEDERAL) {
            precioEnvio = MONTO_FIJO_CABA;
        }
        if (destino == Destinos.GRAN_BUENOS_AIRES) {
            precioEnvio = RESTO_DEL_PAIS + 5 * DISTANCIA_CABA_GBA;
        } else {
            precioEnvio = RESTO_DEL_PAIS + 5 * DISTANCIA_CABA_INTERIOR;
        }
        return precioEnvio;
    }
}
