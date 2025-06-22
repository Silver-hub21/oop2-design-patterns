package adapter.ejercicio1;

public class AdaptadorMotor implements MotorComun, MotorEconomico {
    private MotorElectrico motorElectrico;
    private int velocidadActual;
    private int ultimaAceleracion;
    private static final int POTENCIA_PROMEDIO = 100;

    public AdaptadorMotor(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
        this.velocidadActual = 0;
        this.ultimaAceleracion = 0;
    }

    @Override
    public void arrancar() {
        this.motorElectrico.activar();
    }

    @Override
    public void frenar() {
        this.motorElectrico.detener();
    }

    @Override
    public void acelerar(int incremento) {
        if (incremento < 0) {
            System.out.println("No se puede acelerar con un valor negativo.");
            return;
        }
        this.motorElectrico.moverMasRapido(incremento, POTENCIA_PROMEDIO);
        this.velocidadActual = incremento;
        this.ultimaAceleracion = incremento;
    }

    @Override
    public void decelerar(int decremento) {
        if (decremento < 0) {
            System.out.println("No se puede desacelerar con un valor negativo.");
            return;
        }
        this.motorElectrico.moverMasRapido(-decremento, POTENCIA_PROMEDIO);
        if (this.velocidadActual < 0) {
            System.out.println("No se puede desacelerar más allá de 0 km/h.");
            this.velocidadActual = 0; // No se puede aplicar una desaceleración negativa
        }
        this.velocidadActual -= decremento;
    }

    @Override
    public int getVelocidadActual() {
        return velocidadActual;
    }

    @Override
    public String getTipoMotor() {
        return "";
    }
}
