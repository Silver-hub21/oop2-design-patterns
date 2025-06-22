package observer.ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ClimaPorArchivo implements ClimaObserver {

    @Override
    public void actualizar(String temperatura) {
        File f = new File("temperatura.txt");
        try (FileWriter writer = new FileWriter(f, true)) {
            writer.write("Temperatura actualizada: " + temperatura + " el: " + LocalDateTime.now() + "\n");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
