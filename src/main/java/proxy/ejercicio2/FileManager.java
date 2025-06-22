package proxy.ejercicio2;

public interface FileManager {
    void verificarPermisos(Usuario usuario) throws Exception;

    String readFile() throws Exception;

}
