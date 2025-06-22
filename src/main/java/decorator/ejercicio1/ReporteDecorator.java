package decorator.ejercicio1;

import java.io.File;

public abstract class ReporteDecorator implements ReporteManager {
    private ReporteManager reporte;

    public ReporteDecorator(ReporteManager reporteManager) {
        this.reporte = reporteManager;
    }

    @Override
    public void export(File file) {
        validar(file);
        reporte.export(file);
    }

    public abstract void validar(File file) throws IllegalArgumentException;
}
