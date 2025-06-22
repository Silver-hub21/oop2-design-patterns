package composite.ejercicio2;

public class Tarea extends ItemDeTrabajo {
    public Tarea(String titulo, String descripcion, int horasEstimadas) {
        super(titulo, descripcion, horasEstimadas);
    }

    @Override
    public int horasTotales() {
        return this.horasEstimadas();
    }
}
