package proxy.ejercicio1;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class PersonaDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/ejercicio_proxy";
    private static final String USUARIO = "root";
    private static final String CLAVE = "s1lver@45209_340";

    private Connection obtenerConexion() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar con la base de datos: " + e.getMessage(), e);
        }
    }

    public Persona personaPorId(int id) {
        String sql = "SELECT nombre FROM personas WHERE id = ?";
        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                String nombre = result.getString("nombre");

                Set<Telefono> proxyTelefonos = new ProxyTelefono(id);

                return new Persona(id, nombre, proxyTelefonos);
            } else {
                throw new RuntimeException("No se encontró persona");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
