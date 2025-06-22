package adapter.ejercicio1;

public interface MotorComun {
    void arrancar();

    void frenar();

    void acelerar(int incremento);

    void decelerar(int decremento);

    int getVelocidadActual();

    String getTipoMotor();
}
