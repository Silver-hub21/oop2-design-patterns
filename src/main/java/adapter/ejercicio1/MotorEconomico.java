package adapter.ejercicio1;

public interface MotorEconomico {
    void arrancar();

    void frenar();

    void acelerar(int incremento);

    void decelerar(int decremento);

    int getVelocidadActual();

    String getTipoMotor();
}
