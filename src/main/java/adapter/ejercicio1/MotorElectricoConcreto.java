package adapter.ejercicio1;

public class MotorElectricoConcreto implements MotorElectrico {

    @Override
    public void conectar() {
        System.out.println("Conectando motor electrico...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando motor electrico...");
    }

    @Override
    public void activar() {
        System.out.println("Activando motor electrico...");
    }

    @Override
    public void moverMasRapido(int incremento, int potencia) {
        System.out.println("Moviendo motor electrico a velocidad incrementada de " + incremento + " con potencia de " + potencia);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo motor electrico...");
    }
}
