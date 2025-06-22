package proxy.ejercicio1;

import java.sql.*;
import java.util.*;

public class ProxyTelefono implements Set<Telefono> {
    private static final String URL = "jdbc:mysql://localhost:3306/ejercicio_proxy";
    private static final String USUARIO = "root";
    private static final String CLAVE = "s1lver@45209_340";
    private Set<Telefono> telefonos;
    private boolean cargado = false;
    private final int idPersona;

    public ProxyTelefono(int idPersona) {
        this.idPersona = idPersona;
        this.telefonos = new HashSet<>();
    }

    private void cargarTelefonos() {
        if (cargado) return;

        String sql = "SELECT numero FROM telefonos WHERE persona_id = ?";
        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idPersona);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                String numero = result.getString("numero");
                telefonos.add(new Telefono(numero));
            }

            cargado = true;

        } catch (SQLException e) {
            throw new RuntimeException("Error cargando teléfonos: " + e.getMessage());
        }
    }

    private Connection obtenerConexion() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar con la base de datos: " + e.getMessage(), e);
        }
    }

    // Métodos que disparan la carga
    @Override
    public int size() {
        cargarTelefonos();
        return telefonos.size();
    }

    @Override
    public boolean isEmpty() {
        cargarTelefonos();
        return telefonos.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        cargarTelefonos();
        return telefonos.contains(o);
    }

    @Override
    public Iterator<Telefono> iterator() {
        cargarTelefonos();
        return telefonos.iterator();
    }

    @Override
    public Object[] toArray() {
        cargarTelefonos();
        return telefonos.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        cargarTelefonos();
        return telefonos.toArray(a);
    }

    @Override
    public boolean add(Telefono telefono) {
        cargarTelefonos();
        return telefonos.add(telefono);
    }

    @Override
    public boolean remove(Object o) {
        cargarTelefonos();
        return telefonos.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        cargarTelefonos();
        return telefonos.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Telefono> c) {
        cargarTelefonos();
        return telefonos.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        cargarTelefonos();
        return telefonos.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        cargarTelefonos();
        return telefonos.removeAll(c);
    }

    @Override
    public void clear() {
        cargarTelefonos();
        telefonos.clear();
    }
}
