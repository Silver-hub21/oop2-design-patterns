package proxy.ejercicio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Aquí puedes probar el código creando instancias de Usuario, Permiso y FileAccess
        // y llamando a los métodos correspondientes.

        // Ejemplo de creación de un usuario con permisos
        Usuario usuario = new Usuario("Juan", List.of(Permiso.BASICO));

        // Crear una instancia de FileAccess
        FileManager fileController = new FileProxy("C:\\Users\\Sebas Acosta\\Desktop\\", "importante archivo.txt");

        try {
            // Verificar permisos del usuario
            fileController.verificarPermisos(usuario);

            // Leer el archivo
            String contenido = fileController.readFile();
            System.out.println(contenido);
        } catch (Exception e) {
            System.out.println("Error al acceder al archivo: " + e.getMessage());
        }
    }
}
