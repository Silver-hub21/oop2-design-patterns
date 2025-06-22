package decorator.ejercicio1;

import java.io.*;

public class ReporteDecoratorFlexible extends ReporteDecorator {

    public ReporteDecoratorFlexible(ReporteManager reporte) {
        super(reporte);
    }

    @Override
    public void validar(File file) throws IllegalArgumentException {
        if (file.exists()) {
            System.out.println("El archivo ya existe, se sobreescribirá.");
        }
    }

}


