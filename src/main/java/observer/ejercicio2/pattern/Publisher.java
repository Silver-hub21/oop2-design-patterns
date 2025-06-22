package observer.ejercicio2.pattern;

public interface Publisher {
    void notificar(Subscriber subscriber, String datos);
}
