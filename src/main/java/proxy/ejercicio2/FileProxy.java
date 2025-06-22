package proxy.ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProxy implements FileManager {
    private final String ruta;
    private final String nombreArchivo;

    public FileProxy(String ruta, String nombre) {
        this.ruta = ruta;
        this.nombreArchivo = nombre;
    }

    public String readFile() throws IOException {
        return Files.readString(Paths.get(this.ruta + "/" + this.nombreArchivo));
    }

    @Override
    public void verificarPermisos(Usuario usuario) throws Exception {
        if (nombreArchivo.startsWith("i") && !usuario.poseePermiso(Permiso.ADMINISTRADOR)) {
            throw new Exception("No tiene permisos para acceder a este archivo");
        }
        if (nombreArchivo.startsWith("m") && usuario.poseePermiso(Permiso.BASICO)) {
            throw new Exception("No tiene permisos para acceder a este archivo");
        }
    }
}
