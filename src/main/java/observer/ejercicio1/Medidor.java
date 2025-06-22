package observer.ejercicio1;

import java.util.List;

public class Medidor {
    private String temperatura;
    private ClimaOnline clima;
    private List<ClimaObserver> observer;

    public Medidor(ClimaOnline clima, List<ClimaObserver> observer) {
        this.clima = clima;
        this.observer = observer;
    }

    public void leerTemperatura() {
        this.temperatura = this.clima.temperatura();
        for (ClimaObserver o : observer) {
            o.actualizar(this.temperatura);
        }
    }
}
