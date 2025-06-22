package adapter.ejercicio1;

public class Motor implements MotorComun, MotorEconomico {
    private int velocidadActual;
    private int ultimaAceleracion;

    public Motor() {
        this.velocidadActual = 0;
        this.ultimaAceleracion = 0;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el motor...");
    }

    @Override
    public void frenar() {
        System.out.println("Deteniendo el motor...");
    }

    @Override
    public void acelerar(int incremento) {
        System.out.println("Acelerando el motor en " + incremento + " km/h...");
        this.ultimaAceleracion = incremento;
    }

    @Override
    public void decelerar(int decremento) {
        System.out.println("Desacelerando el motor en " + decremento + " km/h...");
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede desacelerar más allá de 0 km/h.");
            this.ultimaAceleracion = 0; // No se puede aplicar una desaceleración negativa
        } else {
            this.ultimaAceleracion = -decremento;
        }
    }

    @Override
    public int getVelocidadActual() {
        return velocidadActual + ultimaAceleracion;
    }

    @Override
    public String getTipoMotor() {
        return "";
    }
}
