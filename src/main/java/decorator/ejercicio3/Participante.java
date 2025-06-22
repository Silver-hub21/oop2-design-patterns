package decorator.ejercicio3;

public class Participante {
    private String nombre;
    private String apellido;
    private double puntaje;
    private int id_participante;
    private static int id = 0;

    public Participante(String nombre, String apellido, double puntaje) {
        this.id_participante = ++id;
        validarNombreApellido(nombre, apellido);
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntaje = 0;
    }

    public String datos() {
        return String.format("%s,%s,%s", id_participante, nombre, apellido);
    }

    public void sumarPuntos(double puntos) {

        this.puntaje += puntos;
    }

    public void restarPuntos(double puntos) {

        this.puntaje -= puntos;
    }

    public double puntaje() {
        return puntaje;
    }

    private void validarNombreApellido(String nombre, String apellido) {
        if (nombre.isBlank() || apellido.isBlank()) {
            throw new IllegalArgumentException("El nombre y/o apellido no pueden estar vacíos");
        }
    }
}
