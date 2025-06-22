package adapter.ejercicio1;

public interface MotorElectrico {
    void conectar();

    void desconectar();

    void activar();

    void moverMasRapido(int incremento, int potencia);

    void detener();
}
