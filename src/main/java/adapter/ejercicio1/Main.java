package adapter.ejercicio1;

public class Main {
    public static void main(String[] args) {
        MotorElectrico motorElectrico = new MotorElectricoConcreto();
        AdaptadorMotor motorAdaptador = new AdaptadorMotor(motorElectrico);
        //funcionalidades para probar el funcionamiento del adaptador
        motorAdaptador.arrancar();
        System.out.println("Velocidad actual: " + motorAdaptador.getVelocidadActual() + " km/h");
        motorAdaptador.acelerar(50);
        System.out.println("Velocidad actual: " + motorAdaptador.getVelocidadActual() + " km/h");
        motorAdaptador.decelerar(20);
        System.out.println("Velocidad actual: " + motorAdaptador.getVelocidadActual() + " km/h");
        motorAdaptador.frenar();
        System.out.println("Velocidad actual: " + motorAdaptador.getVelocidadActual() + " km/h");
    }
}
