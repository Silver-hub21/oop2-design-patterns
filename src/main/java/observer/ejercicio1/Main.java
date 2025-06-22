package observer.ejercicio1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClimaOnline clima = new WeatherChannelService();
        ClimaObserver notificadorClima = new ClimaPorConsola();
        ClimaObserver notificadorArchivo = new ClimaPorArchivo();
        List<ClimaObserver> observers = List.of(notificadorClima, notificadorArchivo);
        Medidor medidor = new Medidor(clima, observers);
        medidor.leerTemperatura();
    }
}
