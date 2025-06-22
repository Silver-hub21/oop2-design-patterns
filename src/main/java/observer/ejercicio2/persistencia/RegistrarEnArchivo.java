package observer.ejercicio2.persistencia;

import observer.ejercicio2.model.Participante;
import observer.ejercicio2.model.Registro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrarEnArchivo implements Registro {

    @Override
    public void registroDeParticipante(Participante participante, String msj) {
        File file = new File("participantes.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("Nombre: " + participante.nombre() + ", Telefono: "
                    + participante.telefono() + ", Region: " + participante.region() +
                    ", Email: " + participante.email());
            writer.write(msj);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}




