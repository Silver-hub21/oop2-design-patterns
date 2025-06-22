package observer.ejercicio2.model;

import observer.ejercicio2.pattern.Subscriber;
import observer.ejercicio2.persistencia.EmailSender;

public class Participante implements Subscriber {
    private final String nombre;
    private final String telefono;
    private final String region;
    private final String email;

    public Participante(String nombre, String telefono, String region, String email) throws RuntimeException {
        this.email = email;
        validarRegion(region);
        validarTelefono(telefono);
        validarNombre(nombre);
        this.nombre = nombre;
        this.telefono = telefono;
        this.region = region;
    }

    public String nombre() {
        return this.nombre;
    }

    public String telefono() {
        return this.telefono;
    }

    public String region() {
        return this.region;
    }


    private void validarTelefono(String telefono) {
        String regex = "\\d{4}-\\d{6}";
        if (!telefono.matches(regex)) {
            throw new RuntimeException("El formato del teléfono no es válido");
        }
    }

    private void validarNombre(String nombre) {
        if (nombre.isEmpty()) {
            throw new RuntimeException("El nombre no puede estar vacío");
        }
    }

    private void validarRegion(String region) {
        if (region.isEmpty()) {
            throw new RuntimeException("La región no puede estar vacía");
        }
//        if (!region.equals("US") || !region.equals("China") || !region.equals("Europa")) {
//            throw new RuntimeException("La región no es válida");
//        }
    }

    @Override
    public void update(String message) {
        Registro emailSender = new EmailSender();
        emailSender.registroDeParticipante(this, message);
    }

    public String email() {
        return this.email;
    }
}
