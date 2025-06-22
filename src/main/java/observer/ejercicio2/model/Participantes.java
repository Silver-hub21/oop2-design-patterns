package observer.ejercicio2.model;

import observer.ejercicio2.pattern.Publisher;
import observer.ejercicio2.pattern.Subscriber;

public class Participantes implements Publisher {
    private Registro registroDeParticipantes;

    public Participantes(Registro registroDeParticipantes) {

        this.registroDeParticipantes = registroDeParticipantes;
    }

    public void nuevoParticipante(String nombre, String telefono, String region, String email) {
        var participante = new Participante(nombre, telefono, region, email);
        String datos = "Nombre: " + participante.nombre() + ", Telefono: " + participante.telefono() + ", Region: " + participante.region() + ", Email: " + participante.email();
        this.registroDeParticipantes.registroDeParticipante(participante, datos);
        notificar(participante, datos);
    }

    @Override
    public void notificar(Subscriber subscriber, String datos) {
        String message = "Nuevo participante agregado: " + "\n" + datos;
        subscriber.update(message);
    }
}

