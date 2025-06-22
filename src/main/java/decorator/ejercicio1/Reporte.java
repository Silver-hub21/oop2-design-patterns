package decorator.ejercicio1;

import java.io.*;

public class Reporte implements ReporteManager {
    private String reporte;

    public Reporte(String reporte) {
        this.reporte = reporte;
    }

    public String reporte() {
        return reporte;
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(reporte);
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
