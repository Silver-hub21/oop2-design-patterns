package composite.ejercicio2;

public class HistoriaDeUsuario extends ItemDeTrabajo {

    public HistoriaDeUsuario(String titulo, String descripcion, int horasEstimadas) {
        super(titulo, descripcion, horasEstimadas);

    }

    @Override
    public int horasTotales() {
        int total = this.horasEstimadas();
        if (super.subItems() != null) {
            for (ItemDeTrabajo subItem : super.subItems()) {
                total += subItem.horasEstimadas();
            }
        }
        return total;
    }
}
