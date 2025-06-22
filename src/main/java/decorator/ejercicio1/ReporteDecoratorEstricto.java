package decorator.ejercicio1;

import java.io.File;

public class ReporteDecoratorEstricto extends ReporteDecorator {

    public ReporteDecoratorEstricto(ReporteManager reporte) {
        super(reporte);
    }

    @Override
    public void validar(File file) throws IllegalArgumentException {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
    }
}

